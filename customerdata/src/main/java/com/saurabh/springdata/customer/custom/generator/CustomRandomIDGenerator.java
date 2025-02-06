package com.saurabh.springdata.customer.custom.generator;

import java.util.Random;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomRandomIDGenerator implements IdentifierGenerator {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		Random random = null;
		int id = 0;
		random = new Random();
		id = random.nextInt(1000000);
		return Long.valueOf(id);
	}

}
