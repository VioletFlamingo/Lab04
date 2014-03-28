public enum Color {
    RED(true, false, false),
    BLUE(false, false, true),
    GREEN(false, true, false),
    YELLOW(true, true, false),
    PINK(true, false, true),
    TURQUOISE(false, true, true),
    WHITE(true, true, true),
    BLACK(false, false, false);

    private final  boolean red;
    private final boolean green;
    private final boolean blue;

    private Color(final boolean R, final boolean G, final boolean B) {
        this.red=R;
        this.green=G;
        this.blue=B;
    }

}
