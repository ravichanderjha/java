### Understanding `final` in Java

In Java, the `final` keyword is used in different contexts with distinct meanings:

1. **Final Variables**:
   - A `final` variable can only be initialized once. Once a `final` variable has been assigned, it cannot be re-assigned.
   - Example:
     ```java
     public class FinalVariableExample {
         public static void main(String[] args) {
             final int number = 10;
             // number = 20; // This will cause a compilation error
             System.out.println("Final variable value: " + number);
         }
     }
     ```

2. **Final Methods**:
   - A `final` method cannot be overridden by subclasses. This ensures that the method's implementation remains unchanged.
   - Example:
     ```java
     class ParentClass {
         public final void display() {
             System.out.println("This is a final method.");
         }
     }

     class ChildClass extends ParentClass {
         // public void display() { // This will cause a compilation error
         //     System.out.println("Trying to override.");
         // }
     }

     public class FinalMethodExample {
         public static void main(String[] args) {
             ChildClass obj = new ChildClass();
             obj.display();
         }
     }
     ```

3. **Final Classes**:
   - A `final` class cannot be subclassed. This prevents other classes from inheriting from it.
   - Example:
     ```java
     public final class FinalClass {
         public void show() {
             System.out.println("This is a final class.");
         }
     }

     // class SubClass extends FinalClass { // This will cause a compilation error
     // }

     public class FinalClassExample {
         public static void main(String[] args) {
             FinalClass obj = new FinalClass();
             obj.show();
         }
     }
     ```

## Final Methods

A `final` method cannot be overridden by subclasses. This ensures that the method's implementation remains unchanged.

```java
class ParentClass {
    public final void display() {
        System.out.println("This is a final method.");
    }
}

class ChildClass extends ParentClass {
    // public void display() { // This will cause a compilation error
    //     System.out.println("Trying to override.");
    // }
}

public class FinalMethodExample {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.display();
    }
}
```

## Final Classes

A `final` class cannot be subclassed. This prevents other classes from inheriting from it.

```java
public final class FinalClass {
    public void show() {
        System.out.println("This is a final class.");
    }
}

// class SubClass extends FinalClass { // This will cause a compilation error
// }

public class FinalClassExample {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.show();
    }
}
```

### Example Program Files

1. **FinalVariableExample.java**:
   ```java
   public class FinalVariableExample {
       public static void main(String[] args) {
           final int number = 10;
           // number = 20; // This will cause a compilation error
           System.out.println("Final variable value: " + number);
       }
   }
   ```

2. **FinalMethodExample.java**:
   ```java
   class ParentClass {
       public final void display() {
           System.out.println("This is a final method.");
       }
   }

   class ChildClass extends ParentClass {
       // public void display() { // This will cause a compilation error
       //     System.out.println("Trying to override.");
       // }
   }

   public class FinalMethodExample {
       public static void main(String[] args) {
           ChildClass obj = new ChildClass();
           obj.display();
       }
   }
   ```

3. **FinalClassExample.java**:
   ```java
   public final class FinalClass {
       public void show() {
           System.out.println("This is a final class.");
       }
   }

   // class SubClass extends FinalClass { // This will cause a compilation error
   // }

   public class FinalClassExample {
       public static void main(String[] args) {
           FinalClass obj = new FinalClass();
           obj.show();
       }
   }
   ```