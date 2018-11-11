package com.marcomm.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="t_souvenir_item")
public class TransaksiSouvenirItem {
	 
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(length=11)
	private int id;
	@ManyToOne
	@JoinColumn(name="t_souvenir_id")
	private TransaksiSouvenir transaksiSouvenir;
	@ManyToOne
	@JoinColumn(name="m_souvenir_id")
	private MasterSouvenir masterSouvenir;
	@Column(length=50)
	private Long qty;//Jumlah yang ditambahkan/dikurangkan; Hanya angka, bisa negatif;
	@Column(name="qty_settlement", length=50)
	private Long qtySettlement; //umlah bila lebih dalam pengiriman; Hanya angka, bisa negatif;
	@Column(length=225, nullable=false)
	private String note;
	@Column(name="is_delete", nullable=false)
	private boolean isDelete;
	@ManyToOne
	@JoinColumn(name="created_by")
	private MasterEmployee createdBy;
	@Column(name="created_date")
	private Date createdDate;
	@ManyToOne
	@JoinColumn(name="updated_by")
	private MasterEmployee updatedBy;
	@Column(name="updated_date")
	private Date updatedDate;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public TransaksiSouvenir getTransaksiSouvenir() {
		return transaksiSouvenir;
	}
	public void setTransaksiSouvenir(TransaksiSouvenir transaksiSouvenir) {
		this.transaksiSouvenir = transaksiSouvenir;
	}
	public MasterSouvenir getMasterSouvenir() {
		return masterSouvenir;
	}
	public void setMasterSouvenir(MasterSouvenir masterSouvenir) {
		this.masterSouvenir = masterSouvenir;
	}
	public Long getQty() {
		return qty;
	}
	public void setQty(Long qty) {
		this.qty = qty;
	}
	public Long getQtySettlement() {
		return qtySettlement;
	}
	public void setQtySettlement(Long qtySettlement) {
		this.qtySettlement = qtySettlement;
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

	
	public MasterEmployee getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(MasterEmployee createdBy) {
		this.createdBy = createdBy;
	}
	public MasterEmployee getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(MasterEmployee updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	

}
