package Automobile;

import java.util.Scanner;
import java.util.ArrayList;
import Automobile.Vehicle;

public class Main {
	
	public static void display(ArrayList<Vehicle> list,int size) {
		System.out.println("Name\tEngine No.\tChasis No.\tNo. of Tyres\n");
		for(int i = 0; i<size ; i++) {
			Vehicle ob = list.get(i);
			System.out.print(ob.getName() + "\t" + ob.getEngineNumber() + "\t\t" + ob.getChasisNumber() +"\t\t"+ ob.number_of_tyres +"\n");
		}
	}
	
//	public static void input(ArrayList<Vehicle> list,int size) {
//		System.out.print("Name\tEngine No.\tChasis No.\tNo. of Tyres\n");
//		for(int i = 0; i<size ; i++) {
//			Vehicle ob = list.get(i);
//			System.out.print(ob.getName() + "\t" + ob.getEngineNumber() + "\t\t" + ob.getChasisNumber() +"\t\t"+ ob.number_of_tyres +"\n");
//		}
//	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		ArrayList<Vehicle> list = new ArrayList<Vehicle>();
		
		for(int i = 0; i<size ; i++) {
			String name , engine_number;
			int chasis_number , number_of_tyres;
			System.out.print("\nEntry "+ (i+1));
			
			System.out.print("\nName : ");
			name = sc.next();
			
			System.out.print("Engine : ");
			engine_number = sc.next();
			
			System.out.print("Chasis : ");
			chasis_number = sc.nextInt();
			
			System.out.print("No of Tyres : ");
			number_of_tyres = sc.nextInt();
			
			Vehicle ob = new Vehicle(name , engine_number , chasis_number , number_of_tyres);
			list.add(ob);
		}
		
		display(list , size);
		
		sc.close();
	}
}
