package com.marcomm.model;

 
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="M_ROLE")
public class MasterRole {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="role_name")
	private String roleName;
	@Column(unique=true,nullable=false,length=50)
	private String code;
 
	@OneToMany(fetch=FetchType.LAZY, mappedBy="mRole", cascade=CascadeType.ALL, orphanRemoval=true)
	private List<MasterUser> mUser;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="role", cascade=CascadeType.ALL, orphanRemoval=true)
	private List<MasterMenuAccess> access;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<MasterUser> getmUser() {
		return mUser;
	}

	public void setmUser(List<MasterUser> mUser) {
		this.mUser = mUser;
	}

	public List<MasterMenuAccess> getAccess() {
		return access;
	}

	public void setAccess(List<MasterMenuAccess> access) {
		this.access = access;
	}
		
}
