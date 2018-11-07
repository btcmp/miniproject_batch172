package com.marcomm.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="M_PRODUCT")
public class MasterProduct {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(columnDefinition="number(11)")
	private int id;
	
	@Column(unique=true,nullable=false,length=50)
	private String code;
	
	@Column(name="name",nullable=false,length=50)
	private String name;
	
	@Column(name="description",length=255)
	private String description;
	
	@Column(name="is_delete",columnDefinition="number(1,0) default 0",nullable=false)
	private boolean isDelete;
	
	@Column(name="created_by",nullable=false,length=50)
	private String createdBy;
	
	@Column(name="created_date",nullable=false)
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	@Column(name="updated_by",length=50)
	private String updatedBy;
	
	@Column(name="updated_date")
	@Temporal(TemporalType.DATE)
	private Date updatedDate;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="masterProduct")
	private List<TransaksiDesignItem> transaksiDesignItems;
	
	public List<TransaksiDesignItem> getTransaksiDesignItems() {
		return transaksiDesignItems;
	}
	
	public void setTransaksiDesignItems(List<TransaksiDesignItem> transaksiDesignItems) {
		this.transaksiDesignItems = transaksiDesignItems;
	}
	
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
