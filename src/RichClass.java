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


    public static <T, K> Map<K, List<T>> group(Collection<T> col, Function <T, K> f) {
        List <T> listOfGroup;
        Map <K, List<T>>result = new HashMap<K, List <T>>();
        for (T elem : col) {
            if(result.containsKey(f.apply((elem)))==false) {
                listOfGroup = new ArrayList<T>();
            } else {
                listOfGroup=result.get(f.apply(elem));
            }
            listOfGroup.add(elem);
            result.put(f.apply(elem), listOfGroup);
        }
        return result;
    }


    public static Map<Integer, List<Figure>> groupByFigure(Collection<Figure> myCollection) {
        return group(myCollection, new Function <Figure, Integer>() {
            @Override
            public Integer apply(Figure element) {
                if (element instanceof Triangle) {
                    return 0;
                }
                else if (element instanceof Rectangle) {
                    return 1;
                }
                else if (element instanceof Circle) {
                    return 2;
                } else {
                    //temporary for other cases that may appear in the future
                    return 3;
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
