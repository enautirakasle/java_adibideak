package oop.interfazeak;

import java.util.Comparator;

public class LaukiComparator implements Comparator<Laukia> {

	@Override
	public int compare(Laukia l1, Laukia l2) {
		return (int) (l1.area()-l2.area());
	}

}
