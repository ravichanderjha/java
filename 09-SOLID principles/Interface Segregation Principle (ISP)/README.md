The Interface Segregation Principle (ISP) states that clients should not be forced to depend on interfaces they don't use. In other words, it's better to have smaller, more specific interfaces rather than large, monolithic ones. Here's a Java example to illustrate the ISP:

**Problem Statement:** Imagine you have an interface called `Worker` that represents employees in a company. However, not all employees perform all tasks, and forcing them to implement methods they don't need is against the ISP.

**Solution:** Split the `Worker` interface into smaller, more focused interfaces that cater to specific roles or tasks, allowing classes to implement only the interfaces relevant to their responsibilities.

```java
// Worker.java (Initial monolithic interface)
public interface Worker {
    void doWork();
    void attendMeeting();
    void takeBreak();
}

// Developer.java (Class implementing Worker)
public class Developer implements Worker {
    @Override
    public void doWork() {
        // Developer-specific work logic
    }

    @Override
    public void attendMeeting() {
        // Developer attending a meeting
    }

    @Override
    public void takeBreak() {
        // Developer taking a break
    }
}

// Manager.java (Class implementing Worker)
public class Manager implements Worker {
    @Override
    public void doWork() {
        // Manager-specific work logic
    }

    @Override
    public void attendMeeting() {
        // Manager attending a meeting
    }

    @Override
    public void takeBreak() {
        // Manager taking a break
    }
}

// Clerk.java (Class implementing Worker)
public class Clerk implements Worker {
    @Override
    public void doWork() {
        // Clerk-specific work logic
    }

    @Override
    public void attendMeeting() {
        // Clerk should not attend meetings
    }

    @Override
    public void takeBreak() {
        // Clerk-specific break behavior
    }
}
```

In this initial design, the `Worker` interface includes three methods: `doWork()`, `attendMeeting()`, and `takeBreak()`. However, not all workers need to attend meetings. For example, a `Clerk` should not attend meetings, so implementing the unnecessary `attendMeeting()` method violates the ISP.

Let's refactor the design to adhere to the ISP:

```java
// Workable.java (Interface for work-related actions)
public interface Workable {
    void doWork();
}

// Attendable.java (Interface for attending meetings)
public interface Attendable {
    void attendMeeting();
}

// Breakable.java (Interface for taking breaks)
public interface Breakable {
    void takeBreak();
}

// Developer.java (Class implementing relevant interfaces)
public class Developer implements Workable, Attendable, Breakable {
    @Override
    public void doWork() {
        // Developer-specific work logic
    }

    @Override
    public void attendMeeting() {
        // Developer attending a meeting
    }

    @Override
    public void takeBreak() {
        // Developer taking a break
    }
}

// Manager.java (Class implementing relevant interfaces)
public class Manager implements Workable, Attendable, Breakable {
    @Override
    public void doWork() {
        // Manager-specific work logic
    }

    @Override
    public void attendMeeting() {
        // Manager attending a meeting
    }

    @Override
    public void takeBreak() {
        // Manager taking a break
    }
}

// Clerk.java (Class implementing relevant interfaces)
public class Clerk implements Workable, Breakable {
    @Override
    public void doWork() {
        // Clerk-specific work logic
    }

    @Override
    public void takeBreak() {
        // Clerk-specific break behavior
    }
}
```

In this refactored design:

- We've created smaller, focused interfaces (`Workable`, `Attendable`, and `Breakable`) that represent specific actions.
- Each class (`Developer`, `Manager`, and `Clerk`) implements only the interfaces relevant to its responsibilities.

This adheres to the Interface Segregation Principle, as no class is forced to implement methods it doesn't need. It also provides a more flexible and maintainable code structure, making it easier to extend the system with new roles or actions without affecting existing classes.