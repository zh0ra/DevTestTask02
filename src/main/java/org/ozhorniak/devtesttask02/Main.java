package org.ozhorniak.devtesttask02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/**
 * @author OZhorniak
 *
 */
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println(">> Dev test. Task 2");
		long startTime = System.currentTimeMillis();
		new Main().run();
		long allTimes = System.currentTimeMillis() - startTime;
		System.out.println("\n>> " + allTimes + " ms.");
	}

	private void run() throws FileNotFoundException {

		//TaskUtil.getenerateRandomIntSet(100000, 1000);

		taskTest();
	}

	private void taskTest() throws FileNotFoundException {
		int[] arr = TaskUtil.readInput();

		// TaskUtil.printArray(arr);

		System.out.println("\nSet entered pair of integers which sum up to 13");
		sumsToTargetBinarySearch(arr, 13);

	}

	private void sumsToTargetBinarySearch(int[] arr, int k) {
		Arrays.sort(arr);
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			int siblingIndex = Arrays.binarySearch(arr, k - arr[i]);
			if (siblingIndex >= 0) { 
				if (siblingIndex != i || (i > 0 && arr[i-1] == arr[i]) || (i < arr.length - 1 && arr[i+1] == arr[i])) {		
					System.out.println(arr[i] + " " + (k - arr[i]));
					counter++;
					}
				}
		}
		System.out.println("--------------------------------------");
		System.out.println("Pair numbers which sum up to " + k + " : " + (counter / 2));
	}
}
