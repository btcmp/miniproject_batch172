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
import javax.validation.constraints.NotNull;

@Entity
@Table(name="M_COMPANY")
public class MasterCompany {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	
	@NotNull
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(unique=true)
	private String code;
	
	@NotNull
	@Column(unique=true)
	private String name;
	
	private String address;
	private String phone;
	private String email;
	
	@NotNull
	@Column(name="is_delete", columnDefinition="number(1,0) default 0")
	private Boolean isDelete;
	
	@NotNull
	@Column(name="created_by")
	private String createdBy;
	
	@NotNull
	@Column(name="created_date")
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	@Column(name="update_by")
	private String updateBy;
	
	@Column(name="update_date")
	@Temporal(TemporalType.DATE)
	private Date updateDate;

	@OneToMany(fetch=FetchType.LAZY, mappedBy="company")
	private List<MasterEmployee> employees;
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	
}
