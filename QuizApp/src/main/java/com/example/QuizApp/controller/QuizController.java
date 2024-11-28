package com.example.QuizApp.controller;

import com.example.QuizApp.model.QuestionWrapper;
import com.example.QuizApp.model.Quiz;
import com.example.QuizApp.model.QuizResponse;
import com.example.QuizApp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    QuizService quizService;

    @PostMapping
    public ResponseEntity<Quiz> createQuiz(@RequestParam String category,
                                           @RequestParam Integer noOfQuestions,
                                           @RequestParam String title){

        ResponseEntity<Quiz> response= quizService.createQuiz(category,noOfQuestions,title);
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
