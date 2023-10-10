package com.infinite.cms;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


@ManagedBean(name="oDao")
@SessionScoped
public class OrdersDAOImpl implements OrderDetailsDAO {

	@Override
	public String placeOrder(int custId, int venId, int menuId, String walSource, int qty, String ordComments) {
		System.out.println("Order Customer Id  " +custId);
		System.out.println("Order Vendor Id  " +venId);
		System.out.println("Order Menu Id  " +menuId);
		System.out.println("Order Wallet Source  " +walSource);
		System.out.println("Order Quantity "+qty);
		System.out.println("Order Comments " +ordComments);
		Menu menu = new MenuDAOImpl().searchByMenuId(menuId);
		System.out.println("Price  " +menu.getMenuPrice());
		double billAmount = menu.getMenuPrice() * qty;
		System.out.println("bill Amount  " +billAmount);
		Wallet wallet = new WalletDAOImpl().showCustomerBalanceDao(custId, walSource);
		System.out.println(wallet);
		System.out.println(wallet.getWalletAmount());
		double walletAmount = wallet.getWalletAmount();
		if (walletAmount - billAmount >= 0) {
			SessionFactory sf = SessionHelper.getConnection();
			Session session = sf.openSession();
			Orders orders = new Orders();
			orders.setCustId(custId);
			orders.setMenuId(menuId);
			orders.setVenId(venId);
			orders.setWalSource(walSource);
			orders.setOrderStatus(OrderStatus.PENDING);
			orders.setOrderQuantity(qty);
			orders.setOrderComments(ordComments);
			orders.setOrderBillAmount(billAmount);
			wallet.setWalletAmount(walletAmount-billAmount);
			Transaction t = session.beginTransaction();
			session.save(orders);
			session.update(wallet);
			t.commit();
			return "Order Placed Successfully...";
		} else {
			return "Insufficient funds...";
		}
//		System.out.println(custId + " " +venId + " " +menuId + " " +walSource + ""+qty+ "" +ordComments);
	}

}
