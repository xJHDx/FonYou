package com.jhd.gestorMultiple.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Question")
public class QuestionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String title;
    public String answers;


}

