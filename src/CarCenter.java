
public class CarCenter {
	public static void main(String[] args) {
		Sonata sonata = new Sonata("Black Sonata");
		repair(sonata);
		
//		Carnival carnival = new Carnival("White Carnival");
//		repair(carnival);
//		
//		Matiz matiz = new Matiz("Red Matiz");
//		repair(matiz);
	}
	
	static void repair(Car car){	//다형성 사용 -> Car로 받으면 repair메소드를 종류별로 만들 필요가 없음, 여기서 Car는 polymorphic parameter
		if(car instanceof Sonata) {	//instanceof 연산자를 활용해 객체의 원형을 역추적
			System.out.println("소나타가 잘 수리되었습니다");
		}else if(car instanceof Carnival) {
			System.out.println("카니발이 잘 수리되었습니다");
		}else if(car instanceof Matiz){
			System.out.println("마티즈가 잘 수리되었습니다");
		}
		
		//System.out.println(car.getName() + "이/가 잘 수리되었습니다");
	}	
}
