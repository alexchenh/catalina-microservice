package com.chenh.catalina.pms.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 用户验证状态是否在指定范围内的注解
 * @author chenh
 * @date 2021年04月22日
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Constraint(validatedBy = FlagValidatorClass.class)
public @interface FlagValidator {
    String[] value() default {};
    String message() default "flag is not found";
    Class<?>[] groups() default{};
    Class<? extends Payload>[] payload() default {};
}
