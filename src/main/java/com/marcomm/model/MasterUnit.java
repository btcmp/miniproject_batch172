package com.marcomm.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="M_UNIT")
public class MasterUnit {
	//id
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	//code --->baca dulu tentang hql
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String code;
	//name
	@Column(length=50, nullable=false, unique=true)
	private String name;
	//description
	@Column
	private String description;
	//isDelete
	@Column(name="is_delete", nullable=false)
	private boolean isDelete;
	//created by
	@Column(name="created_by", length=50, nullable=false)
	private String createdBy;
	//created date
	@Column(name="created_date", nullable=false)
	private Date createdDate;
	//updated by
	@Column(name="updated_by", length=50)
	private String updatedBy;
	//update date
	@Column(name="updated_date")
	private Date updatedDate;
	
	
	/* SETTER DAN GETTER */
	
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
