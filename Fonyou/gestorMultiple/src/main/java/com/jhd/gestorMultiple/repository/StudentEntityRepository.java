package com.jhd.gestorMultiple.repository;

import com.jhd.gestorMultiple.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentEntityRepository extends JpaRepository<StudentEntity, Long> {

}
