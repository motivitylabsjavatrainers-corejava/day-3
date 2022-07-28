package javaprograms;

import java.util.Scanner;

public class ScannerClassProgram {
	public static void main(String args[]){  
        Scanner in = new Scanner(System.in);  // Scanner class take input from user
        String name = in.nextLine(); 
        System.out.print("Enter your name: ");
        System.out.println("Name is: " + name);             
        in.close(); 
        }  
}  


