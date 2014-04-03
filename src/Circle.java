public class Circle extends AbstractFigure{
    private final double r;
    private final Color col;

    public Circle (double r, Color c) {
        this.r=r;
        this.col=c;
    }

    public double getArea () {
        return (double)Math.PI*r*r;
    }

    public Color getColor () {
        return col;
    }

    @Override
    public String toString() {
        return "Circle, color: "+this.getColor()+", area: "+this.getArea()+" ";
    }

    @Override
    public int hashCode() {
        long hash = Double.doubleToLongBits(r);
        return (int)hash;
    }
}

