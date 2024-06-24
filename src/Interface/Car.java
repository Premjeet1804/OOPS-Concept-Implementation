package Interface;

public class Car implements Break,Engine,Media{
    @Override
    public void brake() {
        System.out.println("I brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start like a normal car");

    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal Car");

    }

    @Override
    public void acc() {
        System.out.println("I Accelerate like a normal car");

    }
}
