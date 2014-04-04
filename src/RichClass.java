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
            if(!result.containsKey(f.apply((elem)))) {
                listOfGroup = new ArrayList<T>();
            } else {
                listOfGroup=result.get(f.apply(elem));
            }
            listOfGroup.add(elem);
            result.put(f.apply(elem), listOfGroup);
        }
        return result;
    }


    public static Map<Class<? extends Figure>, List<Figure>> groupByFigure(Collection<Figure> myCollection) {
        return group(myCollection, new Function <Figure, Class<? extends Figure>>() {
            @Override
            public Class<? extends Figure> apply(Figure element) {
                return element.getClass();
            }
        });
    }



    public static <T, E extends T> Collection<E> select(Collection<T> col, Class<E> myClass) {
        final Collection<E> result=  new ArrayList<E>();
        for (T elem : col) {
            if (myClass.isInstance(elem)) {
                result.add(myClass.cast(elem));
            }
        }
        return (ArrayList<E>) result;
    }
}
