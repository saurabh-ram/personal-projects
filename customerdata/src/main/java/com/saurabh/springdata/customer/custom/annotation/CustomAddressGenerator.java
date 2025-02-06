package com.saurabh.springdata.customer.custom.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.hibernate.annotations.ValueGenerationType;

import com.saurabh.springdata.customer.custom.generator.AddressGenerator;

@ValueGenerationType(generatedBy = AddressGenerator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(value = { ElementType.FIELD })
public @interface CustomAddressGenerator {

}
