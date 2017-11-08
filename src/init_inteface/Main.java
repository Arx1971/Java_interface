package init_inteface;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String args[]){

		int a[] = new int [100]; // perform bubble sort;
		int b[] = new int [100]; // perform quick sort;
		int c[] = new int [100]; // perform merge sort
		
		int an,bn,cn;
		
		//Creating object for each class
		
		Sort_interface ob1 = new Bubble_sort();
		Sort_interface ob2 = new Quick_sort();
		Sort_interface ob3 = new Merge_sort();
		
		//First array
		an = input.nextInt();
		input_machine(a, an);
		System.out.println("Array_1: ");
		output_machine_1(a,0,an);
		ob1.sort_array(a,0,an-1);
		ob1.output_machine(a,0,an);
		
		//Second Array
		bn = input.nextInt();
		input_machine(b,bn);
		System.out.println("Array_2");
		output_machine_1(b,0,bn);
		ob2.sort_array(b,0,bn-1);
		ob2.output_machine(b,0,bn);
		
		//Third array
		cn = input.nextInt();
		input_machine(c, cn);
		System.out.println("Array_3");
		output_machine_1(c, 0, cn);
		ob3.sort_array(c, 0, cn-1);
		ob3.output_machine(c, 0, cn);
		
	}
	static void input_machine(int a[],int n){
		Random rand = new Random();
		for(int i=0; i<n; i++){
			a[i] = rand.nextInt(100);
		}
	}
	static void output_machine_1(int a[],int start,int end){
		for(int i=start; i<end; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
