public class Triangle extends AbstractFigure{
    private final Color col;
    private final double length;

    public Triangle (double length, Color c) {
        this.length=length;
        this.col=c;
    }

    public Color getColor() {
        return col;
    }

    public double getArea() {
        return (double) 0.5*length*length;
    }

    @Override
    public String toString() {
        return "Triangle, color: "+this.getColor()+", area: "+this.getArea()+" ";
    }

    @Override
    public int hashCode() {
        long hash = Double.doubleToLongBits(length);
        return (int)hash;
    }
}
