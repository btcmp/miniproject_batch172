package com.marcomm.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name="T_EVENT")
public class TransaksiEvent {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	
	@NotNull
	private String code;
	
	@NotNull
	@Column(name="event_name")
	private String eventName;
	
	@Column(name="start_date")
	@Temporal(TemporalType.DATE)
	private Date startDate;

	@Column(name="end_date")
	@Temporal(TemporalType.DATE)
	private Date endDate;
	
	private String place;
	private Long budget;
	
	@ManyToOne
	@NotNull
	@JoinColumn(name="request_by")
	private MasterEmployee requestBy;
	
	@NotNull
	@Column(name="request_date")
	@Temporal(TemporalType.DATE)
	private Date requestDate;
	
	@ManyToOne
	@JoinColumn(name="approved_by")
	private MasterEmployee approvedBy;
	
	@Column(name="approved_date")
	@Temporal(TemporalType.DATE)
	private Date approvedDate;
	
	@Column(name="close_date")
	@Temporal(TemporalType.DATE)
	private Date closeDate;
	
	private String note;
	private int status;
	
	@Column(name="reject_reason")
	private String rejectReason;
	
	@Column(name="is_delete", columnDefinition="number(1,0) default 0")
	private Boolean isDelete;
	
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
	
	@OneToOne(fetch=FetchType.LAZY,mappedBy="transaksiEvent")
	@JsonBackReference
	private TransaksiDesign transaksiDesign;
	
	//trans souv edit astya
	/*@OneToOne(fetch=FetchType.LAZY, mappedBy="tEventId")
	@JsonBackReference
	private TransaksiSouvenir transaksiSouvenir;
	
	public TransaksiSouvenir getTransaksiSouvenir() {
		return transaksiSouvenir;
	}

	public void setTransaksiSouvenir(TransaksiSouvenir transaksiSouvenir) {
		this.transaksiSouvenir = transaksiSouvenir;
	}*/

	public TransaksiDesign getTransaksiDesign() {
		return transaksiDesign;
	}

	public void setTransaksiDesign(TransaksiDesign transaksiDesign) {
		this.transaksiDesign = transaksiDesign;
	}

	@ManyToOne
	@JoinColumn(name="assign_to")
	private MasterEmployee assignTo;
	
	public int getId() {
		return id;
	}

	public MasterEmployee getAssignTo() {
		return assignTo;
	}

	public void setAssignTo(MasterEmployee assignTo) {
		this.assignTo = assignTo;
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

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
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

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Long getBudget() {
		return budget;
	}

	public void setBudget(Long budget) {
		this.budget = budget;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public Date getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getRejectReason() {
		return rejectReason;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	public Boolean getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Boolean isDelete) {
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

	public MasterEmployee getRequestBy() {
		return requestBy;
	}

	public void setRequestBy(MasterEmployee requestBy) {
		this.requestBy = requestBy;
	}

	public MasterEmployee getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(MasterEmployee approvedBy) {
		this.approvedBy = approvedBy;
	}
	
}
