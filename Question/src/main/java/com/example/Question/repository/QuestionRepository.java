package com.example.Question.repository;

import com.example.Question.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

    @Query(value = "select q.id from question q where q.category=:category order by random() limit :numOfQuestions", nativeQuery = true)
    public List<Integer> findRandomQuestionsByCategory(String category, Integer numOfQuestions);

    public List<Question> findByCategory(String category);
}
