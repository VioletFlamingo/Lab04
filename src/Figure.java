interface Figure extends Comparable<Figure>{
    Color getColor();
    double getArea();

    @Override
    boolean equals(Object f);

    @Override
    int hashCode();
}

