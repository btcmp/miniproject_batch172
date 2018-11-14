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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.ResultCheckStyle;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@SQLDelete(sql = "UPDATE M_UNIT SET is_delete = 1 WHERE id = ?")
@Table(name="M_UNIT")
public class MasterUnit {
	//id
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	//code
	@Column(nullable=false, unique=true)
	private String code;
	//name
	@Column(length=50, nullable=false, unique=true)
	private String name;
	//description
	@Column
	private String description;
	//isDelete
	@Column(name="is_delete", nullable=false, columnDefinition="number(1,0) default 0")
	private boolean isDelete;
	
	//created by
	@Column(name="created_by", length=50, nullable=false)
	private String createdBy;
	
	
	//created date
	@Column(name="created_date", nullable=false)
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	//updated by
	@Column(name="updated_by", length=50)
	private String updatedBy;
	
	
	//update date
	@Column(name="updated_date")
	@Temporal(TemporalType.DATE)
	private Date updatedDate;
	
	/*RELASI*/
	@OneToMany(fetch=FetchType.LAZY, mappedBy="masterUnit")
	private List<MasterSouvenir> masterUnit;
	
	/* SETTER DAN GETTER */
	
	public List<MasterSouvenir> getMasterUnit() {
		return masterUnit;
	}
	public void setMasterUnit(List<MasterSouvenir> masterUnit) {
		this.masterUnit = masterUnit;
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
	
	
	
	
}