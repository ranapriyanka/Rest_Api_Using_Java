package com.ranapriyankaba1704.restApi.tutorial.repositories;

import com.ranapriyankaba1704.restApi.tutorial.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

}
