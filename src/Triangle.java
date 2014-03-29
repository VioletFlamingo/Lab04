public class Triangle implements Figure {
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
        long hash = Double.doubleToLongBits(length);
        return (int)hash;
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
