package com.ytl.dagger2demo.dagger;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Richard Yi-Te Lu on 06,September,2019
 */

@Scope
@Documented
@Retention(RUNTIME)
public @interface PerActivity {


}
