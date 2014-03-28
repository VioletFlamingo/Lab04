import java.util.Comparator;

public class Main {
    public static void main (String[] args) {
        FigureMaker maker = new FigureMaker();

    /*
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
    */

        maker.makeArrayList();
        System.out.println(RichClass.doubleArea(maker.getArrayList()));
        RichClass.fun(maker.getArrayList(), Triangle.class);

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
