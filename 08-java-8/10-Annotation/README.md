In Java 8, the annotation feature was enhanced to support repeating annotations and type annotations. These enhancements provide more flexibility and expressive power when using annotations in Java code.

**1. Repeating Annotations:**
Prior to Java 8, an annotation could only be used once on a target, such as a class, method, or field. If you wanted to apply the same annotation multiple times, you had to use container annotations (wrapper annotations) that held an array of the target annotation. With Java 8, you can directly repeat an annotation on a target, making the code more concise and easier to read.

**2. Type Annotations:**
Java 8 introduced type annotations, allowing annotations to be applied to types (classes, interfaces, etc.), in addition to the usual elements (methods, fields, parameters, etc.). This enables you to annotate the type itself, which can be useful in various scenarios, such as documenting the intended use of a class or interface.

**Program Example:**
Let's demonstrate how to use repeating annotations and type annotations in Java 8:

```java
import java.lang.annotation.*;

// Repeating Annotations
@Repeatable(Greetings.class)
@interface Greeting {
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Greetings {
    Greeting[] value();
}

// Type Annotations
@Target(ElementType.TYPE_USE)
@interface MyTypeAnnotation {
    String value() default "";
}

public class AnnotationsExample {
    public static void main(String[] args) {
        // Repeating Annotations
        @Greeting("Hello")
        @Greeting("Hi")
        class GreetingsDemo {
        }

        Greeting[] greetings = GreetingsDemo.class.getAnnotationsByType(Greeting.class);
        for (Greeting greeting : greetings) {
            System.out.println(greeting.value()); // Output: Hello, Hi
        }

        // Type Annotations
        @MyTypeAnnotation("Type Annotation Example")
        class TypeAnnotationDemo {
            @MyTypeAnnotation("Field")
            private String name;

            @MyTypeAnnotation("Constructor")
            public TypeAnnotationDemo(@MyTypeAnnotation("Parameter") String name) {
                this.name = name;
            }

            @MyTypeAnnotation("Method")
            public void display(@MyTypeAnnotation("Parameter") String message) {
                System.out.println(message);
            }
        }

        MyTypeAnnotation classAnnotation = TypeAnnotationDemo.class.getAnnotation(MyTypeAnnotation.class);
        System.out.println("Class Annotation: " + classAnnotation.value()); // Output: Type Annotation Example

        MyTypeAnnotation fieldAnnotation = TypeAnnotationDemo.class.getDeclaredField("name").getAnnotation(MyTypeAnnotation.class);
        System.out.println("Field Annotation: " + fieldAnnotation.value()); // Output: Field

        MyTypeAnnotation constructorAnnotation = TypeAnnotationDemo.class.getConstructor(String.class).getAnnotation(MyTypeAnnotation.class);
        System.out.println("Constructor Annotation: " + constructorAnnotation.value()); // Output: Constructor

        MyTypeAnnotation methodAnnotation = TypeAnnotationDemo.class.getMethod("display", String.class).getAnnotation(MyTypeAnnotation.class);
        System.out.println("Method Annotation: " + methodAnnotation.value()); // Output: Method
    }
}
```

In this example:

1. We define a repeating annotation `@Greeting` that can be used multiple times on a target. It is annotated with `@Repeatable(Greetings.class)` to indicate that it is a repeating annotation.

2. We define a container annotation `@Greetings` to hold multiple `@Greeting` annotations.

3. We use the repeating annotation `@Greeting` on the `GreetingsDemo` class, and then retrieve the annotations using `getAnnotationsByType(Greeting.class)`.

4. We define a type annotation `@MyTypeAnnotation` and use it on different elements like classes, fields, constructors, and methods. We retrieve these annotations using reflection.

Type annotations can be applied in various contexts, including `ElementType.TYPE_USE`, `ElementType.TYPE_PARAMETER`, `ElementType.TYPE`, and more. In this example, we used `ElementType.TYPE_USE`, which allows annotations to be applied to types used in declarations, including generic type arguments, type casts, and instanceof expressions.

These enhancements in annotations provide a more concise and expressive way to annotate Java code, making it easier to document and understand the intent of your code and allowing for more flexible usage of annotations in various contexts.