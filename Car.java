package overloadingExample;

public class Car {
	
	private String steer (){
		return "Forward";
	}
	
	private String steer (String direction){
		direction = "Reverse";
		return direction;
	}
	
	public static void main (String[] args){
		Car myCar = new Car();
		System.out.println(myCar.steer());
	}

}

//Overloading happens when 2 or more methods in THE SAME CLASS have the same name BUT different parameters