import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class InputTest {
	private Student [] array;
	private Input input;
	
	@Before
	public void init() {	//초기화
		array = new Student[12];
		String path = "C:/Temp/sungjuk_utf8.dat";
		input = new Input(array, path);
	}
	
	@Test
	public void testInput() {
		this.input.fileInput();
		for(Student student : this.array) {	//만들어놓은 student 불러오기
			System.out.println(student); 		//student 넣으면 자동적으로 student.toString() 내부적으로 불러옴
		}
//		assertEquals("한송이", this.array[0].getName());
//		assertEquals((78+87+83+78), 
//				(this.array[0].getKor()+this.array[0].getEng()+this.array[0].getMat()+this.array[0].getEdp()));
	}
}
