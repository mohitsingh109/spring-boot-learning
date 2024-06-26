package com.learning.springboot.service;


import com.learning.springboot.model.Answer;
import com.learning.springboot.model.Question;
import com.learning.springboot.model.QuestionDTO;
import com.learning.springboot.model.mapper.QuestionMapper;
import com.learning.springboot.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {

    private final AnswerRepository answerRepository;

    private final QuestionService questionService;

    @Autowired
    public AnswerService(AnswerRepository answerRepository, QuestionService questionService) {
        this.answerRepository = answerRepository;
        this.questionService = questionService;
    }


    public void addAnswer(Long id, Answer answer) {
        // Question
        QuestionDTO questionDTO = questionService.findById(id);

        answer.setQuestion(QuestionMapper.toQuestion(questionDTO));

        answerRepository.save(answer);
    }
}
