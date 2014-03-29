public class Rectangle implements Figure{
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
    public boolean equals (Object f) {
        if (f instanceof Figure) {
            Figure g=(Figure)f;
            if (this.getClass()==g.getClass()&&this.getColor()==g.getColor()) {
                return true;
            }
        }
        return false;
    }


    @Override
    public int hashCode() {
        long xHash = Double.doubleToLongBits(length);
        long yHash = Double.doubleToLongBits(width);
        int hash = (int) (xHash ^ (xHash >>> 32));
        hash += 37 * (int) (yHash ^ (yHash >>> 32));
        return hash;
    }


    @Override
    public int compareTo(Figure f) {
        if (this.getArea()<f.getArea()) {
            return 1;
        }
        else if (this.getArea()>f.getArea()) {
            return -1;
        }
        return 0;
    }
}




