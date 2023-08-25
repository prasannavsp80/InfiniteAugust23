package com.java.prop;

public class WriteOnlyEx {

	public static void main(String[] args) {
		Agent agent = new Agent();
		agent.setAgentId(1);
		agent.setAgentName("Raj");
		agent.setPremium(88432.4);
		
		System.out.println(agent);
	}
}
