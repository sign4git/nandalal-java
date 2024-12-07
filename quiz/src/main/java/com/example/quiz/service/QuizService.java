package com.example.quiz.service;

import com.example.quiz.feign.QuestionFeign;
import com.example.quiz.model.QuestionWrapper;
import com.example.quiz.model.Quiz;
import com.example.quiz.model.QuizResponse;
import com.example.quiz.repository.QuizRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    QuizRepository quizRepository;

    @Autowired
    QuestionFeign questionFeign;


    ObjectMapper mapper = new ObjectMapper();

    public ResponseEntity<Quiz> createQuiz(String category, Integer noOfQuestions, String title){
        List<Integer> questionList=questionFeign.getQuestionsForQuiz(category, noOfQuestions).getBody();
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestionIdList(questionList);
        Quiz response=quizRepository.save(quiz);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> findById(Integer id) {
        List<Integer> questionIds = quizRepository.findById(id).get().getQuestionIdList();
        List<QuestionWrapper> questions = questionFeign.getQuestionsFromId(questionIds).getBody();

        return new ResponseEntity<>(questions, HttpStatus.OK);
    }

    public ResponseEntity<Integer> calculateScore(List<QuizResponse> userAnswerList) {
        Integer score = questionFeign.calculateScore(userAnswerList).getBody();
        return new ResponseEntity<>(score, HttpStatus.OK);
    }

    public ResponseEntity<List<Quiz>> findAll() {
        List<Quiz> questions = quizRepository.findAll();
        return new ResponseEntity<>(questions,HttpStatus.OK);
    }
}
