package com.capsurfit.smartchannel.framework.common.domain;

import org.hibernate.Query;

public abstract class QueryContext {
	private String queryName;
	private Class entityClass;
	private String defaultSortProperty;
	private boolean isSortingRequired;
	private boolean isPaginationRequired;

	public String getQueryName() {
		return queryName;
	}

	public void setQueryName(String queryName) {
		this.queryName = queryName;
	}

	public Class getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(Class entityClass) {
		this.entityClass = entityClass;
	}

	public String getDefaultSortProperty() {
		return defaultSortProperty;
	}

	public void setDefaultSortProperty(String defaultSortProperty) {
		this.defaultSortProperty = defaultSortProperty;
	}

	public boolean isSortingRequired() {
		return isSortingRequired;
	}

	public void setSortingRequired(boolean isSortingRequired) {
		this.isSortingRequired = isSortingRequired;
	}

	public boolean isPaginationRequired() {
		return isPaginationRequired;
	}

	public void setPaginationRequired(boolean isPaginationRequired) {
		this.isPaginationRequired = isPaginationRequired;
	}

	public abstract void applyQueryParameters(Query query);
}
