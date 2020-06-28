package com.geekq.miaosha.redis;

public class RedisCountUtil {

	private static final String visitKey = "-->";

	public static Long initOrIncrVisitCount(RedisService redisService) {
		/*
		 * boolean exists = redisService.exists(CountKey.visitCount, visitKey); if
		 * (!exists) { synchronized (RedisCountUtil.class) { if
		 * (!redisService.exists(CountKey.visitCount, visitKey)) {
		 * redisService.set(CountKey.visitCount, visitKey, 0); } } }
		 */
		return redisService.incr(CountKey.visitCount, visitKey);
	}
}
