package no.hvl.dat110.util;

/**
 * exercise/demo purpose in dat110
 * @author tdoy
 *
 */


import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash { 
	
	
	public static BigInteger hashOf(String entity) {	
		

		BigInteger hashInt;
		// Task: Hash a given string using MD5 and return the result as a BigInteger.

		// we use MD5 with 128 bits digest

		// compute the hash of the input 'entity'
		
		// convert the hash into hex format

		// convert the hex into BigInteger
		
		// return the BigInteger
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");

			md.update(entity.getBytes());

			byte[] bytes = md.digest();

			String generatedValue = toHex(bytes);

			hashInt = new BigInteger(generatedValue,16);

		}catch (NoSuchAlgorithmException e){
			throw new RuntimeException(e);
		}
		
		return hashInt;
	}
	
	public static BigInteger addressSize() {
		
		// Task: compute the address size of MD5
		
		// compute the number of bits = bitSize()
		return new BigInteger("2").pow(128);
	}
	
	public static int bitSize() {
		
		int digestlen = 128;
		
		// find the digest length
		
		return digestlen;
	}
	
	public static String toHex(byte[] digest) {
		StringBuilder strbuilder = new StringBuilder();
		for(byte b : digest) {
			strbuilder.append(String.format("%02x", b&0xff));
		}
		return strbuilder.toString();
	}

}
