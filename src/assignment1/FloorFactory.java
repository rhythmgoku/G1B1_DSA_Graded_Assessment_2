package assignment1;

import java.util.Scanner;

public class FloorFactory {

	private Scanner scanner;

	public FloorFactory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FloorFactory(Scanner scanner) {
		super();
		this.scanner = scanner;
	}

	public void insertValue(int totalFloor) {
		int[] floors = new int[totalFloor];
		for (int i = 0; i < totalFloor; i++) {
			System.out.println("enter the floor size given on day : " + (i + 1));
			int value = scanner.nextInt();
			for (int j = 0; j <= i; j++) {
				if (value == floors[j]) {
					System.out.println("Duplicate value is not allowed");
					i--;
					break;
				}

			}

			floors[i] = value;
		}

		floorCount(floors, totalFloor);
	}

	private void floorCount(int floors[], int totalFloor) {

		System.out.println("\nThe order of construction is as follows \n");
		while (totalFloor > 0) {
			for (int i = 0; i < floors.length; i++) {

				if (floors[i] == totalFloor) {
					System.out.println("Day: " + (i + 1));
					System.out.print(floors[i] + " ");
					totalFloor--;
					for (int j = 0; j < i; j++) {
						if (floors[j] == totalFloor) {
							System.out.print(floors[j] + " ");
							floorCount(floors, totalFloor - 1);
						}
					}

					System.out.println();

				} else {
					System.out.println("Day: " + (i + 1) + "\n ");

				}
			}
		}
	}
}
