package me.foolishchow.android.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.FIELD)
public @interface FragmentParam {
    boolean originName() default false;

    /**
     * use this argument to fragment tag
     * @return
     */
    boolean cacheToTag() default false;
}