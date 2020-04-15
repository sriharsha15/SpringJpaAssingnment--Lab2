package com.cg.dao;

import java.util.List;

import com.cg.entity.Trainee;


public interface TraineeDaoI 
{

	public void add(Trainee trainee);

	public List<Trainee> reterive();

	public Trainee findById(int traineeId);

	public void delete(int traineeId);

	public void modify(Trainee trainee);
}
