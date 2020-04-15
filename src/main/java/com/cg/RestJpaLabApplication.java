package com.cg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.entity.Trainee;
import com.cg.service.TraineeServiceI;
import com.cg.service.TraineeServiceImpl;


@SpringBootApplication
public class RestJpaLabApplication implements CommandLineRunner {
//	@Autowired
//	private TraineeServiceI traineeservice;

	public static void main(String[] args) {
		SpringApplication.run(RestJpaLabApplication.class, args);

	}
	@Override
	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		Trainee trainee=new Trainee(22,"sreenad","FSD","Karnataka");
//		Trainee trainee1=new Trainee(23,"sri","Ios","Karnataka");
//		Trainee trainee2=new Trainee(25,"dell","android","Karnataka");
//		traineeservice.add(trainee);
//		traineeservice.add(trainee1);
//		traineeservice.add(trainee2);
//		//traineeservice.delete(5);
//		 
//		  List<Trainee> traineelist =traineeservice.reterive();
//		  
//		  for(Trainee trainee11:traineelist)
//		  { 
//			System.out.println(trainee11.getTraineeId() +" "+
//		  trainee11.getTraineeName() +" "+ trainee11.getTraineeLocation()+""+trainee11.getTraineeDomain()); }
//		 
//		
//		  Trainee t=traineeservice.findById(2); 
//		  System.out.println(t.getTraineeName());
	}
}
