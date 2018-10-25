package com.marcomm.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="M_PRODUCT")
public class MasterProduct {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	@Column(unique=true)
	//@NotEmpty
	private String code;
	@Column(name="name",unique=true)
	//@NotEmpty
	private String name;
	@Column(name="description")
	private String description;
	@Column(name="is_delete",columnDefinition="number(1,0) default 0")
	//@NotEmpty
	private boolean isDelete;
	@Column(name="created_by")
	//@NotEmpty
	private String createdBy;
	@Column(name="created_date")
	@Temporal(TemporalType.DATE)
	//@NotEmpty
	private Date createdDate;
	@Column(name="updated_by")
	private String updatedBy;
	@Column(name="updated_date")
	@Temporal(TemporalType.DATE)
	private Date updatedDate;
	
	public MasterProduct() {
	}
	public MasterProduct(String code, String name, String description, boolean isDelete, String createdBy,
			Date createdDate, String updatedBy, Date updatedDate) {
		super();
		this.code = code;
		this.name = name;
		this.description = description;
		this.isDelete = isDelete;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}
	public MasterProduct(int id) {
		super();
		this.id = id;
	}
	public MasterProduct(int id, String code, String name, String description, boolean isDelete, String createdBy,
			Date createdDate, String updatedBy, Date updatedDate) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.description = description;
		this.isDelete = isDelete;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isDelete() {
		return isDelete;
	}
	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
}
