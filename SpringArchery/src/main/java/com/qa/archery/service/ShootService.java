package com.qa.archery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qa.archery.entity.Shoot;
import com.qa.archery.repo.ShootRepo;

@Service
public class ShootService implements ServiceMethods<Shoot>{
	//Creating variable of the type ShootRepo
	private ShootRepo repo;
	
	//Default constructor
	public ShootService(ShootRepo repo) {
		this.repo = repo;
			
	}
	
	@Override
	public Shoot create(Shoot shoot) {
		return this.repo.save(shoot);
	}

	@Override
	public List<Shoot> readAll() {
		return this.repo.findAll();
		
	}

	@Override
	public Shoot readById(long id) {
		Optional<Shoot> getShoot = this.repo.findById(id);
		if(getShoot.isPresent()) {
			return getShoot.get();
		}
		return null;
	}

	@Override
	public Shoot update(long id, Shoot shoot) {
		Optional<Shoot> existingShoot = this.repo.findById(id);
		if(existingShoot.isPresent()) {
			Shoot exists = existingShoot.get();
			exists.setArrow(shoot.getArrow());
			exists.setArrowLength(shoot.getArrowLength());
			exists.setArrows(shoot.getArrows());
			exists.setBowType(shoot.getBowType());
			exists.setDated(shoot.getDated());
			exists.setDistance(shoot.getDistance());
			exists.setEndsTotal(shoot.getEndsTotal());
			exists.setLimbsWeight(shoot.getLimbsWeight());
			exists.setTargetFace(shoot.getTargetFace());
			exists.setTotalArrows(shoot.getTotalArrows());
			exists.setTotalScore(shoot.getTotalScore());
			
			return this.repo.saveAndFlush(exists);
		}
		return null;
	}

	//Deletes the id, and checks to see if it it still exists (should return true if it has worked)
	@Override
	public boolean delete(long id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}

}
