public class OpenClosedPrinciple {

    public static void main(String[] args) {

    }
}

class AreaCalculator {
    private Shape shape;

    public void calculate() {
        shape.calculate();
    }
}

interface Shape {
    void calculate();
}

class Rectangle implements Shape {
    public Double height;
    public Double width;

    @Override
    public void calculate() {
        System.out.println(height * width);
    }
}

class Circle implements Shape {
    public Double radius;

    @Override
    public void calculate() {
        System.out.println(radius * radius * 3.14);
    }
}
