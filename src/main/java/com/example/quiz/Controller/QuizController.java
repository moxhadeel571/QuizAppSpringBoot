package com.example.quiz.Controller;

import com.example.quiz.Modal.QuizPythonQuestion;
import com.example.quiz.Service.PythonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
@Controller
public class QuizController {
    private final PythonService pythonService;

    @Autowired
    public QuizController(PythonService pythonService) {
        this.pythonService = pythonService;
    }

    @GetMapping("/Quiz")
    public String getQuiz() {
        return "Homepage";
    }

    @GetMapping("/Python")
    public String getPython(Model model, @ModelAttribute("quizResponse") QuizPythonQuestion quizPythonQuestion) {
        List<QuizPythonQuestion> pythonQuestions = pythonService.findPython();
        model.addAttribute("questions", pythonQuestions);
        return "Python";
    }
    @GetMapping("/JavaScript")
    public String getJavaScript(Model model, @ModelAttribute("quizResponse") QuizPythonQuestion quizPythonQuestion) {
        List<QuizPythonQuestion> pythonQuestions = pythonService.findJavaScript();
        model.addAttribute("questions", pythonQuestions);
        return "JavaScript";
    }
    @GetMapping("/Java")
    public String Java(Model model, @ModelAttribute("quizResponse") QuizPythonQuestion quizPythonQuestion) {
        List<QuizPythonQuestion> pythonQuestions = pythonService.findJava();
        model.addAttribute("questions", pythonQuestions);
        return "Java";
    }
    @GetMapping("/C++")
    public String CPlus(Model model, @ModelAttribute("quizResponse") QuizPythonQuestion quizPythonQuestion) {
        List<QuizPythonQuestion> pythonQuestions = pythonService.findCplus();
        model.addAttribute("questions", pythonQuestions);
        return "C++";
    }
    @GetMapping("/HTML")
    public String HTML(Model model, @ModelAttribute("quizResponse") QuizPythonQuestion quizPythonQuestion) {
        List<QuizPythonQuestion> pythonQuestions = pythonService.findHTML();
        model.addAttribute("questions", pythonQuestions);
        return "HTML";
    }
    @GetMapping("/CSS")
    public String CSS(Model model, @ModelAttribute("quizResponse") QuizPythonQuestion quizPythonQuestion) {
        List<QuizPythonQuestion> pythonQuestions = pythonService.findCSS();
        model.addAttribute("questions", pythonQuestions);
        return "CSS";
    }
    @GetMapping("/Easy")
    public String Easy(Model model, @ModelAttribute("quizResponse") QuizPythonQuestion quizPythonQuestion) {
        List<QuizPythonQuestion> pythonQuestions = pythonService.findEasy();
        model.addAttribute("questions", pythonQuestions);
        return "Easy";
    }
    @GetMapping("/Medium")
    public String Medium(Model model, @ModelAttribute("quizResponse") QuizPythonQuestion quizPythonQuestion) {
        List<QuizPythonQuestion> pythonQuestions = pythonService.findMedium();
        model.addAttribute("questions", pythonQuestions);
        return "Medium";
    }
    @GetMapping("/Hard")
    public String Hard(Model model, @ModelAttribute("quizResponse") QuizPythonQuestion quizPythonQuestion) {
        List<QuizPythonQuestion> pythonQuestions = pythonService.findHard();
        model.addAttribute("questions", pythonQuestions);
        return "Hard";
    }
    @PostMapping("/submitEasy")
    public String submitEasy(Model model, @RequestParam("userSelectedOptions") String quizAnswers, @ModelAttribute("quizResponse") QuizPythonQuestion quizPythonQuestion) {
        pythonService.findResult(quizAnswers, quizPythonQuestion);
        List<QuizPythonQuestion> pythonQuestions = pythonService.findEasy();
        model.addAttribute("questions", pythonQuestions);
        List<String> userAnswersList = Arrays.asList(quizAnswers.split(","));
        int totalScore = calculateTotalScore(pythonQuestions, userAnswersList);
        model.addAttribute("totalScore", totalScore);
        model.addAttribute("quizAnswers", Arrays.asList(quizAnswers.split(",")));
        return "Result";
    }
    @PostMapping("/submitMedium")
    public String submitMedium(Model model, @RequestParam("userSelectedOptions") String quizAnswers, @ModelAttribute("quizResponse") QuizPythonQuestion quizPythonQuestion) {
        pythonService.findResult(quizAnswers, quizPythonQuestion);
        List<QuizPythonQuestion> pythonQuestions = pythonService.findMedium();
        model.addAttribute("questions", pythonQuestions);
        List<String> userAnswersList = Arrays.asList(quizAnswers.split(","));
        int totalScore = calculateTotalScore(pythonQuestions, userAnswersList);
        model.addAttribute("totalScore", totalScore);

        model.addAttribute("quizAnswers", Arrays.asList(quizAnswers.split(",")));

        return "Result";
    }
    @PostMapping("/submitHard")
    public String submitHard(Model model, @RequestParam("userSelectedOptions") String quizAnswers, @ModelAttribute("quizResponse") QuizPythonQuestion quizPythonQuestion) {
        pythonService.findResult(quizAnswers, quizPythonQuestion);
        List<QuizPythonQuestion> pythonQuestions = pythonService.findHard();
        model.addAttribute("questions", pythonQuestions);
        List<String> userAnswersList = Arrays.asList(quizAnswers.split(","));
        int totalScore = calculateTotalScore(pythonQuestions, userAnswersList);
        model.addAttribute("totalScore", totalScore);

        model.addAttribute("quizAnswers", Arrays.asList(quizAnswers.split(",")));

        return "Result";
    }
    @PostMapping("/submitCSS")
    public String submitCSS(Model model, @RequestParam("userSelectedOptions") String quizAnswers, @ModelAttribute("quizResponse") QuizPythonQuestion quizPythonQuestion) {
        pythonService.findResult(quizAnswers, quizPythonQuestion);
        List<QuizPythonQuestion> pythonQuestions = pythonService.findCSS();
        model.addAttribute("questions", pythonQuestions);
        List<String> userAnswersList = Arrays.asList(quizAnswers.split(","));
        int totalScore = calculateTotalScore(pythonQuestions, userAnswersList);
        model.addAttribute("totalScore", totalScore);

        model.addAttribute("quizAnswers", Arrays.asList(quizAnswers.split(",")));

        return "Result";
    }
    @PostMapping("/submitHTML")
    public String submitHTML(Model model, @RequestParam("userSelectedOptions") String quizAnswers, @ModelAttribute("quizResponse") QuizPythonQuestion quizPythonQuestion) {
        pythonService.findResult(quizAnswers, quizPythonQuestion);
        List<QuizPythonQuestion> pythonQuestions = pythonService.findHTML();
        model.addAttribute("questions", pythonQuestions);
        List<String> userAnswersList = Arrays.asList(quizAnswers.split(","));
        int totalScore = calculateTotalScore(pythonQuestions, userAnswersList);
        model.addAttribute("totalScore", totalScore);

        model.addAttribute("quizAnswers", Arrays.asList(quizAnswers.split(",")));

        return "Result";
    }
    @PostMapping("/submitJavaScript")
    public String showJavaScript(Model model, @RequestParam("userSelectedOptions") String quizAnswers, @ModelAttribute("quizResponse") QuizPythonQuestion quizPythonQuestion) {
        pythonService.findResult(quizAnswers, quizPythonQuestion);
        List<QuizPythonQuestion> pythonQuestions = pythonService.findJavaScript();
        model.addAttribute("questions", pythonQuestions);
        List<String> userAnswersList = Arrays.asList(quizAnswers.split(","));
        int totalScore = calculateTotalScore(pythonQuestions, userAnswersList);
        model.addAttribute("totalScore", totalScore);

        model.addAttribute("quizAnswers", Arrays.asList(quizAnswers.split(",")));

        return "Result";
    }
    @PostMapping("/submitJava")
    public String submitJava(Model model, @RequestParam("userSelectedOptions") String quizAnswers, @ModelAttribute("quizResponse") QuizPythonQuestion quizPythonQuestion) {
        pythonService.findResult(quizAnswers, quizPythonQuestion);
        List<QuizPythonQuestion> pythonQuestions = pythonService.findJava();
        model.addAttribute("questions", pythonQuestions);
        List<String> userAnswersList = Arrays.asList(quizAnswers.split(","));
        int totalScore = calculateTotalScore(pythonQuestions, userAnswersList);
        model.addAttribute("totalScore", totalScore);

        model.addAttribute("quizAnswers", Arrays.asList(quizAnswers.split(",")));

        return "Result";
    }

    @PostMapping("/submit")
    public String showResults(Model model, @RequestParam("userSelectedOptions") String quizAnswers, @ModelAttribute("quizResponse") QuizPythonQuestion quizPythonQuestion) {
        pythonService.findResult(quizAnswers, quizPythonQuestion);
        List<QuizPythonQuestion> pythonQuestions = pythonService.findALl();
        model.addAttribute("questions", pythonQuestions);
        List<String> userAnswersList = Arrays.asList(quizAnswers.split(","));
        int totalScore = calculateTotalScore(pythonQuestions, userAnswersList);
        model.addAttribute("totalScore", totalScore);

        model.addAttribute("quizAnswers", Arrays.asList(quizAnswers.split(",")));

        return "Result";
    }
    @PostMapping("/submitCPlus")
    public String submitCPlus(Model model, @RequestParam("userSelectedOptions") String quizAnswers, @ModelAttribute("quizResponse") QuizPythonQuestion quizPythonQuestion) {
        pythonService.findResult(quizAnswers, quizPythonQuestion);
        List<QuizPythonQuestion> pythonQuestions = pythonService.findCplus();
        model.addAttribute("questions", pythonQuestions);
        List<String> userAnswersList = Arrays.asList(quizAnswers.split(","));
        int totalScore = calculateTotalScore(pythonQuestions, userAnswersList);
        model.addAttribute("totalScore", totalScore);

        model.addAttribute("quizAnswers", Arrays.asList(quizAnswers.split(",")));

        return "Result";
    }



    // Calculate total score based on correct answers
    private int calculateTotalScore(List<QuizPythonQuestion> questions, List<String> userAnswers) {
        int totalScore = 0;

        for (int i = 0; i < questions.size(); i++) {
            QuizPythonQuestion question = questions.get(i);
            String correctAnswers = question.getCorrectAnswer();

            // Check if user's answer matches any correct answer
            if (userAnswers.size() > i && correctAnswers.contains(userAnswers.get(i))) {
                totalScore++;
            }
        }

        return totalScore;
    }



//    @PostMapping("/submit")
//    public String submitQuiz(Model model, @RequestParam("selectedOptions") List<String> selectedOptions) {
//        List<QuizPythonQuestion> pythonQuestions = pythonService.findALl();
//        List<QuizPythonQuestion> result = pythonService.calculateQuizResult(Collections.singletonList(selectedOptions), pythonQuestions);
//
//        // Add any necessary data to the model for display on the result page
//        model.addAttribute("result", result);
//        model.addAttribute("python", pythonQuestions);
//
//        return "PythonResult"; // Assuming you have a separate template for displaying results
//    }
}





