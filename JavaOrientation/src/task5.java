
public class task5 {

	public static void main(String[] args) {
		Dog dog = new Dog("ポチ", 5, 12.3);
		System.out.println("名前： " + dog.name);
		System.out.println("年齢： " + dog.age + "才");
		System.out.println("体重： " + dog.weight + "kg");
		dog.run();

		Animal animal = new Animal();
		animal.sleep();
		dog.sleep();
	}

}
