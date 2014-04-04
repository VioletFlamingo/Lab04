public class Circle extends AbstractFigure{
    private final Color col;

    public Circle (double r, Color c) {
        dims=new FigureSize<Double>(r);
        this.col=c;
    }

    public double getArea () {
        return (double)Math.PI*dims.getDim(0)*dims.getDim(0);
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
        long hash = Double.doubleToLongBits(dims.getDim(0));
        return (int)hash;
    }
}

