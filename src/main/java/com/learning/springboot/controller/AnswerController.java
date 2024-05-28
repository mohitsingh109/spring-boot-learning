package com.learning.springboot.controller;

import com.learning.springboot.model.Answer;
import com.learning.springboot.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/answer")
public class AnswerController {

    private final AnswerService answerService;

    @Autowired
    public AnswerController(AnswerService answerService) {
        this.answerService = answerService;
    }


    @PostMapping("/{qId}")
    public void addAnswer(@PathVariable("qId") Long id, @RequestBody Answer answer) {
        answerService.addAnswer(id, answer);
    }
}

/**
 *
 * Entity --> Controller --> Service -> Repository Layer
 * AnswerService ---> QuestionService
 *
 */
