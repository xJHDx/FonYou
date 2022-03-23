package com.jhd.gestorMultiple.services;

import com.jhd.gestorMultiple.entity.QuestionEntity;
import com.jhd.gestorMultiple.entity.StudentEntity;
import com.jhd.gestorMultiple.models.Question;
import com.jhd.gestorMultiple.models.Student;
import com.jhd.gestorMultiple.repository.QuestionEntityRepository;
import com.jhd.gestorMultiple.repository.StudentEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ControllerServices {

    @Autowired
    QuestionEntityRepository questionEntityRepository;

    @Autowired
    StudentEntityRepository studentEntityRepository;

    public void CreateQuestion(Question question){
        System.out.println(question);
        QuestionEntity questionEntity = new QuestionEntity();
        questionEntity.setTitle(question.getTitle());
        questionEntity.setAnswers(String.valueOf(question.getAnswers()));
        questionEntityRepository.save(questionEntity);
    }

    public void CreateStudent(Student student){
        System.out.println(student);
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setName(student.getName());
        studentEntity.setYears(student.getYears());
        studentEntity.setCity(student.getCity());
        studentEntity.setCityDate(student.getCityDate());
        studentEntityRepository.save(studentEntity);
    }

}
