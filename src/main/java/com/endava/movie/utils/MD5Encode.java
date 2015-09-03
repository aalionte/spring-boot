package com.endava.movie.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author vcungureanu
 * 
 */
public class MD5Encode {

	private static final Logger LOGGER = LoggerFactory.getLogger(MD5Encode.class);

	private MD5Encode() {
	}

	/**
	 * <p>
	 * Encode given password into MD5 format
	 * </p>
	 * 
	 * @param password
	 * @return
	 */
	public static String encode(String password) {
		String encoding = "";
		try {
			MessageDigest m = MessageDigest.getInstance("MD5");
			m.update(password.getBytes("UTF8"));
			byte[] s = m.digest();
			for (int i = 0; i < s.length; i++) {
				encoding += Integer.toHexString((0x000000ff & s[i]) | 0xffffff00).substring(6);
			}

		} catch (UnsupportedEncodingException | NoSuchAlgorithmException ex) {
			LOGGER.error("MD5 encoding failed: " + password, ex);
			return encoding;
		}
		return encoding;
	}
}
