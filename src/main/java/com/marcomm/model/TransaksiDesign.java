package com.marcomm.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "T_Design")
public class TransaksiDesign {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	@Column(length=50,nullable=false)
	private String code;

	@Column(name = "title_header")
	private String titleHeader;

	@Column(name = "request_by")
	private String requestBy;

	@Column(name = "request_date")
	@Temporal(TemporalType.DATE)
	private Date requestDate;

	@Column(name = "approved_by")
	private String approvedBy;

	@Column(name = "approved_date")
	@Temporal(TemporalType.DATE)
	private Date approvedDate;

	@Column(name = "assign_to")
	private int assignTo;

	@Column(name = "closed_date")
	@Temporal(TemporalType.DATE)
	private Date closeDate;

	private String note;
	private String status;

	@Column(name = "reject_reason")
	private String rejectReason;

	@Column(name = "is_delete",columnDefinition="number(1,0) default 0",nullable=false)
	private boolean isDelete;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	@Temporal(TemporalType.DATE)
	private Date createdDate;

	@Column(name = "updated_by")
	private String updatedBy;

	@Column(name = "updated_date")
	@Temporal(TemporalType.DATE)
	private Date updatedDate;
	
	@OneToOne
	@JsonManagedReference
	@JoinColumn(name="t_event_id",unique=true)
	private TransaksiEvent transaksiEvent;

	@OneToMany(fetch=FetchType.LAZY,mappedBy="transaksiDesign")
	private List<TransaksiDesignItem> transaksiDesignItems;
	
	public TransaksiEvent getTransaksiEvent() {
		return transaksiEvent;
	}

	public void setTransaksiEvent(TransaksiEvent transaksiEvent) {
		this.transaksiEvent = transaksiEvent;
	}
	
	public List<TransaksiDesignItem> getTransaksiDesignItems() {
		return transaksiDesignItems;
	}

	public void setTransaksiDesignItems(List<TransaksiDesignItem> transaksiDesignItems) {
		this.transaksiDesignItems = transaksiDesignItems;
	}

	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
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

	public String getTitleHeader() {
		return titleHeader;
	}

	public void setTitleHeader(String titleHeader) {
		this.titleHeader = titleHeader;
	}

	public String getRequestBy() {
		return requestBy;
	}

	public void setRequestBy(String requestBy) {
		this.requestBy = requestBy;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public String getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public Date getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}

	public int getAssignTo() {
		return assignTo;
	}

	public void setAssignTo(int assignTo) {
		this.assignTo = assignTo;
	}

	public Date getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRejectReason() {
		return rejectReason;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	public boolean isDelete() {
		return isDelete;
	}

	public void setIsDelete(boolean isDelete) {
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

 

 
	
	
	//getter and setter
	
	
	
	
	
}