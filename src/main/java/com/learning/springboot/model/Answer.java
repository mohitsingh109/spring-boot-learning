package com.learning.springboot.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String text;

    @ManyToOne
    @JoinColumn(name = "question_id", referencedColumnName = "id")
    @JsonBackReference
    private Question question;
}
