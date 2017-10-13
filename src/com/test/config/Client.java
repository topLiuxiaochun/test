package com.test.config;

public class Client {

	public static void main(String[] args) {
		CookieExpire cookie = CookieExpire.THIRTY;
		System.out.println(cookie.getExpireTime());

	}

}
