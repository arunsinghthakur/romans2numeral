package com.roman2numeral.service;

public class Roman2NumeralServiceImpl implements Roman2NumeralService {

	public int convert(String roman) {
		int result = 0;
		char lastSimbol = 0;
		for (int i = 0; i < roman.length(); i++) {
			char simbol = roman.charAt(i);
			int negativeNum = 0;

			if (i > 0 && roman.length() > i) {
				lastSimbol = roman.charAt(i - 1);
				if (lastSimbol != simbol) {
					switch (lastSimbol) {
					case 'D': {
						if (simbol == 'M')
							negativeNum = 500;
						break;
					}
					case 'C': {
						if (simbol == 'M' || simbol == 'D')
							negativeNum = 100;
						break;
					}
					case 'L': {
						if (simbol == 'M' || simbol == 'D' || simbol == 'C')
							negativeNum = 50;
						break;
					}
					case 'X': {
						if (simbol == 'M' || simbol == 'D' || simbol == 'C' || simbol == 'L')
							negativeNum = 10;
						break;
					}
					case 'V': {
						if (simbol == 'M' || simbol == 'D' || simbol == 'C' || simbol == 'L' || simbol == 'X')
							negativeNum = 10;
						break;
					}
					case 'I': {
						if (simbol == 'M' || simbol == 'D' || simbol == 'C' || simbol == 'L' || simbol == 'X' || simbol == 'V')
							negativeNum = 1;
						break;
					}
					}
				}
			}
			negativeNum = negativeNum*2;
			switch (simbol) {
			case 'M': {
				result += (1000 - negativeNum);
				break;
			}
			case 'D': {
				result += (500 - negativeNum);
				break;
			}
			case 'C': {
				result += (100 - negativeNum);
				break;
			}
			case 'L': {
				result += (50 - negativeNum);
				break;
			}
			case 'X': {
				result += (10 - negativeNum);
				break;
			}
			case 'V': {
				result += (5 - negativeNum);
				break;
			}
			case 'I': {
				result += (1 - negativeNum);
				break;
			}
			default:
				throw new IllegalArgumentException();
			}
		}

		return result;
	}
}
