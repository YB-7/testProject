package co.yedam.MainApp.view;

import java.util.List;
import java.util.Scanner;

import co.yedam.MainApp.access.*;
import co.yedam.MainApp.model.Student;

public class StudentCliApp {

	StudentAccess service = new StudentList();
	Scanner scn = new Scanner(System.in);

	public void start() {
		int menu = 0;
		do {
			menuTitle();
			System.out.print("선택> ");
			menu = scn.nextInt();
			scn.nextLine();

			switch (menu) {
			case 1:
				add();
				break;
			case 2:
				update();
				break;
			case 3:
				remove();
				break;
			case 4:
				list();
				break;
			case 5:
				searchByName();
				break;
			case 6:
				analyze();
				break;
			}
		} while (menu != 7);
	}

	public void add() {
		System.out.print("학번> ");
		int studentNum = scn.nextInt();
		scn.nextLine();
		System.out.print("이름> ");
		String name = scn.nextLine();
		System.out.print("영어점수> ");
		int engScore = scn.nextInt();
		scn.nextLine();
		System.out.print("수학점수> ");
		int mathScore = scn.nextInt();

		Student student = new Student(studentNum, name, engScore, mathScore);
		service.insert(student);
	}

	public void update() {
		System.out.print("수정할 학생 학번> ");
		int studentNum = scn.nextInt();
		service.update(studentNum);
	}

	public void remove() {
		System.out.print("삭제할 학생 학번> ");
		int studentNum = scn.nextInt();
		service.delete(studentNum);
	}

	public void list() {
		List<Student> students = service.showAll();
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}

	public void searchByName() {
		System.out.print("조회할 이름 입력> ");
		String name = scn.nextLine();
		Student student = service.selectOne(name);
		if (student != null) {
			System.out.println(student.toString());
		} else {
			System.out.println("조회한 결과가 없습니다.");
		}
	}

	public void analyze() {
		service.analyze();
	}

	public void menuTitle() {
		System.out.println("=====학생 정보=====");
		System.out.println("|1.학생추가	|");
		System.out.println("|2.학생수정	|");
		System.out.println("|3.학생삭제	|");
		System.out.println("|4.전체조회	|");
		System.out.println("|5.이름으로 찾기	|");
		System.out.println("|6.분석		|");
		System.out.println("|7.종료		|");
		System.out.println("=================");
	}
}
