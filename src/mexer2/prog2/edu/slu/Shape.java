package mexer2.prog2.edu.slu;


public abstract class Shape {
    private final String name;
    protected int sides;
    public Shape(String name) {
        this.name = name;
    }
    public String toString() {
        return name + "with" + sides + "sides";
    }
    public int getSides() {
        return sides;
    }
    // declaration of the abstract methods
    public abstract double area();
    public abstract double perimeter();
}
