package mike.study.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mike.study.dao.StudentMapper;
import mike.study.entity.Student;

@Service
public class StudentService {
	@Resource
	private StudentMapper dao;
	
	
	public List<Student> getStudentById(Integer id) {
		List<Student> sutdents = dao.findStudent(id);
		return sutdents;
	}
}
