package com.java.cons;

public class Cricket {

	static int score;
	
	public void increment(int x) {
		score+=x;
	}
	
	public static void main(String[] args) {
		Cricket fb = new Cricket();
		Cricket sb = new Cricket();
		Cricket ext = new Cricket();
		
		fb.increment(12);
		sb.increment(13);
		ext.increment(5);
		System.out.println(Cricket.score);
	}
}
