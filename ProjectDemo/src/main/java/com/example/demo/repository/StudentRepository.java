package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Entity.StudentDataEntity;

@Repository

public interface StudentRepository extends JpaRepository<StudentDataEntity,Integer> {
	

}
