package com.capsurfit.smartchannel.framework.base.dao;

import com.capsurfit.smartchannel.framework.common.domain.QueryContext;
import com.capsurfit.smartchannel.framework.common.shared.CoreConstants;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.math.BigDecimal;
import java.util.List;

public class BaseHibernateDaoSupport extends HibernateDaoSupport {
	protected String toLikeFormat(String value) {
		return value == null ? null : value
				+ CoreConstants.Symbol.PERCENTAGE.getValue();
	}

	protected List getResults(QueryContext queryContext) {
        //TODO APPLYING TOTAL ROW COUNT
		Query query = getSession().getNamedQuery(queryContext.getQueryName());
		// TODO APPLY SORTING
		queryContext.applyQueryParameters(query);

		// TODO APPLY PAGINATION
		return query.list();
	}

	protected Long getTotalRowCount(QueryContext queryContext) {
		try {
			StringBuilder mistQuery = new StringBuilder();
			mistQuery.append("select count(*) from ( ");
			mistQuery.append(queryContext.getQueryName());
			mistQuery.append(" ) ");

			Query query = getSession().createQuery(mistQuery.toString());
			queryContext.applyQueryParameters(query);

			return new BigDecimal(query.uniqueResult().toString()).longValue();
		} catch (Exception exception) {
			throw new RuntimeException("Unable to get the total result count",
					exception);
		}

	}

}
