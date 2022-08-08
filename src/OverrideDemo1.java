
public class OverrideDemo1 {
	public static void main(String[] args) {
		Point original = new Point(30, 50);
		Point another = new Point(30, 50);
		//if(original == another) System.out.println("같다");	//== 연산자는 original과 another의 주소를 비교하는 연산자 -> 재정의가 안됨
		if(original.equals​(another)) System.out.println("같다");	//equals도 주소비교하는 메소드 -> (메소드는 재정의할 수 있으니까) 주소비교가 아닌 값을 비교하는 메소드로 재정의
		else System.out.println("다르다");
	}
}

class Point extends Object{
	int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public boolean equals​(Object obj) {	//equals 재정의
		Point child = (Point)obj;
		if(this.x == child.x && this.y == child.y) return true;
		else return false;
	}
}