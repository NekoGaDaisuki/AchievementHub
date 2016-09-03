package annotation;

@java.lang.annotation.Documented
@java.lang.annotation.Target(java.lang.annotation.ElementType.METHOD)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface MethodPreamble
{
    String date();
    int initialRevision() default 1;
    int currentRevision() default 1;
    String lastModified() default "N/A";
}
