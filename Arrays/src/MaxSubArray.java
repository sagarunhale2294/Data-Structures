/**
 * 
 */
package com.cts.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Sagar Unhale
 * Class to find max length of subarray where a[0]>a[length-1]
 */
public class MaxSubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int testCases=scanner.nextInt();
		for(int i=0;i<testCases;i++){
			int n=scanner.nextInt();
			int arr[]=new int[n];
			for(int j=0;j<n;j++){
				arr[j]=scanner.nextInt();
			}
			subArray(arr);
		}
		scanner.close();
	}

	/**
	 * Method to return max length of subarray
	 * @param arr
	 */
	private static void subArray(int[] arr) {
		int i,j;
		int g=0;
		for(i=0;i<arr.length;i++){
			int a[]=null;
			for(j=i;j<arr.length;j++){
				a=Arrays.copyOfRange(arr, i, j+1);
				System.out.println(Arrays.toString(a));
				if(a.length!=1 && a.length!=arr.length){
					if(a[0]>a[a.length-1]){
						if(g<a.length)
							g=a.length;
					}
				}
			}
		}
		System.out.println(g);	

	}

}
