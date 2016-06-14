package test;

import java.util.HashMap;
import java.util.Map.Entry;

/*
 * Utility class which provides basic encryption and decryption
 * Cache implemented as a HashMap. Could be implemented as a key value store in a file.
 * 
 */
public class Deloitte {

	/*
	 * Cache to store Name and its encrypted value
	 * 
	 */
	private static HashMap<String, String> cache = new HashMap<String, String>();

	/*
	 * encrypts a given name
	 * 
	 * @param String
	 * 
	 */
	public static String encrypt(String name) {

		if (name == null || name == "") {
			System.out.println("Please give a valid input");
			return null;
		}

		System.out.println("encrypting " + name);

		if (!(name.length() % 2 == 0)) {
			// name has odd length, so we append a '#' at the end
			name += "#";
		}

		if (cache.containsKey(name)) {

			System.out.println(name + " found in cache");
			return cache.get(name);

		} else {

			int mid = name.length() / 2;
			String crypt = name.substring(mid) + name.substring(0, mid);
			System.out.println("adding to cache");
			cache.put(name, crypt);
			return crypt;
		}

	}

	/*
	 * decrypts a given name
	 * 
	 * @param String
	 * 
	 */
	public static String decrypt(String name) {

		if (name == null || name == "") {
			System.out.println("Please give a valid input");
		}

		System.out.println("decrypting " + name);

		for (Entry<String, String> entry : cache.entrySet()) {
			if (name.equals(entry.getValue())) {
				System.out.println(name + " found in cache");
				return entry.getKey();
			}
		}

		int mid = name.length() / 2;
		String clear_text = name.substring(0, mid) + name.substring(mid);
		clear_text = clear_text.replace("#", "");
		System.out.println("adding to cache");
		cache.put(name, clear_text);
		return name;

	}

	/*
	 * main method
	 * 
	 * Driver to test encrypt and decrypt methods
	 * 
	 */
	public static void main(String[] args) {

		System.out.println("result = " + encrypt("Sridhar") + "\n");

		System.out.println("result = " + encrypt("Sridhar") + "\n");

		System.out.println("result = " + encrypt("Amin") + "\n");
		
		System.out.println("result = " + encrypt("12345") + "\n");

		System.out.println("result = " + decrypt("inAm") + "\n");

		System.out.println("result = " + decrypt("ilAn") + "\n");

		System.out.println("result = " + decrypt("ilAn") + "\n");

	}

}
