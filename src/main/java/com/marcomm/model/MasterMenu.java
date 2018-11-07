package com.marcomm.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ResultCheckStyle;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@SQLDelete(sql="UPDATE M_MENU SET is_delete =1 WHERE id=?")
@Table(name="M_MENU")
public class MasterMenu {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	@Column(unique=true,nullable=false,length=50)
	private String code;
	@Column(name="name",nullable=false,length=50)
	private String name;
	@Column(name="controller",nullable=false,length=150)
	private String controller;
	@Column(name="parent_id")
	private int parentId;
	@Column(name="is_delete",columnDefinition="number(1,0) default 0",nullable=false)
	private boolean isDelete;
	@Column(name="created_by",nullable=false,length=50)
	private String createdBy;
	@Column(name="created_date",nullable=false)
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	@Column(name="updated_by")
	private String updatedBy;
	@Column(name="updated_date")
	@Temporal(TemporalType.DATE)
	private Date updatedDate;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="menu", cascade=CascadeType.ALL, orphanRemoval=true)
	private List<MasterMenuAccess> access;
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
	public String getController() {
		return controller;
	}
	public void setController(String controller) {
		this.controller = controller;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
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
	public List<MasterMenuAccess> getAccess() {
		return access;
	}
	public void setAccess(List<MasterMenuAccess> access) {
		this.access = access;
	}
	
		
}
