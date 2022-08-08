import java.util.Date;

public class PolymorphismDemo3 {
	public static void main(String[] args) {
		Object obj = new String("Hello, World");
		System.out.println(obj.toString());
		obj = new Student();
		System.out.println(obj); 	//.toString()은 생략가능
		obj = new Point(30,60);
		System.out.println(obj);
		obj = new Integer(5);
		System.out.println(obj);
		obj = new Date();
		System.out.println(obj);
		//부모형 object는 자식주소를 다 받을수 있다, 자식은 부모형으로 형변환이 되며 항상 성공한다
		//재정의한 toString일수도 있고, object의 toString 을 쓴거일수도 있음
	}
}
