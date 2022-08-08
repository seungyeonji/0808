import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {
	private Student [] array;
	private Scanner sc;
	private File file;
	
	//생성자로 세개의 멤버변수 초기화
	public Input(Student[] array, String path) {	//file은 string으로 경로 넣을거니까 path로 받기
		this.array = array;
		this.file = new File(path);
		try {
			this.sc = new Scanner(this.file, "utf-8");
			//System.out.println("File founded");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}
	
	public void fileInput() {
		for(int i = 0; i<this.array.length; i++) { 
			String line = this.sc.nextLine();	//1101     한송이     78     87     83     78
			//System.out.println(line);
			
			//1st way : split 사용
//			String [] values = line.split("\\s+");	//space가 한칸 이상
//			System.out.println(values[1]); 	//이름만 출력
			
			//2nd way : delimiter 사용
			Scanner myScanner = new Scanner(line);	//읽어들인 그 한줄을 scanner에 넣기
			myScanner = myScanner.useDelimiter("\\s+");		//Delimiter : 어떤 구분자를 사용해서 구분할건지
//			myScanner.next();	//학번 건너뛰기
//			myScanner.next();	//이름 건너뛰기
//			int kor = myScanner.nextInt();	//형변환 안하고 숫자 읽어들일 수 있다
//			System.out.println(kor);
			this.array[i] = new Student(myScanner.next(), myScanner.next(), 
					myScanner.nextInt(), myScanner.nextInt(), myScanner.nextInt(), myScanner.nextInt());	//학생 한명의 주소를 0번째 페이지에 저장
			
		}
	}
	
	
}
