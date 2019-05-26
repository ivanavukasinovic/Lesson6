package exercises;

import junit.framework.TestCase;

public class StringReversal extends TestCase {
	/*
	 * Without using the reverse() method in StringBuffer or StringBuilder, write a
	 * string reverser that will make this unit test pass.
	 * 
	 * Then use it to decode this message: QcXgW9w4wQd=v?hctaw/moc.ebutuoy
	 */

	static String reverseMe(String word) {

		char[] array = new char[word.length()];
		array = word.toCharArray();

		char[] arrayReversed = new char[array.length];

		int i = array.length - 1;
		int j = 0;
		while (i >= 0) {
			arrayReversed[j] = array[i];
			i--;
			j++;
		}

		String arrayRevAsString = String.valueOf(arrayReversed);
		return arrayRevAsString;

	}

	public void test() {
		assertEquals("cellardoor", reverseMe("roodrallec"));
		System.out.println(reverseMe("QcXgW9w4wQd=v?hctaw/moc.ebutuoy"));
	}

}
