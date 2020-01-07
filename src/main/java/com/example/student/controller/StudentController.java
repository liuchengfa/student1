package com.example.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.model.Student;
import com.example.student.service.StudentService;


@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;

	@RequestMapping("/search")
	public String search(@RequestParam Integer id, Model model) {
		Student s =  studentService.searchById(id);
		model.addAttribute("s",s);
		return "index";
	}

	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Integer id){
		String message="";
		if(studentService.removeStudent(id)>0){
			message = "删除成功";
		}else{
			message = "删除失败";
		}

		return message;
	}
}
