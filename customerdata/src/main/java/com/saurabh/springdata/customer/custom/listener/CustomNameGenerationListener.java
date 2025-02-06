package com.saurabh.springdata.customer.custom.listener;

import java.lang.reflect.Field;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.saurabh.springdata.customer.constant.Constants;
import com.saurabh.springdata.customer.custom.annotation.CustomNameGenerator;

import jakarta.persistence.PrePersist;

public class CustomNameGenerationListener {

	private Logger logger = LoggerFactory.getLogger(CustomNameGenerationListener.class);

	private static final Random RANDOM = new Random();

	@PrePersist
	public void generateName(Object entity) throws IllegalArgumentException, IllegalAccessException {

		Class<?> clazz = entity.getClass();
		String name = null;

		for (Field field : clazz.getDeclaredFields()) {
			field.setAccessible(true);
			if (field.isAnnotationPresent(CustomNameGenerator.class)) {
				name = setName(entity, name, field);
				field.set(entity, name);
			}
		}

	}

	private String setName(Object entity, String name, Field field)
			throws IllegalArgumentException, IllegalAccessException {
		String sourceName = (String) field.get(entity);
		if (sourceName != null) {
			return sourceName;
		}
		int index = RANDOM.nextInt(Constants.CHARACTER_NAMES.size());
		name = Constants.CHARACTER_NAMES.get(index);
		logger.info("Name is " + name);
		return name;
	}

}
