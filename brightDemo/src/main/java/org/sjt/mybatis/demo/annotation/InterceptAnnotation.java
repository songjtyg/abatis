package org.sjt.mybatis.demo.annotation;


import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.PARAMETER,ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface InterceptAnnotation {
    boolean flag() default true;

}