package com.jhd.gestorMultiple.controller;

import com.jhd.gestorMultiple.models.Question;
import com.jhd.gestorMultiple.models.Response;
import com.jhd.gestorMultiple.models.Student;
import com.jhd.gestorMultiple.services.ControllerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {

    @Autowired
    ControllerServices controllerServices;

    public Response createQuestion(Question question){
        Response response = new Response();
        try {
           controllerServices.CreateQuestion(question);
            response.setStatus("Creado");
        }catch (Exception e){
            response.setStatus("Error: " + e.getMessage());
        }
        return response;
    }

    public Response createStudent(Student student){
        Response response = new Response();
        try {
            controllerServices.CreateStudent(student);
            response.setStatus("Creado");
        }catch (Exception e){
            response.setStatus("Error: " + e.getMessage());
        }
        return response;
    }

}
