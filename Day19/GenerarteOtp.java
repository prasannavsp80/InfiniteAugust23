package com.java.infinite;

import java.util.Random;

public class GenerarteOtp {

	public static void main(String[] args) {
		System.out.println(generateOtp());
	}

	public static int generateOtp() {
		Random r = new Random( System.currentTimeMillis() );
	    return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
	}

}
