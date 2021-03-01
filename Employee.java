package com.surer;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
// I take new 3 employees name
		Scanner scanner = new Scanner(System.in);
		String[] firstName = new String[3];
		System.out.println("Input all employer's names here: ");
		for (int i = 0; i < firstName.length; i++) {
			firstName[i] = scanner.nextLine();
		}
// I take new 3 employees surname
		Scanner sign = new Scanner(System.in);
		String[] lastName = new String[3];
		System.out.println("Input all employer's last names here: ");
		for (int i = 0; i < lastName.length; i++) {
			lastName[i] = sign.nextLine();
		}
// I take new 3 employees titles
		Scanner element = new Scanner(System.in);
		String[] title = new String[3];
		System.out.println("Input all employer's titles here: ");
		for (int i = 0; i < title.length; i++) {
			title[i] = element.nextLine();
		}
// I take new 3 employees social security number
		Scanner data = new Scanner(System.in);
		int[] socialSecurityNumber = new int[3];
		System.out.println("Input all employer's social security number here: ");
		for (int i = 0; i < title.length; i++) {
			socialSecurityNumber[i] = data.nextInt();
		}
// I take new 3 employees old salary
		Scanner money = new Scanner(System.in);
		double[] salary = new double[3];
		System.out.println("Input all employer's salaries: ");
		for (int i = 0; i < salary.length; i++) {
			salary[i] = money.nextDouble();
		}
//now i print these datas here
		System.out.println("Here is the all data.");
		for (int i = 0; i < firstName.length; i++) {
			System.out.println("First Name: " + firstName[i]);
		}
		for (int i = 0; i < lastName.length; i++) {
			System.out.println("Last name: " + lastName[i]);
		}
		for (int i = 0; i < title.length; i++) {
			System.out.println("Title: " + title[i]);
		}
		for (int i = 0; i < socialSecurityNumber.length; i++) {
			System.out.println("Security Number: " + socialSecurityNumber[i]);
		}
		for (int i = 0; i < salary.length; i++) {
			System.out.println("Previous salary: " + salary[i]);
		}
		// I take 3 employees old salary and calculate raised salary which is i said
		//current salary
		double [] giveRaise = new double[3];
		for(int i =0; i< salary.length; i++){
			giveRaise[i] = salary[i] + (salary[i]* 10/100);
			System.out.println("Current salary: "+ giveRaise[i]);
		}
	}
}

