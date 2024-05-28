package com.learning.springboot.service;

import com.learning.springboot.model.Answer;
import com.learning.springboot.model.Question;
import com.learning.springboot.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    private QuestionRepository questionRepository;


    @Autowired
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public void addQuestion(Question question) {
        if(question.getAnswers() != null) {
            for (Answer answer : question.getAnswers()) {
                answer.setQuestion(question); // bi-directional mapping
            }
        }
        questionRepository.save(question);
    }

    public Question findById(Long id) {
        return questionRepository.findById(id).get();
    }

    public List<Question> getAllQuestion() {
        return questionRepository.findAll();
    }
}
