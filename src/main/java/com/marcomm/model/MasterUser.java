package com.marcomm.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.ResultCheckStyle;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
/*@SQLDelete(sql="UPDATE M_User SET is_delete=1 where id=?", check = ResultCheckStyle.COUNT)
@Where (clause ="is_delete <> 1")*/
@Table(name = "M_users")
public class MasterUser {
	@NotNull
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotNull
	private String username;
	@NotNull
	private String password;
	@Column(name = "m_role_id")
	@NotNull
	private String mRoleId;
	@Column(name = "m_employee_id")
	@NotNull
	private String mEmployeeId;
	@Column(name = "is_delete" , nullable=false, columnDefinition="number(1,0) default 0" )
	private int isDelete;
	@Column(name = "created_by")
	@NotNull
	private String createdBy;
	@Column(name = "created_date")
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	@Column(name = "updated_by")
	 
	private String updatedBy;
	@Column(name = "updated_date")
 
	private Date updatedDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getmRoleId() {
		return mRoleId;
	}

	public void setmRoleId(String mRoleId) {
		this.mRoleId = mRoleId;
	}

	public String getmEmployeeId() {
		return mEmployeeId;
	}

	public void setmEmployeeId(String mEmployeeId) {
		this.mEmployeeId = mEmployeeId;
	}

	public int getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(int isDelete) {
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
