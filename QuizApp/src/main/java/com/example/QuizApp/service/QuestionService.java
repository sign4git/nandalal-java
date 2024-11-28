package com.example.QuizApp.service;

import com.example.QuizApp.model.Question;
import com.example.QuizApp.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Question save(Question question) {
        return questionRepository.save(question);
    }


    public Optional<Question> findById(Integer id) {
        return questionRepository.findById(id);
    }

    public void deleteById(Integer id) {
        questionRepository.deleteById(id);
    }
}
