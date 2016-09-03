package annotation;

@java.lang.annotation.Documented
@java.lang.annotation.Target(java.lang.annotation.ElementType.PACKAGE)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface PackagePreamble
{
    String author();
    String date();
    String behavior() default "N/A";
}
