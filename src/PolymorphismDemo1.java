
public class PolymorphismDemo1 {
	public static void main(String[] args) {
//		Mammal 부모 = new Mammal();
//		부모.display(); 	//부모가 본인의 메소드에 접근
		
//		Lion 자식 = new Lion();
//		자식.display();		//자식에 display가 없다면(주석처리) 부모 메소드에 접근
		
		Mammal 부모 = new Lion();	 //부모가 자식주소 갖고 있음
		부모.display(); 	//자식 메소드 -> 다형성:접근주소가 부모, 접근자원은 자식
	}
}
