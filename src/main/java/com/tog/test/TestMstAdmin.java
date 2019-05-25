package com.tog.test;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tog.config.AppConfig;
import com.tog.entity.MstAdmin;
import com.tog.service.MstAdminSvc;

public class TestMstAdmin {
	
	public static void main(String[]args){
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
        MstAdminSvc mstAdminSvc = context.getBean(MstAdminSvc.class);
		
		MstAdmin mstadmin = new MstAdmin();
		mstadmin.setPasswordadmin("lala");
		mstadmin.setUsernameadmin("lala");
		mstadmin.setCreatedDate(LocalDateTime.now());
		mstadmin.setCreatedUser("sad");
		mstadmin.setDeleted(false);
		
		mstAdminSvc.save(mstadmin);
		List<MstAdmin> listi = mstAdminSvc.findByUsernameadminAndPasswordadmin("lala", "lala");
		
		if(!listi.isEmpty() || listi != null || listi.size() > 0){
			for(MstAdmin admin : listi){
				System.out.println("Username: " + admin.getUsernameadmin() 
									+"Password: " + admin.getPasswordadmin());
			}
		}
		else{
			System.out.println("No data");
		} 
	}
}
		
	
