package com.itnovit.example.basics;

import java.util.Scanner;

public class UserInput {

	private Scanner input;
	private int var1;
	private int var2;
	private int rta;
	
	public UserInput() {
		
		this.input = new Scanner(System.in);

	}

	public Scanner getScanner() {
		return input;
	}

	public void setScanner(Scanner input) {
		this.input = input;
	}

	public int getVar1() {
		return var1;
	}

	public void setVar1(int var1) {
		this.var1 = var1;
	}

	public int getVar2() {
		return var2;
	}

	public void setVar2(int var2) {
		this.var2 = var2;
	}

	public int getRta() {
		return rta;
	}

	public void setRta(int rta) {
		this.rta = rta;
	}
	
	public static void main(String[] args) {
	
		UserInput inputUser = new UserInput();
		System.out.println("Enter two numbers to operate them:");
		inputUser.setVar1(inputUser.getScanner().nextInt());
		inputUser.setVar2(inputUser.getScanner().nextInt());
		System.out.println("The sun of the two numbers is: " + (inputUser.getVar1() + inputUser.getVar2()));
		System.out.println("The rest of the two numbers is: " + (inputUser.getVar1()- inputUser.getVar2()));
	
	}
}
