package com.marcomm.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class TransaksiDesignItem {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)	
	private int id;
	
	@Column(name="t_design_id")
	private int tDesignId;
	
	@Column(name="m_product_id")
	private int mProductId;
	
	@Column(name="title_item")
	private String titleItem;
	
	@Column(name="request_pic")
	private int requestPic;
	
	@Column(name="start_date")
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@Column(name="end_date")
	@Temporal(TemporalType.DATE)
	private Date endDate;
	
	@Column(name="request_due_date")
	@Temporal(TemporalType.DATE)
	private Date requestDueDate;
	
	private String note;
	
	@Column(name="is_delete",columnDefinition="number(1,0) default 0",nullable=false)
	private boolean isDelete;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="created_date")
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	@Column(name="updated_by")
	private String updatedBy;
	
	@Column(name="updated_date")
	@Temporal(TemporalType.DATE)
	private Date updatedDate;
	
	public TransaksiDesignItem() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int gettDesignId() {
		return tDesignId;
	}
	public void settDesignId(int tDesignId) {
		this.tDesignId = tDesignId;
	}
	public int getmProductId() {
		return mProductId;
	}
	public void setmProductId(int mProductId) {
		this.mProductId = mProductId;
	}
	public String getTitleItem() {
		return titleItem;
	}
	public void setTitleItem(String titleItem) {
		this.titleItem = titleItem;
	}
	public int getRequestPic() {
		return requestPic;
	}
	public void setRequestPic(int requestPic) {
		this.requestPic = requestPic;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getRequestDueDate() {
		return requestDueDate;
	}
	public void setRequestDueDate(Date requestDueDate) {
		this.requestDueDate = requestDueDate;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
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
