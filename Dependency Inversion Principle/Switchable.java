// Example following DIP
interface Switchable {
    void turnOn();

    void turnOff();

    boolean isOn();
}

class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        // turn on the light bulb
    }

    @Override
    public void turnOff() {
        // turn off the light bulb
    }

    @Override
    public boolean isOn() {
        return false;
    }
}

class LightSwitch {
    private Switchable switchable;

    public LightSwitch(Switchable switchable) {
        this.switchable = switchable; // Dependency is now on an abstraction
    }

    public void toggle() {
        if (switchable.isOn()) {
            switchable.turnOff();
        } else {
            switchable.turnOn();
        }
    }
}

/**
 * Now, LightSwitch depends on the Switchable interface instead of the concrete LightBulb class, adhering to DIP.
 */
