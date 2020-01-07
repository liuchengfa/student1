package com.example.student.controller;

import com.example.student.model.Student;
import com.example.student.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {
    private StudentService studentService;
    @RequestMapping("/search")
    public String search(Integer id, Model model){
        Student s=studentService.searchById(id);
        model.addAttribute("s",s);
        return "index";
    }
}
