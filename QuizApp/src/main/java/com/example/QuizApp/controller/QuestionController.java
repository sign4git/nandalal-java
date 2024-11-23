package com.example.QuizApp.controller;

import com.example.QuizApp.model.Question;
import com.example.QuizApp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions() {
        List<Question> questionsList = new ArrayList<>();
        try {
            questionsList = questionService.findAll();
            return new ResponseEntity<>(questionsList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(questionsList, HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("/initQuestions")
    public ResponseEntity<String> initQuestions() {
        List<Question> questions = Arrays.asList(
                new Question(null, "Cricket", "Easy", "Brian Lara", "Sachin Tendulkar", "Martin Guptill", "Rohit Sharma", "Who holds the record for the highest individual score in a One Day International (ODI) match?", "Rohit Sharma"), new Question(null, "Cricket", "Medium", "India", "Pakistan", "Australia", "England", "Which country won the first ICC T20 World Cup?", "India"), new Question(null, "Cricket", "Hard", "Sunil Gavaskar", "Sachin Tendulkar", "Rahul Dravid", "VVS Laxman", "Who is known as the \"Wall\" of Indian cricket?", "Rahul Dravid"), new Question(null, "Football", "Easy", "Germany", "Italy", "Brazil", "Argentina", "Which country has won the most FIFA World Cups?", "Brazil"), new Question(null, "Football", "Medium", "Lionel Messi", "Robert Lewandowski", "Cristiano Ronaldo", "Luka Modric", "Who won the Ballon d'Or in 2021?", "Lionel Messi"), new Question(null, "Football", "Hard", "Manchester United", "Bayern Munich", "Barcelona", "Real Madrid", "Which club has won the most UEFA Champions League titles?", "Real Madrid"));
        questionService.saveAll(questions);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }
}
