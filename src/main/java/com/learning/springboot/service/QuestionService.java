package com.learning.springboot.service;

import com.learning.springboot.model.Answer;
import com.learning.springboot.model.Question;
import com.learning.springboot.model.QuestionDTO;
import com.learning.springboot.model.mapper.QuestionMapper;
import com.learning.springboot.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public QuestionDTO findById(Long id) {
        // class function
        //Question question1 = questionRepository.findById(id).get();

        Optional<Question> optionalQuestion = questionRepository.findById(id);
        if(optionalQuestion.isEmpty()) {
            throw new RuntimeException("Question is not present");
        }
        Question question = optionalQuestion.get();

        return QuestionMapper.toDTO(question);
    }

    public List<QuestionDTO> getAllQuestion() {
        return QuestionMapper.toDTO(questionRepository.findAll());
    }
}
