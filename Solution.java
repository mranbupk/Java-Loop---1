package co.anbu;

import java.util.Scanner;

class IntegerToBinary {
	int[] Binary = new int[35];
	int id = 0;
	void printBinary(int binary[], int n){
  		for(int i = n-1; i >= 0; i--) {
 			System.out.print(Binary[i] + " ");
 		}
 		
 	}
	void intBin(int num) {
		if(num < 1 || num > 999) {
			System.out.println("INVALID_INPUT");
		}
		else{
			while(num>0) {
				Binary[id++] = num % 2;
				num = num / 2;
				}
			printBinary(Binary,id);
			
		}
	}
 	
}
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		IntegerToBinary n1 = new IntegerToBinary();
		n1.intBin(n);
	}
}
