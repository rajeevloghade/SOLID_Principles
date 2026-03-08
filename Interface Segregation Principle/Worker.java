// Example violating ISP
interface Worker {
    void work();

    void eat();

    void sleep();
}

class Engineer implements Worker {
    @Override
    public void work() {
        // Engineer-specific work
    }

    @Override
    public void eat() {
        // Engineer-specific eating
    }

    @Override
    public void sleep() {
        // Engineer-specific sleeping
    }
}

class Robot implements Worker {
    @Override
    public void work() {
        // Robot-specific work
    }

    @Override
    public void eat() {
        // This doesn't make sense for a robot
    }

    @Override
    public void sleep() {
        // This doesn't make sense for a robot
    }
}

/**
 * Interface Segregation Principle (ISP): A client should not be forced to implement an interface that it doesn't use.
 * 
 * In this example, Robot doesn't need to eat or sleep, so it violates ISP.
 */