package com.knoldus.employeemanagementsystem.repo;

import com.knoldus.employeemanagementsystem.model.Designation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignationRepository extends JpaRepository<Designation,Long> {

}
