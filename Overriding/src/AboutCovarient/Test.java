package AboutCovarient;

class Animal {

}

class Dog extends Animal {

}

class Lion extends Animal {

}

class AnimalShelter {
	Animal getAnimal() {
		return new Animal();
	}
}

class DogShelter extends AnimalShelter {
	@Override
	Dog getAnimal() {
		System.out.println("Dog");
		return new Dog();
	}
}

public class Test {
	public static void main(String[] args) {
		DogShelter dog = new DogShelter();
		dog.getAnimal();
	}

}
