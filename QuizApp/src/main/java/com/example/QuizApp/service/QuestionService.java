package com.example.QuizApp.service;

import com.example.QuizApp.model.Question;
import com.example.QuizApp.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    public List<Question> findAll() {
        return questionRepository.findAll();
    }

    public void saveAll(List<Question> questions) {
        questionRepository.saveAll(questions);
    }
}
