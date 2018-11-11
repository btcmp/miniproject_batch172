package com.marcomm.model;

import java.util.List;

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
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="M_EMPLOYEE")
public class MasterEmployee {
  
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	
	@Column(name="employee_name")
	private String employeeName;
	
	@OneToOne
	private MasterUser user;

	@ManyToOne
	@JoinColumn(name="company_id")
	private MasterCompany company;

	//relasi ke souvenir mamad
	@OneToMany(fetch=FetchType.LAZY, mappedBy="createdBy")
	private List<TransaksiSouvenir> createdByTransaksiSouvneir;
	
	
	public List<TransaksiSouvenir> getCreatedByTransaksiSouvneir() {
		return createdByTransaksiSouvneir;
	}

	public void setCreatedByTransaksiSouvneir(List<TransaksiSouvenir> createdByTransaksiSouvneir) {
		this.createdByTransaksiSouvneir = createdByTransaksiSouvneir;
	}
	
	//end relasi mamad
	
	

	//relasi ke design table buat diaz


	

	@OneToMany(fetch=FetchType.LAZY,mappedBy="assignTo")
	private List<TransaksiDesign> assignToDesign;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="requestBy")
	private List<TransaksiDesign> requestByDesign;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="approvedBy")
	private List<TransaksiDesign> approvedByDesign;
	
	public List<TransaksiDesign> getAssignToDesign() {
		return assignToDesign;
	}
	
	//KOLOM NAMBAH DARI EVENT
	@OneToMany(fetch=FetchType.LAZY, mappedBy="assignTo")
	private List<TransaksiEvent> assigntoEvent;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="requestBy")
	private List<TransaksiEvent> requestbyEvent;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="approvedBy")
	private List<TransaksiEvent> approvedbyEvent;
	//AKHIR KOLOM TAMBAHAN EVENT
	//KOLOM TAMBAHAN SOUVENIR ITEM TRANSAKASI
	@OneToMany(fetch=FetchType.LAZY, mappedBy="updatedtedBy")
	private List<TransaksiSouvenirItem> updatedBySouvenirItem;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="createdBy")
	private List<TransaksiSouvenirItem> createdBySouvenirItem;

	public List<TransaksiSouvenirItem> getUpdatedBySouvenirItem() {
		return updatedBySouvenirItem;
	}

	public void setUpdatedBySouvenirItem(List<TransaksiSouvenirItem> updatedBySouvenirItem) {
		this.updatedBySouvenirItem = updatedBySouvenirItem;
	}

	public List<TransaksiSouvenirItem> getCreatedBySouvenirItem() {
		return createdBySouvenirItem;
	}

	public void setCreatedBySouvenirItem(List<TransaksiSouvenirItem> createdBySouvenirItem) {
		this.createdBySouvenirItem = createdBySouvenirItem;
	}
	//AKHIR KOLOM SOUVENIR ITEM
	

	public void setAssignToDesign(List<TransaksiDesign> assignToDesign) {
		this.assignToDesign = assignToDesign;
	}

	public List<TransaksiDesign> getRequestByDesign() {
		return requestByDesign;
	}

	public void setRequestByDesign(List<TransaksiDesign> requestByDesign) {
		this.requestByDesign = requestByDesign;
	}

	public List<TransaksiDesign> getApprovedByDesign() {
		return approvedByDesign;
	}

	public void setApprovedByDesign(List<TransaksiDesign> approvedByDesign) {
		this.approvedByDesign = approvedByDesign;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public MasterUser getUser() {
		return user;
	}

	public void setUser(MasterUser user) {
		this.user = user;
	}

	public MasterCompany getCompany() {
		return company;
	}

	public void setCompany(MasterCompany company) {
		this.company = company;
	}
	
	//KOLOM NAMBAH DARI EVENT
	public List<TransaksiEvent> getAssigntoEvent() {
		return assigntoEvent;
	}

	public void setAssigntoEvent(List<TransaksiEvent> assigntoEvent) {
		this.assigntoEvent = assigntoEvent;
	}

	public List<TransaksiEvent> getRequestbyEvent() {
		return requestbyEvent;
	}

	public void setRequestbyEvent(List<TransaksiEvent> requestbyEvent) {
		this.requestbyEvent = requestbyEvent;
	}
	
	public List<TransaksiEvent> getApprovedbyEvent() {
		return approvedbyEvent;
	}

	public void setApprovedbyEvent(List<TransaksiEvent> approvedbyEvent) {
		this.approvedbyEvent = approvedbyEvent;
	}
	//AKHIR KOLOM TAMBAHAN EVENT
}
