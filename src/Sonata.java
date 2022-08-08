
public class Sonata extends Car {	//자식은 부모의 기본생성자만 호출해야함
	public Sonata(String name) {		//-> super 메소드 이용해서 특정 생성자 호출
		super(name);
	}
}
