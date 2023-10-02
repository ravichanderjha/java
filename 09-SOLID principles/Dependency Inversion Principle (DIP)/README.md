The Dependency Inversion Principle (DIP) states that high-level modules should not depend on low-level modules; both should depend on abstractions. Additionally, abstractions should not depend on details; details should depend on abstractions. In simpler terms, it encourages the use of interfaces or abstract classes to define relationships between components, promoting loose coupling and flexibility. Here's a Java example to illustrate the Dependency Inversion Principle:

**Problem Statement:** You have a `LightBulb` class that represents a light bulb, and you want to create a `Switch` class to control the light bulb. However, you want to follow the DIP and allow for different types of switches (e.g., physical switch, remote control) to control the light bulb without modifying the `LightBulb` class.

**Solution:** Define an interface or abstract class for the switch, and make both the `Switch` and `LightBulb` classes depend on this abstraction.

```java
// Switchable.java (Abstraction for switchable devices)
public interface Switchable {
    void turnOn();
    void turnOff();
}

// LightBulb.java (Class representing a light bulb)
public class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Light bulb is on");
        // Logic to turn on the light bulb
    }

    @Override
    public void turnOff() {
        System.out.println("Light bulb is off");
        // Logic to turn off the light bulb
    }
}

// Switch.java (Class representing a generic switch)
public class Switch {
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void turnOn() {
        device.turnOn();
    }

    public void turnOff() {
        device.turnOff();
    }
}

// RemoteControl.java (Class representing a remote control)
public class RemoteControl implements Switchable {
    private Switchable device;

    public RemoteControl(Switchable device) {
        this.device = device;
    }

    @Override
    public void turnOn() {
        System.out.println("Remote control is turning on the device");
        device.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Remote control is turning off the device");
        device.turnOff();
    }
}

// Main.java (Client code)
public class Main {
    public static void main(String[] args) {
        Switchable bulb = new LightBulb();
        Switchable remoteControlledBulb = new RemoteControl(bulb);

        Switch lightSwitch = new Switch(remoteControlledBulb);
        lightSwitch.turnOn();
        lightSwitch.turnOff();
    }
}
```

In this example:

- `Switchable` is the abstraction representing switchable devices. Both the `LightBulb` and `RemoteControl` classes implement this interface.
- The `LightBulb` class represents a light bulb and implements the `Switchable` interface.
- The `Switch` class represents a generic switch that can be used to control any switchable device. It depends on the `Switchable` abstraction.
- The `RemoteControl` class represents a remote control that can also control switchable devices. It depends on the `Switchable` abstraction.

This design adheres to the Dependency Inversion Principle. The high-level module (`Switch` and `RemoteControl`) depends on the abstraction (`Switchable`) rather than directly on low-level modules (`LightBulb`). This allows you to easily add new types of switchable devices without modifying existing code, promoting flexibility and maintainability.