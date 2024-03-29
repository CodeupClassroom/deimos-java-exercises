package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double l, double w){
        super(l,w);
    }
    @Override
    public void setLength(double l) {
        this.length = l;
    }

    @Override
    public void setWidth(double w) {
        this.width = w;
    }

    @Override
    public double getPerimeter() {
        return 2*length + 2*width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
