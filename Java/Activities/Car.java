package activities;

public class Car {

	   String color;
	   String transmission;
	   int make;
	   int tyres =4;
	   int doors =4;
	   
	   
public Car(String color,String transmission,int make) {
		   this.color=color;
		   this.transmission=transmission;
		   this.make=make;
		   
	   }
public void displayCharacteristics() {
		   System.out.println("The color is "+ color);
		   System.out.println("The transmission type is "+ transmission);
		   System.out.println("The color was made in  "+ make);
		   System.out.println("It  has is "+ doors + "doors");
		   System.out.println("It  has is "+ tyres + "tyres");
	   }
public void accelerate() {
		   System.out.println("Te car is moving forward");
	   }
public void brake() {
		   System.out.println("The car has stopped");
	   }
}



