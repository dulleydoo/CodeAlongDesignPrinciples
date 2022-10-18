public class InterfaceSegregation {

    public static void main(String[] args) {

    }
}

interface Worker {
    void work();
    void sleep();
}

class Human implements Worker {

    @Override
    public void work() {}

    @Override
    public void sleep() {}
}

class Robot implements Worker {

    @Override
    public void work() {}

    @Override
    public void sleep() {}
}