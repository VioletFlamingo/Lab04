/**
 * Created by Paulina on 28.03.2014.
 */


import java.util.*;

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


    public static <T, K> Map<K, T> group(Collection<T> col, Function <K, T> f) {
        Map <K, T>result = new HashMap<K, T>();
        for (T elem : col) {
            f.apply(elem, result);
        }
    }


    public static Map<Integer, Figure> groupByFigure(Collection<Figure> myCollection) {
        return groupByFigure(myCollection, new Function <Figure, HashMap<Integer, Figure>>() {
            @Override
            public Double apply(Figure element, Map<Integer, Figure> map) {
                if (element instanceof Triangle) {
                    map.put(0, element);
                }
                else if (element instanceof Triangle) {
                    map.put(1, element);
                }
                else if (element instanceof Triangle) {
                    map.put(2, element);
                }
            }
        });
    }


    public static <T,E> Collection<E> select(Collection<T> col, Class<E> myClass) {
        ArrayList<T> result=  new ArrayList<T>();
        for (T elem : col) {
            if (myClass == elem.getClass()) {
                result.add(elem);
            }
        }
        return (ArrayList<E>) result;
    }
}
