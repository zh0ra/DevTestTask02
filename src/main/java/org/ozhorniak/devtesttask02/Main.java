package org.ozhorniak.devtesttask02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Strategy:
 * 1. Create data structure(Object) with 3 variables x , y and sum
 * 2. Create hash of summ 
 * 
 * 3. 
 * 
 * 
 * @author zhora
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
	
	//TaskUtil.getenerateRandomIntSet(10000);	
		
		int[] arr = TaskUtil.readInput();
		TaskUtil.measureTime(() -> QuickSort.sort(arr, 0, arr.length-1), "Sorting time: ");
		TaskUtil.printArray(arr);
	}
	
	
	

}
