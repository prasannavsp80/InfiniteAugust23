package com.java.gen;

import java.util.Comparator;

public class NameComparator implements Comparator<Employ> {

	@Override
	public int compare(Employ e1, Employ e2) {
		return e1.getName().compareTo(e2.getName());
	}

}
