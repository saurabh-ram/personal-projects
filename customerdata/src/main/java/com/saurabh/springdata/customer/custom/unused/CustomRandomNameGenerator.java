package com.saurabh.springdata.customer.custom.unused;

import java.util.EnumSet;
import java.util.Random;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.generator.BeforeExecutionGenerator;
import org.hibernate.generator.EventType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.saurabh.springdata.customer.constant.Constants;

public class CustomRandomNameGenerator implements BeforeExecutionGenerator {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Random RANDOM = new Random();

	private Logger logger = LoggerFactory.getLogger(CustomRandomNameGenerator.class);

	@Override
	public EnumSet<EventType> getEventTypes() {
		return EnumSet.of(EventType.INSERT);
	}

	@Override
	public Object generate(SharedSessionContractImplementor session, Object owner, Object currentValue,
			EventType eventType) {
		logger.info("SharedSessionContractImplementor session -> " + session);
		logger.info("Object owner -> " + owner);
		logger.info("Object currentValue -> " + currentValue);
		logger.info("EventType eventType -> " + eventType);
		if (currentValue != null) {
			return currentValue;
		}
		int index = RANDOM.nextInt(Constants.CHARACTER_NAMES.size());
		return Constants.CHARACTER_NAMES.get(index);
	}

}
