import java.util.Scanner;

public class PolymorphismDemo2 {
	public static void main(String[] args) {
		String y_n = null;
		Scanner sc = new Scanner(System.in);	//main에서만 쓰는 지역변수
		do {
			showMenu();
			int choice = input(sc);	//main에서만 쓰는 지역변수니까 input에 scanner를 넘겨줌
			output(choice);
			System.out.print("Again(y/n) ? : ");
			y_n = sc.next();	//next든 nextLine이든 상관없음
		}while(y_n.equals("Y")||y_n.equals("y"));
	}
	
	static void showMenu() {
		System.out.println("************Menu************");
		System.out.println("1. Lion");
		System.out.println("2. Cat");
		System.out.println("3. Dog");
		System.out.println("4. Korean");
		System.out.println("5. American");
	}
	
	static int input(Scanner myScanner) {
		System.out.print("당신은 어느 종족이십니까?(1~5) : ");
		return myScanner.nextInt();
	}
	
	static void output(int choice) {
		Mammal m = null;
		switch(choice) {
			case 1:
				m = new Lion();	//자식주소가 부모주소로 형변환
				break;
			case 2:
				m = new Cat();
				break;
			case 3:
				m = new Dog();
				break;
			case 4:
				m = new Korean();
				break;
			case 5:
				m = new American();
				break;
			default:
				System.out.println("잘못된 번호입니다");
				return;
		}
		m.saySomething();
	}
}

