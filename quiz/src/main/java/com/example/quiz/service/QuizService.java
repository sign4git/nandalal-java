package com.example.quiz.service;

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


    ObjectMapper mapper = new ObjectMapper();

    public ResponseEntity<Quiz> createQuiz(String category, Integer noOfQuestions, String title){
//        List<Question> questionList = questionRepository.findRandomQuestionsByCategory(category,noOfQuestions);
//        Quiz quiz = new Quiz();
//        try {
//            quiz.setQuestionList(questionList);
//            quiz.setTitle(title);
//            Quiz response = quizRepository.save(quiz);
//            return new ResponseEntity<>(response, HttpStatus.CREATED);
//        }catch(Exception e){
//            return new ResponseEntity<>(quiz, HttpStatus.BAD_REQUEST);
//        }
        return null;
    }

    public ResponseEntity<List<QuestionWrapper>> findById(Integer id) {
//        Optional<Quiz> quiz = quizRepository.findById(id);
//        if(quiz.isEmpty())
//            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
//        List<Question> questionList = quiz.get().getQuestionList();
//        List<QuestionWrapper> questionWrapperList = new ArrayList<>();
//        for(Question q : questionList){
//            QuestionWrapper questionWrapper = new QuestionWrapper(q.getId(),q.getOption1(),
//                    q.getOption2(),q.getOption3(),q.getOption4(),q.getQuestion());
//            questionWrapperList.add(questionWrapper);
//        }
//        return new ResponseEntity<>(questionWrapperList,HttpStatus.OK);
        return null;
    }

    public ResponseEntity<Integer> calculateScore(Integer id, List<QuizResponse> userAnswerList) {
//        Integer score =0;
//        Quiz quiz = quizRepository.findById(id).get();
//        for(QuizResponse response: userAnswerList){
//            Question question = questionRepository.findById(response.getId()).get();
//            if(response.getUserAnswer().equals(question.getRightAnswer())){
//                score++;
//            }
//        }
//        return new ResponseEntity<>(score,HttpStatus.OK);
        return null;
    }
}
