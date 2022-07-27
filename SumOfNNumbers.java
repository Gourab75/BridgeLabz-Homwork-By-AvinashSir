package com.bl;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfNNumbers {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the N value");
	int n= sc.nextInt();
	ArrayList<Integer> integer= new ArrayList<>();
	for (int i=0;i<=n;i++) {
		integer.add(i);
	}
	Integer answer=integer.stream().reduce(0,(a,b)->a+b);
		  System.out.println(answer); 
		} 
}

