package com.roman2numeral.constant;

public enum RomanSimbol {

	M(1000), D(500), C(100), L(50), X(10), V(5), I(1);

	int value;

	private RomanSimbol(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
