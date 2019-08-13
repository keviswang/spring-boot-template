package org.jeecg.common.aspect.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 类描述:  字典注解
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Dict {
    /**
     * 数据code
     */
    String dicCode();

    /**
     * 数据Text
     */
    String dicText() default "";

    /**
     *  数据字典表
     */
    String dictTable() default "";
}
