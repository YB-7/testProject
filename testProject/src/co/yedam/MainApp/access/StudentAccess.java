package co.yedam.MainApp.access;

import java.util.List;

import co.yedam.MainApp.model.Student;

public interface StudentAccess {
	public void insert(Student student);

	public void update(int studentNum);

	public void delete(int studentNum);

	public List<Student> showAll();

	public Student selectOne(String name);
	
	public void analyze();
}
