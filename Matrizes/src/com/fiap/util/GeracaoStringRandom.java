package com.fiap.util;

import java.util.Random;

public class GeracaoStringRandom {

	static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public static void main(String[] args) {
		
		System.out.println(randomString(5));
		
	}

	static Random rnd = new Random();

	public static String randomString(int len) {

		StringBuilder sb = new StringBuilder(len);

		for (int i = 0; i < len; i++)
			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		return sb.toString();
	}
}
