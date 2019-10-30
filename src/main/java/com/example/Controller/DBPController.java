package com.example.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Players;
import com.example.Repository.PlayersRepo;

@RestController
@CrossOrigin("*")
public class DBPController {
	
	@Autowired
	private PlayersRepo repo;
	
	@GetMapping("/Showall")
	public ArrayList <Players> Showall() {
		return repo.findAll();
	}
	@GetMapping("/findByClub/{N}")
	public ArrayList <Players> findByClub(@PathVariable String N) {
		return repo.findByClub(N);
	}
	@GetMapping("/findByName/{N}")
	public ArrayList <Players> findByName(@PathVariable String N) {
		return repo.findByName(N);
	}
	@GetMapping("/findByAge/{N}")
	public ArrayList <Players> findByAge(@PathVariable int N) {
		return repo.findByAge(N);
	}
	@GetMapping("/findByPosition/{N}")
	public ArrayList <Players> findByPosition(@PathVariable String N) {
		return repo.findByPosition(N);
	}
}
	
	
//	@GetMapping("/filterdept1/{department}/{subject}")
//	public ArrayList <Players> filteringdepartments(@PathVariable String department, @PathVariable String subject) {
//		return repo.findByDeptAndSubject(department,subject);
//	}
	
//	@GetMapping("/filterRegno1/{Regno}/{Marks}")
//	public ArrayList <Players> filteringRegno(@PathVariable int Regno, @PathVariable int Marks) {
//		return repo.findByRegnoOrMarks(Regno,Marks);
//	}
//	@GetMapping("/filterMarksGreater/{Marks}")
//	public ArrayList <Players> filteringMarks(@PathVariable int Marks) {
//		return repo.findByMarksGreaterThan(Marks);
//	}
//	@GetMapping("/filterMarksBetween/{min}/{max}")
//	public ArrayList <Players> filteringMarksBetween(@PathVariable int min, @PathVariable int max) {
//		return repo.findByMarksBetween(min, max );
//		
//	}
//	@GetMapping("/filterMarksGreaterEqual/{mark}")
//	public ArrayList <Players> filteringMarksGreaterThan(@PathVariable int mark) {
//		return repo.findByMarksGreaterThanEqual(mark);
//		
//	}
//	
	
	
	
//	@PostMapping("/Save2/{regno}/{name}/{dept}/{subject}/{marks}")
//	public String SaveData(@PathVariable int regno, @PathVariable String name, @PathVariable String dept, @PathVariable String subject, @PathVariable int marks) {
//		School Ref=new School();
//		Ref.setRegno(regno);
//		Ref.setName(name);
//		Ref.setDept(dept);
//		Ref.setSubject(subject);
//		Ref.setMarks(marks);
//		repo.save(Ref);
//		return "Recordsaved";
//		
//	}
//	
//	@PostMapping("/Save3")
//	public String SaveData(@RequestBody School ref) {
//		if(ref.getRegno()==15) {
//			return "Sorry Mr. Shafeeq";
//		}
//			repo.save(ref);
//			return "Hello";
//		}
//		
//	}

