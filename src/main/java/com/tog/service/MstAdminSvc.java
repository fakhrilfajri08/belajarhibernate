package com.tog.service;

import java.util.List;


import com.tog.entity.MstAdmin;

public interface MstAdminSvc {
	
	public List<MstAdmin> findAll();
	public List<MstAdmin> findByUsernameadminAndPasswordadmin(
			String usernameadmin,
			String passwordadmin);
	public void save(MstAdmin mstadmin);
	
	
	
	

}
