package com.greatlearning.gradedproject2.assignment1;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println("enter the total no of floors in the building");
			int totalFloor = sc.nextInt();
			FloorFactory floorFactory = new FloorFactory(sc);
			floorFactory.insertValue(totalFloor);
			
		} catch (Exception e) {
			System.out.println("Error Occured in the Floor Factory Process -- " + e);
		}
		
	}

}