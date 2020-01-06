//comments
package com.revature;

import com.revature.pojo.Car;

public class HelloWorld {
	
	static public void main(String... pirateSounds) {
		System.out.println("Hello World");
		Car car1;
		Car car2 = new Car(); //creates an instance of a Car(an object), by invoking the (default) Constructor
		car1 = car2;
		//Car car1 = new Car();
		//Car car1;
		//car1 = new Car();
		car1.setMake("Ford");
		car1.setModel("Fusion F150");
		car1.setYear(2020);
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
	}

}
