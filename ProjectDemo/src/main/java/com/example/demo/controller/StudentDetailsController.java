package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.Entity.StudentDataEntity;
import com.example.demo.repository.StudentRepository;
import java.util.List;

@RestController
public class StudentDetailsController {
	
@Autowired
public StudentRepository rep;

@PostMapping("/add")

public StudentDataEntity addDetails(@RequestBody StudentDataEntity sde) {
	try {
		rep.save(sde);
		return sde;
	}
	catch(Exception ex) {
		ex.printStackTrace();
	} return sde;
}
	
@GetMapping("/getAll")
public List<StudentDataEntity> getAll(){
	 try {
		 return rep.findAll();
		 
	 }
	 catch(Exception ex) {
		 ex.printStackTrace();
	 } return null;
}

}
