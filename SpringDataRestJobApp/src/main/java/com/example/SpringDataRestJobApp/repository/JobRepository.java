package com.example.SpringDataRestJobApp.repository;




import com.example.SpringDataRestJobApp.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface JobRepository extends JpaRepository<JobPost,Integer> {

}
