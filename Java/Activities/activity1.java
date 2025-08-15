package activities;

public class activity1 {

	public static void main(String[] args) {
		Car honda = new Car("black","Automative",2000);
		
		//print details of car
		honda.displayCharacteristics();
		//Move the car
		honda.accelerate();
		//Stop the car
		honda.brake();
		

	}

}
