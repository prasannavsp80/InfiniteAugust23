package com.java.rms;

public class Wallet {

	private int walletId;
	private int custId;
	private double walletAmount;
	private WalletSource walletSource;
	public int getWalletId() {
		return walletId;
	}
	public void setWalletId(int walletId) {
		this.walletId = walletId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public double getWalletAmount() {
		return walletAmount;
	}
	public void setWalletAmount(double walletAmount) {
		this.walletAmount = walletAmount;
	}
	public WalletSource getWalletSource() {
		return walletSource;
	}
	public void setWalletSource(WalletSource walletSource) {
		this.walletSource = walletSource;
	}
	
	
}
