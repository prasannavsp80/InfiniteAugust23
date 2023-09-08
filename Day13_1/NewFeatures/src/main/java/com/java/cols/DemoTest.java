package com.java.cols;

import java.util.Optional;

public class DemoTest {

	static Demo demo;
	
	public void showTest() {
		Optional<Demo> result = Optional.ofNullable(demo);
		if (result.isPresent()) {
			demo.show();
		} else {
			System.out.println("Object Memory not Initialized...");
		}
		
	}
}
