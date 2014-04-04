import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paulina on 04.04.2014.
 */
public class FigureSize<T> {
    private List<T> dimensions;

    public FigureSize (T... dimensionArray) {
        dimensions = new ArrayList<T>();
        for (T t: dimensionArray) {
            dimensions.add(t);
        }
    }

    public T getDim(int index){
        return dimensions.get(index);
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof FigureSize){
            FigureSize p = (FigureSize)o;

            if(p.dimensions.size() != this.dimensions.size())
                return false;

            for(int i = 0; i < this.dimensions.size(); i++){
                if(!this.dimensions.get(i).equals(p.dimensions.get(i)))
                    return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        int hash = 0;
        for(T t : dimensions)
            hash += t.hashCode();
        return hash;
    }
}
