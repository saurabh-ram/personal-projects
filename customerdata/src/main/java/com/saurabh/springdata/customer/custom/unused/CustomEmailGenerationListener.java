package com.saurabh.springdata.customer.custom.unused;

import java.lang.reflect.Field;
import java.time.Duration;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.saurabh.springdata.customer.constant.Constants;
import com.saurabh.springdata.customer.custom.annotation.CustomEmailGenerator;
import com.saurabh.springdata.customer.custom.annotation.CustomNameGenerator;

import jakarta.persistence.PrePersist;

public class CustomEmailGenerationListener {

	private Logger logger = LoggerFactory.getLogger(CustomEmailGenerationListener.class);

	private static final Random RANDOM = new Random();

	@PrePersist
//	@PostPersist
	public void generateEmail(Object entity) throws InterruptedException {
		Class<?> clazz = entity.getClass();
		String name = null;

//		for (Field field : clazz.getDeclaredFields()) {
//			if (field.isAnnotationPresent(CustomNameGenerator.class)
//					|| field.isAnnotationPresent(CustomEmailGenerator.class)) {
//				field.setAccessible(true);
//				if (field.isAnnotationPresent(CustomNameGenerator.class)) {
//					name = fetchName(entity, name, field);
//				} else {
//					setEmail(entity, name, field);
//				}
//			}
//
//		}

		for (Field field : clazz.getDeclaredFields()) {
			field.setAccessible(true);
			if (field.isAnnotationPresent(CustomNameGenerator.class)) {
//				field.setAccessible(true);
				name = fetchName(entity, name, field);
			} else if (field.isAnnotationPresent(CustomEmailGenerator.class)) {
//				field.setAccessible(true);
				setEmail(entity, name, field);
			}
		}

	}

	private String fetchName(Object entity, String name, Field field) throws InterruptedException {
		try {
			Thread.sleep(Duration.ofSeconds(2));
			name = (String) field.get(entity);
			logger.info("Name is " + name);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return name;
	}

	private void setEmail(Object entity, String name, Field field) {
		try {
			String email = generateEmailFromName(name, (String) field.get(entity));
			field.set(entity, email);
			logger.info("Email is " + email);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	protected String generateEmailFromName(String name, String currentValue) {
		if (name == null) {
			return Constants.DEFAULT_EMAIL;
		}
		name = name.trim();
		if (currentValue != null) {
			if (isValidateEmail(String.valueOf(currentValue))) {
				return String.valueOf(currentValue);
			}
			logger.info("Generating new Email...");
		}
		if (name.contains(" ") && name.split(" ").length == 2) {
			return emailPatterns(name);
		} else if (name.contains(" ") && name.split(" ").length > 2) {
			return Constants.DEFAULT_EMAIL;
		} else {
			return name + "@gmail.com";
		}
	}

	private String emailPatterns(String name) {
		int num = RANDOM.nextInt(6);
		int extention = RANDOM.nextInt(10000);
		switch (num) {
		case 0:
			return name.split(" ")[1] + "." + name.split(" ")[0] + "@gmail.com";
		case 1:
			return name.split(" ")[1] + name.split(" ")[0] + extention + "@gmail.com";
		case 2:
			return name.split(" ")[1] + "." + name.split(" ")[0] + extention + "@gmail.com";
		case 3:
			return name.split(" ")[0] + name.split(" ")[1] + extention + "@gmail.com";
		case 4:
			return name.split(" ")[0] + "." + name.split(" ")[1] + extention + "@gmail.com";
		}
		return name.split(" ")[0] + "." + name.split(" ")[1] + "@gmail.com";
	}

	private boolean isValidateEmail(String email) {
		if (email.contains("@") && email.endsWith(".com")) {
			return true;
		}
		logger.info("Email Formate is invalid...");
		return false;
	}

}
