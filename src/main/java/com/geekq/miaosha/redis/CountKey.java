package com.geekq.miaosha.redis;

public class CountKey extends BasePrefix{

	private CountKey( int expireSeconds, String prefix) {
		super(expireSeconds, prefix);
	}
	private CountKey(String prefix) {
		super(prefix);
	}
	public static CountKey visitCount = new CountKey("visit-");

}
