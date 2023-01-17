package com.example.springbootmysqldocker.repo;

import com.example.springbootmysqldocker.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student , Integer> {
}
