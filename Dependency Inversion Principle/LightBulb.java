// Example violating DIP
class LightBulb {
    public void turnOn() {
        // turn on the light bulb
    }

    public void turnOff() {
        // turn off the light bulb
    }

    public boolean isOn() {
        return false;
    }
}

class LightSwitch {
    private LightBulb lightBulb;

    public LightSwitch() {
        this.lightBulb = new LightBulb(); // Dependency on a concrete implementation
    }

    public void toggle() {
        if (lightBulb.isOn()) {
            lightBulb.turnOff();
        } else {
            lightBulb.turnOn();
        }
    }
}

/**
 * Dependency Inversion Principle (DIP): High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details. Details should depend on abstractions.
 * 
 * In this example, LightSwitch directly depends on the concrete implementation LightBulb, violating DIP.
 */