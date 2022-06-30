package com.revature;

public class Launcher {
	public static void main(String[] args) {
		String[] days = {"Monday","Tuesday","Wednesday",
				"Thursday","Friday","Saturday", "Sunday",};
		for(String day : days) {   
			System.out.println(day);
			if(day.charAt(0)=='T'||day.charAt(0)=='S') {
				System.out.println("Go to the Gym.");
			} else {
				System.out.println("stay home");
			}
			
		}
	}
}
