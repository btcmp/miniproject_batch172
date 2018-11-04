package com.marcomm.model;

 
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
 
	@OneToMany(fetch=FetchType.LAZY, mappedBy="mRole", cascade=CascadeType.ALL, orphanRemoval=true)
	private List<MasterUser> mUser;
	
	public MasterRole() {
	}
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
	 
	
	
	
	 
	
}
