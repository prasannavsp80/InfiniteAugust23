package com.infinite.cms;

import java.util.List;

public interface VendorDAO {
	
	List<String> showVendorNamesDao();
	Vendor searchByVendorNameDao(String name);
}
