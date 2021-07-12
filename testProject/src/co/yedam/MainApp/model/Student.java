package co.yedam.MainApp.model;

public class Student {
	private int studentNum;
	private String name;
	private int engScore;
	private int mathScore;
	
	public Student(int studentNum, String name, int engScore, int mathScore) {
		super();
		this.studentNum = studentNum;
		this.name = name;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNo) {
		this.studentNum = studentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	@Override
	public String toString() {
		return "[학번: " + studentNum + ", 이름: " + name + ", 영어점수: " + engScore + ", 수학점수: "
				+ mathScore + "]";
	}
	
}
