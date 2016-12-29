package me.ggikko;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by ggikko on 2016. 12. 28..
 */
@Target(ElementType.TYPE) // on class level
@Retention(RetentionPolicy.SOURCE)
public @interface Merong {
    int version() default 0;
}
