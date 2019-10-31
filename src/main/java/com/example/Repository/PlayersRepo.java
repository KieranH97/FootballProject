package com.example.Repository;


import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Players;


@Repository
public interface PlayersRepo extends JpaRepository <Players, String> {
	public ArrayList <Players> findByClub(String X);
	public ArrayList <Players> findByAge(int Dname);
	public ArrayList <Players> findByPosition(String Dname);
//	public String deleteByName(String D);
	
	
//	public ArrayList <Players> findByRegnoOrMarks (int regno ,int marks );
//	public ArrayList <Players> findByMarksGreaterThan(int M);
//	public ArrayList <Players> findByMarksBetween (int M1, int M2);
//	public ArrayList <Players> findByMarksGreaterThanEqual (int a);
//;
}
