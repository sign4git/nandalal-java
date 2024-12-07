package com.example.quiz.controller;


import com.example.quiz.model.CreateQuizRequest;
import com.example.quiz.model.QuestionWrapper;
import com.example.quiz.model.Quiz;
import com.example.quiz.model.QuizResponse;
import com.example.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    QuizService quizService;

    @PostMapping
    public ResponseEntity<Quiz> createQuiz(@RequestBody CreateQuizRequest quizRequest){

        ResponseEntity<Quiz> response= quizService.createQuiz(quizRequest.getCategory(),quizRequest.getNoOfQuestions(),
                quizRequest.getTitle());
        return response;
    }

    @GetMapping("{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizById(@PathVariable Integer id){
        ResponseEntity<List<QuestionWrapper>> response= quizService.findById(id);
        return response;
    }

    @PostMapping("{id}/result")
    public ResponseEntity<Integer> getScore(@PathVariable Integer id,@RequestBody List<QuizResponse> userAnswerList){
        ResponseEntity<Integer> response = quizService.calculateScore(id,userAnswerList);
        return response;
    }

}
