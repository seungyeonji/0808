
public class Student {
	//클래스 모델링 : 입력과 출력 기준
	private String name, hakbun;
	private int kor, eng, mat, edp, tot;
	private double avg;
	private char grade;
	
	public Student() {}	//Default Constructor

	public Student(String hakbun, String name, int kor, int eng, int mat, int edp) {		//Constructor
		this.name = name;
		this.hakbun = hakbun;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.edp = edp;
	}

	//getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getEdp() {
		return edp;
	}

	public void setEdp(int edp) {
		this.edp = edp;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	
	//toString 재정의
	@Override
	public String toString() {
		return String.format("%-10s%10s%5d%5d%5d%5d\t\t%5d%8.2f%5c",
				 hakbun, name, kor, eng, mat, edp, tot, avg, grade);
	}
}
