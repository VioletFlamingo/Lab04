/**
 * Created by Paulina on 28.03.2014.
 */


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class RichClass{
    public static <E,T> Map<T, E> map (Collection<T> c, Function<T, E> f) {
        Map <T, E>mapped = new HashMap<T, E>();
        for (T element : c) {
            mapped.put(element,f.apply(element));
        }
        return mapped;
    }

    public static Map<Figure, Double> doubleArea(Collection <Figure> myCollection) {
        return map(myCollection, new Function<Figure, Double>() {
            @Override
            public Double apply(Figure element) {
                double doubleArea = element.getArea()*2;
                return doubleArea;
            }
        });
    }

    public static <T,E> Collection<E> fun(Collection<T> col, Class <E> myClass) {
        Collection<T> result=  new ArrayList<T>();
        for (T elem : col) {
            if (myClass==elem.getClass()) {
                    result.add(elem);
            }
        }
        return (Collection<E>) result;
    }
}
