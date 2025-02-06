package com.saurabh.springdata.customer.custom.generator;

import java.util.EnumSet;
import java.util.Random;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.generator.BeforeExecutionGenerator;
import org.hibernate.generator.EventType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.saurabh.springdata.customer.constant.Constants;
import com.saurabh.springdata.customer.entities.Customer;

public class CustomRandomEmailGenerator implements BeforeExecutionGenerator {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Logger logger = LoggerFactory.getLogger(CustomRandomEmailGenerator.class);

	private static final Random RANDOM = new Random();

	@Override
	public EnumSet<EventType> getEventTypes() {
		return EnumSet.of(EventType.INSERT);
	}

//	@Override
//	public Object generate(SharedSessionContractImplementor session, Object owner, Object currentValue,
//			EventType eventType) {
//		logger.info("SharedSessionContractImplementor session -> " + session);
//		logger.info("Object owner -> " + owner);
//		logger.info("Object currentValue -> " + currentValue);
//		logger.info("EventType eventType -> " + eventType);
//		if (currentValue != null) {
//			if (isValidateEmail(String.valueOf(currentValue))) {
//				return String.valueOf(currentValue);
//			}
//			logger.info("Generating new Email...");
//		}
//		String email = "example@gmail.com";
//		return email;
//	}

	@Override
	public Object generate(SharedSessionContractImplementor session, Object owner, Object currentValue,
			EventType eventType) {
		logger.info("SharedSessionContractImplementor session -> " + session);
		logger.info("Object owner -> " + owner);
		logger.info("Object currentValue -> " + currentValue);
		logger.info("EventType eventType -> " + eventType);
		Customer customer = (Customer) owner;
		String name = customer.getName();
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
			return name.split(" ")[1].toLowerCase() + "." + name.split(" ")[0].toLowerCase() + "@gmail.com";
		case 1:
			return name.split(" ")[1].toLowerCase() + name.split(" ")[0].toLowerCase() + extention + "@gmail.com";
		case 2:
			return name.split(" ")[1].toLowerCase() + "." + name.split(" ")[0].toLowerCase() + extention + "@gmail.com";
		case 3:
			return name.split(" ")[0].toLowerCase() + name.split(" ")[1].toLowerCase() + extention + "@gmail.com";
		case 4:
			return name.split(" ")[0].toLowerCase() + "." + name.split(" ")[1].toLowerCase() + extention + "@gmail.com";
		}
		return name.split(" ")[0].toLowerCase() + "." + name.split(" ")[1].toLowerCase() + "@gmail.com";
	}

	private boolean isValidateEmail(String email) {
		if (email.contains("@") && email.endsWith(".com")) {
			return true;
		}
		logger.info("Email Formate is invalid...");
		return false;
	}

}
