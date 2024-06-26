package org.homework.di.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;


@Retention(RetentionPolicy.RUNTIME)
@Target(FIELD)
public @interface Resolve {}