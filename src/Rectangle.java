public class Rectangle extends AbstractFigure{
    private final double length;
    private final double width;
    private final Color col;

    public Rectangle (double length, double width, Color c){
        this.length=length;
        this.width=width;
        this.col=c;
    }

    public Color getColor () {
        return col;
    }

    public double getArea () {
        return (double)length*width;
    }

    @Override
    public String toString() {
        return "Rectangle, color: "+this.getColor()+", area: "+this.getArea()+" ";
    }

    @Override
    public int hashCode() {
        long xHash = Double.doubleToLongBits(length);
        long yHash = Double.doubleToLongBits(width);
        int hash = (int) (xHash ^ (xHash >>> 32));
        hash += 37 * (int) (yHash ^ (yHash >>> 32));
        return hash;
    }
}




