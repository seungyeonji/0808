
public class Jasik extends Bumo {
	@Override	//상속x
	public void makeMoney() {	//이름은 같으나 구현부는 다름
		System.out.println("나는 자식의 메소드입니다");
	}
}
