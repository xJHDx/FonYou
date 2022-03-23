package com.jhd.gestorMultiple.repository;

import com.jhd.gestorMultiple.entity.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface QuestionEntityRepository extends JpaRepository<QuestionEntity, Long> {

    //@Query()


}