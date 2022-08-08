
public class PolymorphismDemo4 {
	//Heterogeneous Collection
	public static void main(String[] args) {
		Mammal [] array = new Mammal[5];
		array[0] = new Lion();
		array[1] = new Cat();
		array[2] = new Dog();
		array[3] = new Korean();
		array[4] = new American();	//포유류 배열 -> 부모형 배열이니까, 부모가 같으니까
		
		for(Mammal m:array) m.saySomething();
		
		Car [] cars = {new Sonata("Black Sonata"), new Carnival("White Carnival"), new Matiz("Red Matiz")};
		for(Car car:cars) {
			System.out.println(car.getName() + "이/가 잘 수리되었습니다");
		}
	}
}
