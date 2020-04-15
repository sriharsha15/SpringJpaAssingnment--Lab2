package com.cg.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Trainee;
import com.cg.service.TraineeServiceI;



@RestController
@RequestMapping("/trainee")
public class TraineeController 
{
@Autowired
private TraineeServiceI traineeservice;

@PostMapping("/trainer")
public ResponseEntity<Object> saveBook(@RequestBody Trainee trainee) {
    traineeservice.add(trainee);
	return new ResponseEntity<>(HttpStatus.OK);
}
@GetMapping("/gettrainer")
public ResponseEntity<List<Trainee>> getTrainerlist() {
		List<Trainee> list = traineeservice.reterive();
		return new ResponseEntity<List<Trainee>>(list,HttpStatus.OK);
}
@DeleteMapping("/delete/{traineeId}")
public ResponseEntity<Object> deleteTrainer(@PathVariable("traineeId") int traineeId)
{
	traineeservice.delete(traineeId);
	return new ResponseEntity<>("Deleted",HttpStatus.NO_CONTENT);
}
@GetMapping("/view/{traineeId}")
public ResponseEntity<Trainee> viewTrainer(@PathVariable("traineeId") int traineeId)
{
	Trainee tr=traineeservice.findById(traineeId);
	return new ResponseEntity<Trainee>(tr,HttpStatus.OK);
	
}
@PutMapping("/update/{traineeId}")
public ResponseEntity<Object> updateTrainer(@PathVariable("traineeId") int traineeId,@RequestBody Trainee trainee)
{
	traineeservice.modify(trainee);
	return new ResponseEntity<>(HttpStatus.OK);
}
	
}
