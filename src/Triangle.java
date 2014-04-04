public class Triangle extends AbstractFigure{
    private final Color col;

    public Triangle (double length, Color c) {
        dims = new FigureSize<Double>(length);
        this.col=c;
    }

    public Color getColor() {
        return col;
    }

    public double getArea() {
        return (double) 0.5 * dims.getDim(0) * dims.getDim(0);
    }

    @Override
    public String toString() {
        return "Triangle, color: "+this.getColor()+", area: "+this.getArea()+" ";
    }

    @Override
    public int hashCode() {
        long hash = Double.doubleToLongBits(dims.getDim(0));
        return (int)hash;
    }
}
