package com.saurabh.springdata.customer.custom.generator;

import java.util.EnumSet;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.generator.BeforeExecutionGenerator;
import org.hibernate.generator.EventType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.saurabh.springdata.customer.constant.Constants;
import com.saurabh.springdata.customer.entities.Address;
import com.saurabh.springdata.customer.entities.Customer;

public class AddressGenerator implements BeforeExecutionGenerator {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Logger logger = LoggerFactory.getLogger(AddressGenerator.class);

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
		Customer customer = (Customer) owner;
		String name = customer.getName();

		if (currentValue != null) {
			return (Address) currentValue;
		}

		if (Constants.CHARACTER_CITY_MAP.keySet().contains(name)
				|| Constants.CHARACTER_COUNTRY_MAP.keySet().contains(name)) {
			return createAddressFromName(Constants.CHARACTER_CITY_MAP.get(name),
					Constants.CHARACTER_COUNTRY_MAP.get(name));
		}
		logger.info("Address not found for " + name);
		logger.info("Please Update the Address later...");
		return createAddressFromName(Constants.DEFAULT_ADDRESS, Constants.DEFAULT_ADDRESS);

	}

	private Address createAddressFromName(String city, String country) {
		logger.info("Generating Adderess...");
		Address address = new Address();
		address.setCity(city);
		address.setCountry(country);
		return address;
	}

}
