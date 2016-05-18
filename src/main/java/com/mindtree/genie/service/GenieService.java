package com.mindtree.genie.service;

import java.util.List;

import com.mindtree.genie.entities.GenieForm;
import com.mindtree.genie.entities.UserDetails;

public interface GenieService {

	UserDetails  validateUser(UserDetails userdetails);

	String saveGenie(GenieForm genieForm);

	List<UserDetails> getAllAssignedGenie(String mid);

}
