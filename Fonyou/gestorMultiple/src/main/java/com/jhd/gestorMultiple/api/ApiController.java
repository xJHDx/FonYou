package com.jhd.gestorMultiple.api;

import com.jhd.gestorMultiple.controller.Controller;
import com.jhd.gestorMultiple.models.Question;
import com.jhd.gestorMultiple.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
    Controller controller;

    @Value("${spring.application.version}")
    private String version;

    @GetMapping("version")
    public ResponseEntity<String> version() {
        return new ResponseEntity(version, HttpStatus.OK);
    }

    @PostMapping("CreateQuestion")
    public ResponseEntity<?> CreateQuestion(@RequestBody Question question){
        return new ResponseEntity<>(controller.createQuestion(question),HttpStatus.CREATED);
    }

    @PostMapping("CreateStudent")
    public ResponseEntity<?> CreateStudent(@RequestBody Student student){
        return new ResponseEntity<>(controller.createStudent(student),HttpStatus.CREATED);
    }

}
