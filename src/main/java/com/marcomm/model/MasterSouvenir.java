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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="m_souvenir")
public class MasterSouvenir {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(unique=true, nullable=false)
	private String code;
	@Column(unique=true, nullable=false, length=50)
	private String name;
	
	private String description;
	@Column(nullable=false)
	private int quantity;
	@ManyToOne
	@JoinColumn(name="m_unit_id")
	private MasterUnit masterUnit;
	
	//private int mUnitId;
	
	@Column(name="is_deleted", nullable=false)
	private boolean isDeleted;
	
	
	@Column(name="created_by", nullable=false)
	private String createdBy;
	
	@Column(name="created_date")
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	@Column(name="updated_by")
	private String updatedBy;
	
	@Column(name="updated_date")
	@Temporal(TemporalType.DATE)
	private Date updatedDate;
	
	public MasterSouvenir () {}
	public MasterSouvenir (String code, String name, String description, MasterUnit masterUnit, int quantity,
			boolean isDeleted, String createdBy, Date createdDate, String updatedBy, Date updatedDate) {
		super();
		this.code = code;
		this.name = name;
		this.description = description;
		this.quantity= quantity;
		//this.mUnitId= mUnitId;
		this.masterUnit = masterUnit;
		this.isDeleted= isDeleted;
		this.createdBy = createdBy;
		this.createdDate =createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate =updatedDate;
	}
	
	public MasterSouvenir (int id) {
		super();
		this.id = id;
	}
	public MasterSouvenir (int id, String code, String name, String description, MasterUnit masterUnit,int quantity, 
			boolean isDeleted, String createdBy, Date createdDate, String updatedBy, Date updatedDate) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.description = description;
		this.quantity= quantity;
		//this.mUnitId= mUnitId; 
		this.masterUnit= masterUnit;
		this.isDeleted= isDeleted;
		this.createdBy = createdBy;
		this.createdDate =createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate =updatedDate;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	/*public int getMUnitId() {
		return mUnitId;
	}
	public void setMUnitId(int mUnitId) {
		mUnitId = mUnitId;
	}
	*/
	
	public MasterUnit getMasterUnit() {
		return masterUnit;
	}
	public void setMasterUnit(MasterUnit masterUnit) {
		this.masterUnit = masterUnit;
	}
	
	
	

}
