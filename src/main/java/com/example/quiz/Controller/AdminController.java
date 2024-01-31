package com.example.quiz.Controller;

import com.example.quiz.Modal.QuizPythonQuestion;
import com.example.quiz.Service.PythonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin")
@Controller
public class AdminController {
   private PythonService pythonService;
@Autowired
    public AdminController(PythonService pythonService) {
        this.pythonService = pythonService;
    }

    @GetMapping("/form")
    public String Form(){

    return "Form";
}
@PostMapping("/saveform")
    public String GetFormSave(@ModelAttribute QuizPythonQuestion quizPythonQuestion){
    pythonService.save(quizPythonQuestion);

    return "redirect:/form";
}



}
