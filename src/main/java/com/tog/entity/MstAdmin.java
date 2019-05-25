package com.tog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

import com.tog.component.BaseEntity;


@Entity
@Table(name="mst_admin")
public class MstAdmin extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="username")
	@NonNull
	private String usernameadmin;
	
	@NonNull
	@Column(name="password")
	private String passwordadmin;
	
	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public Integer getId() {
		return this.id;
	}

	public String getUsernameadmin() {
		return usernameadmin;
	}

	public void setUsernameadmin(String usernameadmin) {
		this.usernameadmin = usernameadmin;
	}

	public String getPasswordadmin() {
		return passwordadmin;
	}

	public void setPasswordadmin(String passwordadmin) {
		this.passwordadmin = passwordadmin;
	}
	

}


