package com.infinite.cms;

import java.util.List;

public interface WalletDAO {

	List<Wallet> showCustomerWalletDao(int custId);
	List<String> showCustomerWalletNames(int custId);
	Wallet showCustomerBalanceDao(int custId,String walletName);
}
