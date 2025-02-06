package com.saurabh.springdata.customer.custom.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.hibernate.annotations.IdGeneratorType;

import com.saurabh.springdata.customer.custom.generator.CustomRandomIDGenerator;

@IdGeneratorType(CustomRandomIDGenerator.class)
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = { ElementType.METHOD, ElementType.FIELD })
public @interface CustomIdGenerator {

}
