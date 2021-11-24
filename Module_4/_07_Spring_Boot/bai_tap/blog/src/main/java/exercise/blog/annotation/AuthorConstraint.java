package exercise.blog.annotation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = AuthorValidation.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthorConstraint {
        String message() default "Ten khong dung dinh dang";
        Class<?> [] group() default {};
        Class<? extends Payload>  [] payload() default {};

}
