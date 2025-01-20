package Algorthims;

import java.util.Arrays;

public class AllInOne {
	public static void main(String[] args) {
		// Bubble Sort
		int nums[] = { 89, 37, 22, 83, 00, 19, -87, 6 };
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length - i; j++) {
				if (nums[j - 1] > nums[j]) {
					int store = nums[j];
					nums[j] = nums[j - 1];
					nums[j - 1] = store;
				}
			}
		}
		System.out.println("Bubble sort: " + Arrays.toString(nums));

		// selection sort
		int selection[] = { 67, 45, 34, 9, 54, 97 };
		for (int i = 0; i < selection.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < selection.length; j++) {
				if (selection[min] > selection[j]) {
					min = j;
				}
			}
			int store = selection[min];
			selection[min] = selection[i];
			selection[i] = store;
		}
		System.out.println("Selection Sort: " + Arrays.toString(selection));

		// Linear Search
		int linear[] = { 9209, 7623, 8771, 8322, 3231, 9072 };
		int target = 9209;
		int index = -1;
		for (int i = 0; i < linear.length; i++) {
			if (linear[i] == target) {
				index = i;
				break;
			}
		}
		System.out.print("Linear Search:- ");
		if (index == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at " + (index + 1) + " position");
		}
		// Binary Search
		int binary[] = { 87, 89, 32, 49, 01, 83, 23, 11 };
		// 1st sort the element by using selection sort
		for (int i = 0; i < binary.length-1; i++) {
			int min=i;
			for (int j =i+1; j < binary.length; j++) {
				if (binary[min]>binary[j]) {
					min=j;
				}
			}
			int store=binary[min];
			binary[min]=binary[i];
			binary[i]=store;
		}
		System.out.println("sorting using binary search: "+Arrays.toString(binary));
		int f = 0, l = binary.length;
		int taget = 23;
		while (f <= l) {
			int mid = (l + f) / 2;
			if (binary[mid] == taget) {
				System.out.println("Element Found");break;
			} else if (target > binary[mid]) {
				l = mid + 1;
			} else {
				f = mid - 1;
			}
		}
		if (f > l) {
			System.out.println("Sorry Element is not Found!");
		}
	}
}
