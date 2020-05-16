package Test;
//2019314901 Á¶Çö¼ö

public class Animal {
	
	String name;
	float weight;
		
}

abstract class Mammal extends Animal {
	static int numMammal = 0;
	abstract int getNumMammals();

}

abstract class Reptile extends Animal {
	static int numReptile = 0;
	abstract int getNumReptile();
}

final class Cat extends Mammal implements breed {
	String nameSlave;
	
	
	int getNumMammals() {
		return numMammal;
	}
	
	Cat (String name) {
		this.name = name;
		numMammal += 1;
	}
	
	Cat (String name, float weight) {
		this.name = name;
		this.weight = weight;
		numMammal +=1;
	}
	
	public void Breed() {
		numMammal += 3;
	}
	
	public void sleep() {
		System.out.println("("+name+") : Zzz");	
	}
	public void meow() {
		System.out.println("("+name+") : meow");	
	}
	
}

final class Dog extends Mammal {
	String nameMaster;
	
	
	int getNumMammals() {
		return numMammal;
	}
	
	Dog (String name) {
		this.name = name;
		numMammal += 1;
	}
	
	Dog (String name, float weight) {
		this.name = name;
		this.weight = weight;
		numMammal += 1;
	}
	
	public void Breed() {
		numMammal += 5;
	}
	
	public void bark() {
		System.out.println("("+name+") : bowwow");	
	}
}

final class Crocodile extends Reptile {
	int getNumReptile() {
		return numReptile;
	}
	
	Crocodile (String name) {
		this.name = name;
		numReptile += 1;
	}
	
	Crocodile (String name, float weight) {
		this.name = name;
		this.weight = weight;
		numReptile += 1;
	}
	
	void spawn() {
		numReptile += 20;	
	}
}

