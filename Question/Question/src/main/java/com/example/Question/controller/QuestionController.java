package com.example.Question.controller;

import com.example.Question.model.Question;
import com.example.Question.model.QuestionResponse;
import com.example.Question.model.QuestionWrapper;
import com.example.Question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
        try {
            List<Question> questions = Arrays.asList(
                    new Question(null, "Cricket", "Easy", "Brian Lara", "Sachin Tendulkar", "Martin Guptill", "Rohit Sharma", "Who holds the record for the highest individual score in a One Day International (ODI) match?", "Rohit Sharma"), new Question(null, "Cricket", "Medium", "India", "Pakistan", "Australia", "England", "Which country won the first ICC T20 World Cup?", "India"), new Question(null, "Cricket", "Hard", "Sunil Gavaskar", "Sachin Tendulkar", "Rahul Dravid", "VVS Laxman", "Who is known as the \"Wall\" of Indian cricket?", "Rahul Dravid"), new Question(null, "Football", "Easy", "Germany", "Italy", "Brazil", "Argentina", "Which country has won the most FIFA World Cups?", "Brazil"), new Question(null, "Football", "Medium", "Lionel Messi", "Robert Lewandowski", "Cristiano Ronaldo", "Luka Modric", "Who won the Ballon d'Or in 2021?", "Lionel Messi"), new Question(null, "Football", "Hard", "Manchester United", "Bayern Munich", "Barcelona", "Real Madrid", "Which club has won the most UEFA Champions League titles?", "Real Madrid"));
            questionService.saveAll(questions);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<String> addQuestion(@RequestBody Question question) {
        try {
            questionService.save(question);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateQuestion(@RequestBody Question question, @PathVariable Integer id) {
        Question updatedResource = new Question();
        try {
            Optional<Question> resourceToBeUpdated = questionService.findById(id);
            if (resourceToBeUpdated.isEmpty())
                return new ResponseEntity<>("Resource Not Found", HttpStatus.NOT_FOUND);
            question.setId(resourceToBeUpdated.get().getId());
            updatedResource = questionService.save(question);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(updatedResource, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteQuestion(@PathVariable Integer id) {
        try {
            Optional<Question> resourceToBeUpdated = questionService.findById(id);
            if (resourceToBeUpdated.isEmpty())
                return new ResponseEntity<>("Resource Not Found", HttpStatus.NOT_FOUND);
            questionService.deleteById(id);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("Resource Deleted Successfully", HttpStatus.OK);
    }

    @GetMapping("/generate")
    public ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam String category,
                                                             @RequestParam Integer noOfQuestions) {
        return questionService.generateQuestionsByCategory(category, noOfQuestions);
    }

    @PostMapping("/getQuestions")
    public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> questionIds) {
        return questionService.getQuestionsByIds(questionIds);
    }

    @PostMapping("/score")
    public ResponseEntity<Integer> calculateScore(@RequestBody List<QuestionResponse> userResponse) {
        return questionService.calculateScore(userResponse);
    }

    @GetMapping("/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category) {
        return questionService.getQuestionsByCategory(category);
    }
}
