package com.markiantorno.charcoal.annotation;

import org.hl7.fhir.dstu3.model.Observation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.markiantorno.charcoal.view.CharcoalTextView;
/**
 * Annotation for {@link CharcoalTextView}.
 * <p>
 * Created by miantorno on 2017-10-05.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Charcoal {

    int NO_ACCURACY_SET = -1;

    /**
     * Property that this measurement represents, ie 'blood_glucose', 'weight', etc.
     * These codes are internal to your own application, and have no relation to UCUM fields or
     * unit properties.
     */
    String property();

    /**
     * Default unit to set for this field. If any error with conversion or preferences occurs, the
     * field will default to this.
     */
    String defaultUnit() default "";

    /**
     * The decimal place accuracy of a number is the number of digits to the right of the decimal point.
     */
    int accuracy() default NO_ACCURACY_SET;

    /**
     * String format for displaying the {@link Observation} value, and unit.
     */
    String format() default "%1$s %2$s";
}
