package com.itnovit.example.basics.encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BalancedString {

	private Scanner input;

	public BalancedString() {
		this.input = new Scanner(System.in);
	}

	public Scanner getInput() {
		return input;
	}

	public void setInput(Scanner input) {
		this.input = input;
	}

	public boolean balancedString(String input) {
		List<Character> chars = new ArrayList<>();
		for (char ch : input.toCharArray()) {
			chars.add(ch);
		}
		List<Character> chars2 = new ArrayList<>();
		int count = 0;

		for (Character s : chars) {
			if (s.equals('(') || s.equals('{') || s.equals('[')) {
				chars2.add(s);
				count++;
			}
			if (s.equals(')') || s.equals('}') || s.equals(']')) {
				if (s.equals(')') && chars2.isEmpty()) {
					count--;
					break;
				} else {
					if ((!chars2.isEmpty())) {
						if (chars2.get(chars2.size() - 1).equals('(')) {
							chars2.remove(chars2.size() - 1);
							count--;
						}
					}
				}
				if (s.equals('}') && chars2.isEmpty()) {
					count--;
					break;
				} else {
					if ((!chars2.isEmpty())) {
						if ((!chars2.isEmpty())) {
							if (chars2.get(chars2.size() - 1).equals('{')) {
								chars2.remove(chars2.size() - 1);
								count--;
							}
						}
					}
				}
				if (s.equals(']') && chars2.isEmpty()) {
					count--;
					break;
				} else {
					if ((!chars2.isEmpty())) {
						if (chars2.get(chars2.size() - 1).equals('[')) {
							chars2.remove(chars2.size() - 1);
							count--;
						}
					}
				}
			}
		}
		boolean rta = false;
		if (count == 0) {
			rta = true;
		} else {
			rta = false;
		}
		return rta;
	}
	
	public static void main(String[] args) {
		BalancedString bc = new BalancedString();
		System.out.println("Enter a brakets String to valide if it's balanced: ");
		String inputString = bc.getInput().next();
		boolean isBalanced = bc.balancedString(inputString);
		if(isBalanced)
			System.out.println("The braket string entered is balanced!");
		else
			System.out.println("The braket string entered isn't balanced!");
		
		
	}

}
