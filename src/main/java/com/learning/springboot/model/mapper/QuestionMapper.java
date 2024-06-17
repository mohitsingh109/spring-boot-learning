package com.learning.springboot.model.mapper;

import com.learning.springboot.model.Question;
import com.learning.springboot.model.QuestionDTO;

import java.util.ArrayList;
import java.util.List;

public class QuestionMapper {

    public static QuestionDTO toDTO(Question question) { // class function
        QuestionDTO questionDTO = new QuestionDTO();
        questionDTO.setId(question.getId());
        questionDTO.setText(question.getText());
        questionDTO.setAnswers(question.getAnswers());
        //set
        return questionDTO;
    }

    //AM  class function RT FN FA
    public static List<QuestionDTO> toDTO(List<Question> questions) {
        // Java Streams (8)

//        return questions.stream()
//                .map(question -> toDTO(question))
//                .toList();


        List<QuestionDTO> questionDTOS = new ArrayList<>();

        for(Question question: questions) {
            questionDTOS.add(toDTO(question));
        }

        return questionDTOS;
    }


    public static Question toQuestion(QuestionDTO questionDTO) {
        return null;
    }

    public static List<Question> toQuestion(List<QuestionDTO> questionDTO) {
        return null;
    }
}
