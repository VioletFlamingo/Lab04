/**
 * Created by Paulina on 29.03.2014.
 */
public abstract class AbstractFigure implements Figure{
    @Override
    public boolean equals (Object f) {
        if (f instanceof Figure) {
            Figure g=(Figure)f;
            if (this.getClass()==g.getClass()&&this.getArea()==g.getArea()) {
                if(this.getColor()==g.getColor()){
                    return true;
                }
                else if (this.getColor()==Color.GREEN && g.getColor()==Color.RED) {
                    return true;
                }
                else if (this.getColor()==Color.RED && g.getColor()==Color.GREEN) {
                    return true;
                }
            }
        }
        return false;
    }


    @Override
    public int compareTo(Figure f) {
        return Double.compare(this.getArea(), f.getArea());
    }
}