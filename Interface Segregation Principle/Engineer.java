// Example following ISP
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

interface Sleepable {
    void sleep();
}

class Engineer implements Workable, Eatable, Sleepable {
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

class Robot implements Workable {
    @Override
    public void work() {
        // Robot-specific work
    }
}

/**
 * Now, each class implements only the interfaces relevant to it.
 */