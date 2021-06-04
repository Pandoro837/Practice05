package com.javaex.ex09;

import javax.naming.spi.DirStateFactory.Result;

public class StringUtil {

	public static String concatString(String[] str) {

		String result = new String();

		for (int i = 0; i < str.length; i++) {

			result = result.concat(str[i]);

		}

		return result;

	}

}
