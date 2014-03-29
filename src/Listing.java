/**
 * Created by Paulina on 26.03.2014.
 */

import java.util.Collection;
import java.util.Iterator;

public class Listing {
    public static void listWithForEach(Collection<Figure> collection) {
        for (Figure f : collection) {
            System.out.println(f.toString());
        }
    }

    public static void listWithIterator(Collection<Figure> collection) {
        Iterator<Figure> it = collection.iterator();
        while (it.hasNext()) {
            Figure f=it.next();
            System.out.println(f.toString());
        }
    }
}
