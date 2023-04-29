package com.ooadj.ooadj;

import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class LearnerService {


	@org.springframework.beans.factory.annotation.Autowired(required=true)
	private LearnerRepository repo;
	
	public List<learner> listAll(){
		return repo.findAll();
	}
	public learner get(Long id) {
		return repo.findById(id).get();
	}
}





