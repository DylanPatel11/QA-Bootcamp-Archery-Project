package com.qa.archery.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.archery.entity.Shoot;
import com.qa.archery.service.ShootService;

@RestController
@RequestMapping("/shoot")
public class ShootController {
	
	private ShootService service;
	
	private ShootController(ShootService service) {
		this.service = service;
	}

	//Create
	public ResponseEntity<Shoot> createDuck(@RequestBody Shoot shoot) {
		return new ResponseEntity<Shoot>(this.service.create(shoot), HttpStatus.CREATED);
	}
	
	// Read All
	// We return a list because the readAll method in the service class returns a list also
	@GetMapping("/readAll")
	public ResponseEntity<List<Shoot>> readAllDucks() {		
		return new ResponseEntity<List<Shoot>>(this.service.readAll(), HttpStatus.OK);
	}
	
	// Read By Id
	// @PathVariable allows us to pass a variable to the path & service.readById method
	@GetMapping("/readById/{id}")
	
	public ResponseEntity<Shoot> readById(@PathVariable long id) {
		return new ResponseEntity<Shoot>(this.service.readById(id), HttpStatus.OK);
	}
	
	// Update
	// update requires both RequestBody and PathVariable as it takes in the id, and also passes through the new object information
	@PutMapping("/update/{id}")
	public ResponseEntity<Shoot> updateShoot(@PathVariable long id, @RequestBody Shoot shoot) {
		return new ResponseEntity<Shoot>(this.service.update(id, shoot), HttpStatus.ACCEPTED);
		}
	
	
	// Delete
	// Ternary operator, IF service.delete goes through (deletes the id), return no content, ELSE return not found
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> deleteShoot(@PathVariable long id) {
		return (this.service.delete(id)) ? new ResponseEntity<>(HttpStatus.NO_CONTENT)
				: new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
}
