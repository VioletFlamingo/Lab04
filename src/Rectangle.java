public class Rectangle extends AbstractFigure{
    private final Color col;

    public Rectangle (double length, double width, Color c){
        dims = new FigureSize(length, width);
        this.col=c;
    }

    public Color getColor () {
        return col;
    }

    public double getArea () {
        return dims.getDim(0)* dims.getDim(1);
    }

    @Override
    public String toString() {
        return "Rectangle, color: "+this.getColor()+", area: "+this.getArea()+" ";
    }

    @Override
    public int hashCode() {
        long xHash = Double.doubleToLongBits(dims.getDim(0));
        long yHash = Double.doubleToLongBits(dims.getDim(1));
        int hash = (int) (xHash ^ (xHash >>> 32));
        hash += 37 * (int) (yHash ^ (yHash >>> 32));
        return hash;
    }
}




