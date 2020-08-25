package mike.study.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import mike.study.entity.Student;

@Repository
public interface StudentMapper {
	
	public void insertStudent(Student student);
	
	public List<Student> findStudent(int id);
	
	public void deleteStudent(int id);
	
	public void updateStudent(int id);
}
