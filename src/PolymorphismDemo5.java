
public class PolymorphismDemo5 {
	public static void main(String[] args) {
		Object obj = new Object();
		String str = new String("Hello, World");
		obj = (Object)str;		//자동, 강제형변환 둘다 항상 성공
		System.out.println(obj.toString());
		
		if(obj instanceof String) {
			String another = (String)obj;
			System.out.println(another);
		}else {
			System.out.println("Disabled");
		}
	}
}
