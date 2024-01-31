package com.example.quiz.Service;

import com.example.quiz.Modal.QuizPythonQuestion;
import org.bson.types.ObjectId;

import java.util.List;

public interface PythonService {
    List<QuizPythonQuestion> findALl();


    List<QuizPythonQuestion> findAll();

    void save(QuizPythonQuestion quizPythonQuestion);


    void findResult(String quizAnswers, QuizPythonQuestion quizPythonQuestion);

    List<QuizPythonQuestion> findByID(ObjectId id);

    List<QuizPythonQuestion> findPython();

    List<QuizPythonQuestion> findJavaScript();

    List<QuizPythonQuestion> findJava();

    List<QuizPythonQuestion> findCplus();

    List<QuizPythonQuestion> findHTML();

    List<QuizPythonQuestion> findCSS();

    List<QuizPythonQuestion> findEasy();

    List<QuizPythonQuestion> findMedium();

    List<QuizPythonQuestion> findHard();


    // Assuming you have a method in your service to calculate results
}
