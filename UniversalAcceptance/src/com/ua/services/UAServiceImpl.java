package com.ua.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ua.dao.UADao;

@Service
public class UAServiceImpl implements UAService {
    @Autowired
    UADao ad;
    
	public void addUser(String fn, String ln, String email)
	{
		ad.addUser(fn, ln, email);
	}
}
