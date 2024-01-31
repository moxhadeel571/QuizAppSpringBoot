package com.example.quiz.Implementation;

import com.example.quiz.Modal.QuizPythonQuestion;
import com.example.quiz.Repository.PythonRepository;
import com.example.quiz.Service.PythonService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class PythonImplementation implements PythonService {

    private final PythonRepository pythonRepository;

    @Autowired
    public PythonImplementation(PythonRepository pythonRepository) {
        this.pythonRepository = pythonRepository;
    }

    @Override
    public List<QuizPythonQuestion> findALl() {
        return pythonRepository.findAll();
    }

    @Override
    public List<QuizPythonQuestion> findAll() {
        return pythonRepository.findAll();
    }

    @Override
    public void save(QuizPythonQuestion quizPythonQuestion) {
        pythonRepository.save(quizPythonQuestion);
    }

    @Override
    public void findResult(String quizAnswers, QuizPythonQuestion quizPythonQuestion) {
        if (quizAnswers != null) {
            if (quizPythonQuestion.getOptions() != null) {
                quizPythonQuestion.setUserSelectedOptions(quizAnswers);
            }
        }
    }

    @Override
    public List<QuizPythonQuestion> findByID(ObjectId id) {
        return Collections.singletonList(pythonRepository.findById(id).orElse(null));
    }

    @Override
    public List<QuizPythonQuestion> findPython() {
        return pythonRepository.findPythonQuestions();
    }

    @Override
    public List<QuizPythonQuestion> findJavaScript() {
        return pythonRepository.findJavaScript();
    }

    @Override
    public List<QuizPythonQuestion> findJava() {
        return pythonRepository.findJava();
    }

    @Override
    public List<QuizPythonQuestion> findCplus() {
        return pythonRepository.findCplus();
    }

    @Override
    public List<QuizPythonQuestion> findHTML() {
        return pythonRepository.findHTML();
    }

    @Override
    public List<QuizPythonQuestion> findCSS() {
        return pythonRepository.findCSS();
    }

    @Override
    public List<QuizPythonQuestion> findEasy() {
        return pythonRepository.findEasy();
    }

    @Override
    public List<QuizPythonQuestion> findMedium() {
        return pythonRepository.findMedium();
    }

    @Override
    public List<QuizPythonQuestion> findHard() {
        return pythonRepository.findHard();
    }


}
