package Automobile;

public class Vehicle {
	String name , engine_number;
	int chasis_number , number_of_tyres;
	
	Vehicle(String name , String engine_number , int chasis_number , int number_of_tyres){
		this.name = name;
		this.engine_number = engine_number;
		this.chasis_number = chasis_number;
		this.number_of_tyres = number_of_tyres;
	}
	
	
	
	//Getters
	public String getName() {
		return name;
	}
	
	public String getEngineNumber() {
		return engine_number;
	}
	
	public int getChasisNumber() {
		return chasis_number;
	}
	
	public int getNumberOfTyres() {
		return number_of_tyres;
	}
}
