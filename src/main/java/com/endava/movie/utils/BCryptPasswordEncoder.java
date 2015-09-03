package com.endava.movie.utils;

import org.springframework.security.crypto.password.PasswordEncoder;

public class BCryptPasswordEncoder implements PasswordEncoder {

	@Override
	public String encode(CharSequence arg0) {
		return MD5Encode.encode("" + arg0);
	}

	@Override
	public boolean matches(CharSequence arg0, String arg1) {
		return (MD5Encode.encode("" + arg0).equals(arg1)) ? true : false;
	}

}
