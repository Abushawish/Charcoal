package com.markiantorno.charcoal.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to indicate which UCUM xml definition file should be loaded.
 * <p>
 * Created by miantorno on 2017-10-05.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Essence {
    /**
     * Asset {@link String} file name of the ucum essence file to load.
     */
    String asset();
}
