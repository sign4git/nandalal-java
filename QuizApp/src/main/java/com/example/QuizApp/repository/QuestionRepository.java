package com.example.QuizApp.repository;

import com.example.QuizApp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Integer> {
//        public List<Question> findByCategory(String category);

        @Query(value = "select * from question q where q.category=:category order by random() limit :numOfQuestions", nativeQuery = true)
        public List<Question> findRandomQuestionsByCategory(String category, Integer numOfQuestions);
}
