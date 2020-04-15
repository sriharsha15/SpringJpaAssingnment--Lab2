package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.entity.Trainee;
@Transactional
@Repository
public class TraineeDaoImpl implements TraineeDaoI
{
	@PersistenceContext
	EntityManager em;
	@Override
	public void add(Trainee trainee) {
		// TODO Auto-generated method stub
		em.persist(trainee);
		
	}

	@Override
	public List<Trainee> reterive() {
		// TODO Auto-generated method stub
		String Qstr="SELECT trainee FROM Trainee trainee";
		TypedQuery<Trainee> query=em.createQuery(Qstr,Trainee.class);
		return query.getResultList();	
	}

	@Override
	public Trainee findById(int traineeId) {
		// TODO Auto-generated method stub
		return em.find(Trainee.class,traineeId);
	}

	@Override
	public void delete(int traineeId) {
		// TODO Auto-generated method stub
		Trainee trainee= em.find(Trainee.class,traineeId );
		System.out.println(trainee.getTraineeName() +" "+trainee.getTraineeDomain() + " "+trainee.getTraineeLocation()+" is removed");
		em.remove(trainee);
		
	}

	@Override
	public void modify(Trainee trainee) {
		// TODO Auto-generated method stub
		Trainee traineeUptd= em.find(Trainee.class,trainee.getTraineeId());
		traineeUptd.setTraineeName(trainee.getTraineeName());
	}

}
