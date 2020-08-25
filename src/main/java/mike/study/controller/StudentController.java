package mike.study.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import mike.study.entity.Student;
import mike.study.service.StudentService;


@Controller()
public class StudentController {
	
	@Resource
	private StudentService studentService;
	
	@RequestMapping("/find.do")
	public String login() {
		List<Student> students = studentService.getStudentById(3);
		
		for (Student student : students) {
			System.out.println(student.getName());
			System.out.println(student.getAge());
		}
		return "Ok";
	}
	
}
