import java.util.*;


public class FigureMaker{
    private List<Figure> figures;
    private Set<Figure> figureSet;
    Random rand = new Random();

    public void makeArrayList () {
        figures = new ArrayList<Figure>();
        int numberOfFigures = rand.nextInt(30)+1;
        for(int i=0; i<numberOfFigures; i++) {
            switch (whichFigure()) {
                case 0 : figures.add(createRandomCircle()); break;
                case 1 : figures.add(createRandomRectangle()); break;
                case 2 : figures.add(createRandomTriangle()); break;
            }
        }
    }

    public void makeHashSet() {
        figureSet = new HashSet<Figure>();
        figureSet.add(new Triangle(3, Color.RED));
        figureSet.add(new Triangle(3, Color.RED));
        figureSet.add(new Triangle(2, Color.GREEN));
        figureSet.add(new Triangle(3, Color.GREEN));
        figureSet.add(new Triangle(3, Color.BLACK));
        figureSet.add(new Circle(2, Color.RED));
        figureSet.add(new Circle(3, Color.RED));
        figureSet.add(new Rectangle(1, 3, Color.BLUE));
        figureSet.add(new Rectangle(3, 1, Color.BLUE));
    }

    public void makeTreeSet() {
        figureSet = new TreeSet<Figure>();
        figureSet.add(new Triangle(2, createRandomColor()));
        figureSet.add(new Triangle(2, createRandomColor()));
        figureSet.add(new Triangle(4, createRandomColor()));
        figureSet.add(new Circle(1, createRandomColor()));
        figureSet.add(new Circle(2, createRandomColor()));
    }

    public void makeLinkedTreeSet() {
        figureSet= new LinkedHashSet<Figure>();
        figureSet.add(new Triangle(3, createRandomColor()));
        figureSet.add(new Triangle(2, createRandomColor()));
        figureSet.add(new Circle(2, createRandomColor()));
    }

    public List<Figure> getArrayList () {
        return this.figures;
    }

    public Set<Figure> getSet () {
        return this.figureSet;
    }

    public Circle createRandomCircle () {
        double r = rand.nextDouble();
        return new Circle(r, createRandomColor());
    }

    public Rectangle createRandomRectangle () {
        double length = rand.nextDouble();
        double width = rand.nextDouble();
        return new Rectangle(length, width, createRandomColor());
    }

    public Triangle createRandomTriangle () {
        double length = rand.nextDouble();
        return new Triangle(length, createRandomColor());
    }

    private int whichFigure () {
        return rand.nextInt(3);
    }

    private Color createRandomColor() {
        int pick = rand.nextInt(Color.values().length);
        return Color.values()[pick];
    }
}

