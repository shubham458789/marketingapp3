package com.marketingapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketingapp.entities.Lead;
import com.marketingapp.repositories.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {

	
	@Autowired
	private LeadRepository leadRepo;
	@Override
	public void saveOneLead(Lead l) {
		// TODO Auto-generated method stub
			leadRepo.save(l);
	}

}
