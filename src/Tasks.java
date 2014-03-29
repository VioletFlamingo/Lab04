/**
 * Created by Paulina on 29.03.2014.
 */

import java.util.*;

public class Tasks {
    public static void lab03 (FigureMaker maker) {
        maker.makeArrayList();
        System.out.println("Listed with for each:");
        CollectionControl.listWithForEach(maker.getArrayList());

        System.out.println("\n \n \n In order to area, listed with iterator:");
        Collections.sort(maker.getArrayList(), new FigureAreaComparator());
        CollectionControl.listWithIterator(maker.getArrayList());

        System.out.println("\n \n \n Green and red figures treated as the same:");
        maker.makeHashSet();
        CollectionControl.listWithForEach(maker.getSet());

        System.out.println("\n \n \n In order of decreasing area:");
        maker.makeTreeSet();
        CollectionControl.listWithForEach(maker.getSet());

        System.out.println("\n \n \n In order of adding elements");
        maker.makeLinkedTreeSet();
        CollectionControl.listWithForEach(maker.getSet());
    }

    public static void lab04 (FigureMaker maker) {
        System.out.println("\n \n \n Mapping by function that doubles areas:");
        maker.makeArrayList();
        System.out.println(RichClass.doubleArea(maker.getArrayList()));

        System.out.println("\n \n \n Mapping with function as key (figures of the same type have the same key):");
        maker.makeArrayList();
        System.out.println(RichClass.groupByFigure(maker.getArrayList()));

        System.out.println("\n \n \n Filtering collection of figures to ArrayList of Circles:");
        maker.makeArrayList();
        Collection<Circle> arrayOfCircles = RichClass.select(maker.getArrayList(), Circle.class);
        System.out.println(arrayOfCircles);
    }


    private static class FigureAreaComparator implements Comparator<Figure> {
        @Override
        public int compare(Figure f1, Figure f2) {
            return ((Double)f1.getArea()).compareTo((Double)f2.getArea());
        }
    }


    private static class FigureComparatorForSet implements Comparator<Figure> {
        @Override
        public int compare(Figure f1, Figure f2) {
            if (f1.getArea()<f2.getArea()) {
                return -1;
            }
            else if (f1.getArea()>f2.getArea()) {
                return 1;
            }
            else if (f1.getClass()==f2.getClass()&&f1.getColor()==f2.getColor()) {
                return 0;
            }
            else {
                return -1;
            }
        }
    }
}
