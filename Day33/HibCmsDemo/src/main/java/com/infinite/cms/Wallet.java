package com.infinite.cms;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Wallet")
@ManagedBean(name="wallet")
@SessionScoped
public class Wallet {
	@Id
	@Column(name="WAL_ID")
	private int walletId;
	@Column(name="CUS_ID")
	private int custId;
	@Column(name="WAL_AMOUNT")
	private double walletAmount;
	@Column(name="WAL_SOURCE")
	@Enumerated(EnumType.STRING)
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
