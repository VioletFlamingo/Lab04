interface Figure extends Comparable<Figure>{
    Color getColor();
    double getArea();
    FigureSize<Double> getDims();
}

