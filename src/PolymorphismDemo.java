/*
 * Polymorphism의 조건
 * 1. Method's Override
 * 2. Object Cast(객체 형변환)
 *  1) Value Type
 *  	a. 자동형변환(Implicit conversion, Promotion) : 작은쪽에서 큰쪽으로 변환 ex.int->long
 *  	b. 강제형변환(Explicit conversion, Demotion) : 큰쪽에서 작은쪽으로 변환, () 연산자를 사용
 *  2) Object Type
 *  	a. 자동형변환(Implicit conversion, Promotion, Cast Up) : 자식 -> 부모(항상 성공)
 *  	b. 강제형변환(Explicit conversion, Demotion, Cast Down) : 부모 -> 자식(강제적 형변환만 가능하며, 될때도 있고 안될때도 있다)
 */

public class PolymorphismDemo {
	public static void main(String[] args) {
//		Test t = new Test();
//		Demo d = new Demo();
		
		Test t = new Demo();	//자식은 부모의 주소를 받을수 있을까? -> t가 부모주소 -> 부모가 자식의 자원을 사용하는게 다형성
		//부모가 자식주소로 접근? 몰라
		
		//형변환 test
//		t = d;		//자동형변환
//		t = (Test)d;	//강제형변환
		//-> 자식클래스는 자동이든 강제든 형변환 항상 성공
		
//		d = t;		//부모가 자식 될때 자동형변환 오류 -> 부모는 자식으로 형변환되지않음
//		d = (Demo)t;	//강제형변환은 코드자체에서는 오류 안뜨지만 출력하면 결과에서 오류발생 -> instanceof 연산자 사용해서 부모객체가 자식객체로 형변환이 가능한지 여부 판단
		
//		if(t instanceof Demo) {	//instanceof 연산자
//		d = (Demo)t;
//	}else {
//		System.out.println("형변환 불가능");
//	}
		
	}
}

class Test{}	//부모
class Demo extends Test{}	//자식