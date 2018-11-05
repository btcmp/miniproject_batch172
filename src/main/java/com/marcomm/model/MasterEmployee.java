package com.marcomm.model;

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
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
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
	
	
	
}
