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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.SQLDelete;

import com.fasterxml.jackson.annotation.JsonManagedReference;



@Entity
@SQLDelete(sql="UPDATE T_SOUVENIR SET is_delete = 1 WHERE id = ?")
@Table(name="T_SOUVENIR")
public class TransaksiSouvenir {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	
	@Column(length=11)
	private int id;
	
	@Column(length=50, nullable=false, unique=true)
	private String code;
	
	@Column(nullable=false, length=11)
	private String type;
	

	//relasi bila ada request dari suatu ke event
	//@Column(name="t_event_id", length=50)
	@OneToOne
	//@JsonManagedReference
	@JoinColumn(name="t_event_id", unique=true)
	private	TransaksiEvent tEventId;
	
	
	//@Column(name="request_by", length=50, nullable=false)
	@ManyToOne
	@JoinColumn(name="request_by")
	private MasterEmployee requestBy;
	
	@Column(name="request_date")
	@Temporal(TemporalType.DATE)
	private Date requestDate;
	
	@Column(name="request_due_date")
	@Temporal(TemporalType.DATE)
	private Date requestDueDate;
	
	//@Column(name="approved_by", length=50)
	@ManyToOne
	@JoinColumn(name="approved_by")
	private MasterEmployee approvedBy;
	
	@Column(name="approved_date")
	@Temporal(TemporalType.DATE)
	private Date approvedDate;
	
	//@Column(name="receide_by", length=50)
	@ManyToOne
	@JoinColumn(name="received_by")
	private MasterEmployee receivedBy;
	
	@Column(name="received_date")
	@Temporal(TemporalType.DATE)
	private Date receivedDate;
	
	//@Column(name="settlement_by", length=50)
	@ManyToOne
	@JoinColumn(name="settlement_by")
	private MasterEmployee settlementBy;
	
	@Column(name="settlement_date")
	@Temporal(TemporalType.DATE)
	private Date settlementDate;
	
	//@Column(name="settlement_approved_by", length=50)
	@ManyToOne
	@JoinColumn(name="settlement_approved_by")
	private MasterEmployee settlementApprovedBy;
	
	
	@Column(name="settlement_approved_date")
	@Temporal(TemporalType.DATE)
	private Date settlementAprovedDate;
	
	
	
	
	@Column(length=1)
	private int status;
	
	@Column(name="note")
	private String note;
	
	@Column(name="reject_reason")
	private String rejectReason;
	
	@Column(name="is_delete")
	private boolean isDelete;
	
	//@Column(name="created_by")
	@ManyToOne
	@JoinColumn(name="created_by")
	private MasterEmployee createdBy;
	
	
	@Column(name="created_date")
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	//@Column(name="updated_by")
	@ManyToOne
	@JoinColumn(name="updated_by")
	private MasterEmployee updatedBy;
	
	@Column(name="updated_date")
	@Temporal(TemporalType.DATE)
	private Date updatedDate;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="transaksiSouvenir")
	private List<TransaksiSouvenirItem> transaksiSouvenirItems;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public TransaksiEvent gettEventId() {
		return tEventId;
	}

	public void settEventId(TransaksiEvent tEventId) {
		this.tEventId = tEventId;
	}

	public MasterEmployee getRequestBy() {
		return requestBy;
	}

	public void setRequestBy(MasterEmployee requestBy) {
		this.requestBy = requestBy;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public Date getRequestDueDate() {
		return requestDueDate;
	}

	public void setRequestDueDate(Date requestDueDate) {
		this.requestDueDate = requestDueDate;
	}

	public MasterEmployee getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(MasterEmployee approvedBy) {
		this.approvedBy = approvedBy;
	}

	public Date getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}

	public MasterEmployee getReceivedBy() {
		return receivedBy;
	}

	public void setReceivedBy(MasterEmployee receivedBy) {
		this.receivedBy = receivedBy;
	}

	public Date getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}

	public MasterEmployee getSettlementBy() {
		return settlementBy;
	}

	public void setSettlementBy(MasterEmployee settlementBy) {
		this.settlementBy = settlementBy;
	}

	public Date getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(Date settlementDate) {
		this.settlementDate = settlementDate;
	}

	public MasterEmployee getSettlementApprovedBy() {
		return settlementApprovedBy;
	}

	public void setSettlementApprovedBy(MasterEmployee settlementApprovedBy) {
		this.settlementApprovedBy = settlementApprovedBy;
	}

	public Date getSettlementAprovedDate() {
		return settlementAprovedDate;
	}

	public void setSettlementAprovedDate(Date settlementAprovedDate) {
		this.settlementAprovedDate = settlementAprovedDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
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

	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}

	public MasterEmployee getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(MasterEmployee createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public MasterEmployee getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(MasterEmployee updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public List<TransaksiSouvenirItem> getTransaksiSouvenirItems() {
		return transaksiSouvenirItems;
	}

	public void setTransaksiSouvenirItems(List<TransaksiSouvenirItem> transaksiSouvenirItems) {
		this.transaksiSouvenirItems = transaksiSouvenirItems;
	}

	
	


}
