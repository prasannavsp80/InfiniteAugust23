package com.java.prop;

public class Agent {

	private int agentId;
	private String agentName;
	private double premium;
	
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	@Override
	public String toString() {
		return "Agent [agentId=" + agentId + ", agentName=" + agentName + ", premium=" + premium + "]";
	}

	
}
