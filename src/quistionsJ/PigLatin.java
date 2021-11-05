package quistionsJ;

import java.util.Arrays;

public class PigLatin {

	public static String[] stringTolatin(String a) {

		String[] stringArray = a.split(" ");
		System.out.println(a);
		for (int i = 0; i < stringArray.length; i++) {

//			System.out.println(stringArray[i].charAt(0));

			char f = 'x';
			if (stringArray[i].length() > 1) {
				stringArray[i] = stringArray[i].substring(1) + stringArray[i].charAt(0) + "AY";
				System.out.println(stringArray[i]);
			}

		}
		System.out.println(Arrays.toString(stringArray));
		return stringArray;
	}

	public static void main(String[] args) {

		stringTolatin("i have to go to my room now");

	}

}
