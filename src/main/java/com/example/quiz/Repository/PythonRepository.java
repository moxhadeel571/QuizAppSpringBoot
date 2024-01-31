package com.example.quiz.Repository;

import com.example.quiz.Modal.QuizPythonQuestion;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PythonRepository extends MongoRepository<QuizPythonQuestion, ObjectId> {
    @Query("{ 'category': 'Python' }")
    List<QuizPythonQuestion> findPythonQuestions();
    @Query("{ 'category': 'JavaScript' }")

    List<QuizPythonQuestion> findJavaScript();
    @Query("{ 'category': 'Java' }")
    List<QuizPythonQuestion> findJava();
    @Query("{ 'category': 'C++' }")

    List<QuizPythonQuestion> findCplus();
    @Query("{ 'category': 'HTML' }")
    List<QuizPythonQuestion> findHTML();
    @Query("{ 'category': 'CSS' }")

    List<QuizPythonQuestion> findCSS();
    @Query("{ 'difficulty': 'Easy' }")
    List<QuizPythonQuestion> findEasy();
    @Query("{ 'difficulty': 'Medium' }")
    List<QuizPythonQuestion> findMedium();
    @Query("{ 'difficulty': 'Hard' }")
    List<QuizPythonQuestion> findHard();
}
