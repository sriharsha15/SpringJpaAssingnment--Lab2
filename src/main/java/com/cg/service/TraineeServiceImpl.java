package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.TraineeDaoI;
import com.cg.dao.TraineeDaoImpl;
import com.cg.entity.Trainee;
@Service
public class TraineeServiceImpl implements TraineeServiceI
{

	@Autowired(required=true)
	private TraineeDaoImpl traineeDao;
	@Override
	public void add(Trainee trainee) {
		traineeDao.add(trainee);
		
	}

	@Override
	public List<Trainee> reterive() {
		// TODO Auto-generated method stub
		return traineeDao.reterive();
	}

	@Override
	public Trainee findById(int traineeId) {
		// TODO Auto-generated method stub
		
		return traineeDao.findById(traineeId);
	}

	@Override
	public void delete(int traineeId) {
		// TODO Auto-generated method stub
		traineeDao.delete(traineeId);
		
		
	}

	@Override
	public void modify(Trainee trainee) {
		// TODO Auto-generated method stub
		traineeDao.modify(trainee);
		
	}

}
