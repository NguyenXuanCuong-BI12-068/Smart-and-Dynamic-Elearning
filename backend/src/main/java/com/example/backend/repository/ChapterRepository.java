package com.example.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.model.Chapter;
@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Integer> {

    public List<Chapter> findByCoursename(String Coursename);
    public List<Chapter> findAllByCoursename(String coursename);


}
