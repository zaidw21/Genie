package com.mindtree.genie.service;

import java.util.List;

import com.mindtree.genie.dao.GenieDao;
import com.mindtree.genie.entities.GenieForm;
import com.mindtree.genie.entities.UserDetails;

public class GenieServiceImpl implements GenieService{

	GenieDao genieDao;
	
	public void setGenieDao(GenieDao genieDao) {
		this.genieDao = genieDao;
	}


	@Override
	public UserDetails  validateUser(UserDetails userdetails) {
		return genieDao.validateUser(userdetails);
	}


	@Override
	public String saveGenie(GenieForm genieForm) {
		return genieDao.saveGenie(genieForm);
	}


	@Override
	public List<UserDetails> getAllAssignedGenie(String mid) {
		return genieDao.getAllAssignedGenie(mid);
	}

}
