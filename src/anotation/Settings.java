package anotation;

import java.lang.annotation.*;

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Settings {
    String name() default "Settings";

    ModuleType[] moduleType() default ModuleType.MODULE_TYPE1;
}
