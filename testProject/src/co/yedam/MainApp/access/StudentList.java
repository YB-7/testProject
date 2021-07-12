package co.yedam.MainApp.access;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.yedam.MainApp.model.Student;

public class StudentList implements StudentAccess {

	static Scanner scn = new Scanner(System.in);
	List<Student> students;

	public StudentList() {
		students = new ArrayList<Student>();
	}

	@Override
	public void insert(Student student) {
		students.add(student);
	}

	@Override
	public void update(int studentNum) {
		int order = searchForNum(studentNum);
		if (order != -1) {
			System.out.print("영어점수 수정>>> ");
			int engScore = scn.nextInt();
			students.get(order).setEngScore(engScore);
			System.out.print("수학점수 수정>>> ");
			int mathScore = scn.nextInt();
			students.get(order).setMathScore(mathScore);
			System.out.println("수정이 완료되었습니다.");
		} else {
			System.out.println("해당하는 항목이 없습니다.");
		}
	}

	@Override
	public void delete(int studentNum) {
		int order = searchForNum(studentNum);
		students.remove(order);
	}

	@Override
	public List<Student> showAll() {
		return students;
	}

	@Override
	public Student selectOne(String name) {
		for(Student student : students) {
			if(student.getName().equals(name)) {
				return student;
			}
		}
		return null;
	}

	@Override
	public void analyze() {
		// 영어과목의 최고점수, 수학과목의 최고점수, 두 과목의 최고점수를 받은 학생의 정보를 보여주기
	}

	public int searchForNum(int studentNum) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getStudentNum() == studentNum) {
				return i;
			}
		}
		return -1;
	}
	
}
