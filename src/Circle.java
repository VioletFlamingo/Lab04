public class Circle implements Figure {
    private final double r;
    private final Color col;

    public Circle (double r, Color c) {
        this.r=r;
        this.col=c;
    }

    public double getArea () {
        return (double)3.14*r*r;
    }

    public Color getColor () {
        return col;
    }

    @Override
    public String toString() {
        return "Circle, color: "+this.getColor()+", area: "+this.getArea()+" ";
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
        long hash = Double.doubleToLongBits(r);
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

