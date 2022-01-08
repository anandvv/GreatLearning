package com.greatlearning.service;

public class OtpGenerator {
	public static int generateOTP() {
		return 1000 + (int)(Math.random() * 9000);
	}
}
