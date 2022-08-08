//override 메소드
/*
 * Method's override 조건
 * 1 Method's Signature가 같은가?
 *  - 메소드의 필수 3요소(이름, 괄호, 리턴타입)가 같은가?
 * 2 접근제한자(Access Modifier)의 관계
 *  - private < package(default) < protected < public
 */
public class OverrideDemo {
	public static void main(String[] args) {
		Jasik jasik = new Jasik();
		jasik.makeMoney();
	}
}
