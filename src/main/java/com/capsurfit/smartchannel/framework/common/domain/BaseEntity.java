/**
 * 
 */
package com.capsurfit.smartchannel.framework.common.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author anushka
 * 
 */
public abstract class BaseEntity implements Serializable {
	private String entityAuxiliaryId;
	private String createdBy;
	private String createdUserName;
	private Date createdDatetime;
	private String modifiedBy;
	private String modifiedUserName;
	private Date modifiedDatetime;
	private Boolean mergeRequired = Boolean.FALSE;

	public String getEntityAuxiliaryId() {
		return entityAuxiliaryId;
	}

	public void setEntityAuxiliaryId(String entityAuxiliaryId) {
		this.entityAuxiliaryId = entityAuxiliaryId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedUserName() {
		return createdUserName;
	}

	public void setCreatedUserName(String createdUserName) {
		this.createdUserName = createdUserName;
	}

	public Date getCreatedDatetime() {
		return createdDatetime;
	}

	public void setCreatedDatetime(Date createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getModifiedUserName() {
		return modifiedUserName;
	}

	public void setModifiedUserName(String modifiedUserName) {
		this.modifiedUserName = modifiedUserName;
	}

	public Date getModifiedDatetime() {
		return modifiedDatetime;
	}

	public void setModifiedDatetime(Date modifiedDatetime) {
		this.modifiedDatetime = modifiedDatetime;
	}

	public Boolean getMergeRequired() {
		return mergeRequired;
	}

	public void setMergeRequired(Boolean mergeRequired) {
		this.mergeRequired = mergeRequired;
	}

	public abstract Object getEntityId();

}
