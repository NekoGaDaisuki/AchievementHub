package annotation;

@java.lang.annotation.Documented
@java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface ClassPreamble
{
    String author();
    String date();
    int initialRevision() default 1;
    int currentRevision() default 1;
    String lastModified() default "N/A";
}
