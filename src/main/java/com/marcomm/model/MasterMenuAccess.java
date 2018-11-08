package com.marcomm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.SQLDelete;

@Entity
@SQLDelete(sql="UPDATE M_MENU_ACCESS SET is_delete =1 WHERE id=?")
@Table(name="M_MENU_ACCESS")
public class MasterMenuAccess {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	/*@Column(name="m_role_id",nullable=false)
	private int mRoleId;*/
	/*@Column(name="m_menu_id",nullable=false)
	private int mMenuId;*/
	@Column(name="is_delete",nullable=false)
	private boolean isDelete;
	@Column(name="created_by",nullable=false)
	private String createdBy;
	@Column(name="created_date",nullable=false)
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	@Column(name="updated_by")
	private String updatedBy;
	@Column(name="updated_date")
	@Temporal(TemporalType.DATE)
	private Date updatedDate;
	@ManyToMany
	@JoinTable(name="M_Menu_M_Menu_Access",
	joinColumns= {@JoinColumn(name="menu_access")},
	inverseJoinColumns= {@JoinColumn(name="menu_id")}
	)
	private List<MasterMenu> menus;
	
	@ManyToOne
	@JoinColumn(name="M_Role_Id")
	private MasterRole role;
	
	public MasterMenuAccess() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<MasterMenu> getMenus() {
		return menus;
	}

	public void setMenus(List<MasterMenu> menus) {
		this.menus = menus;
	}

	public MasterRole getRole() {
		return role;
	}

	public void setRole(MasterRole role) {
		this.role = role;
	}

		
}
