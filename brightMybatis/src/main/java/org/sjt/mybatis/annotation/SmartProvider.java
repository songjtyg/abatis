package org.sjt.mybatis.annotation;

import org.sjt.mybatis.provider.PoiSqlProvider;

import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@SelectProvider
public @interface SmartProvider {
    Class<?> type() default PoiSqlProvider.class;
    String method()  default "selectPoiBo";
//    @AliasFor(annotation = SelectProvider.class, attribute = "type")
//    Class[] type() default {PoiSqlProvider.class};
//    @AliasFor(annotation = SelectProvider.class, attribute = "method")
//    String[] method() default {"selectPoiBo"};

}
