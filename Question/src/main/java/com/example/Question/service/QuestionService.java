package com.example.Question.service;

import com.example.Question.model.Question;
import com.example.Question.model.QuestionResponse;
import com.example.Question.model.QuestionWrapper;
import com.example.Question.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public ResponseEntity<List<Integer>> generateQuestionsByCategory(String category, Integer noOfQuestions) {
        List<Integer> questionIds = new ArrayList<>();
        try {
            questionIds = questionRepository.findRandomQuestionsByCategory(category, noOfQuestions);
            return new ResponseEntity<>(questionIds, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(questionIds, HttpStatus.BAD_REQUEST);
        }
    }

    public ResponseEntity<List<QuestionWrapper>> getQuestionsByIds(List<Integer> questionIds) {
        List<QuestionWrapper> questionWrapperList = new ArrayList<>();
        for (Integer id : questionIds) {
            Question question = questionRepository.findById(id).get();
            QuestionWrapper questionWrapper = new QuestionWrapper(question.getId(), question.getOption1(),
                    question.getOption2(), question.getOption3(), question.getOption4(), question.getQuestion());
            questionWrapperList.add(questionWrapper);
        }
        return new ResponseEntity<>(questionWrapperList, HttpStatus.OK);
    }

    public ResponseEntity<Integer> calculateScore(List<QuestionResponse> userResponse) {
        Integer score = 0;
        for (QuestionResponse response : userResponse) {
            Question question = questionRepository.findById(response.getId()).get();
            if (response.getUserAnswer().equals(question.getRightAnswer())) {
                score++;
            }
        }
        return new ResponseEntity<>(score, HttpStatus.OK);
    }

    public ResponseEntity<List<Question>> getQuestionsByCategory(String category) {
        List<Question> questions = new ArrayList<>();
        try {
            questions = questionRepository.findByCategory(category);
            return new ResponseEntity<>(questions, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(questions, HttpStatus.BAD_REQUEST);
        }
    }
}
