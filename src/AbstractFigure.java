/**
 * Created by Paulina on 29.03.2014.
 */
public abstract class AbstractFigure implements Figure{
    protected FigureSize<Double> dims;

    public FigureSize<Double> getDims(){
        return dims;
    }

    @Override
    public boolean equals (Object f) {
        if (f instanceof Figure) {
            Figure g=(Figure)f;
            if (this.getClass()==g.getClass()&&this.dims.equals(g.getDims())) {
                return DaltonUtils.colorEquals(this, g);
            }
        }
        return false;
    }


    @Override
    public int compareTo(Figure f) {
        return Double.compare(this.getArea(), f.getArea());
    }
}
