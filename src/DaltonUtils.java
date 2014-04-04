/**
 * Created by Paulina on 04.04.2014.
 */
public class DaltonUtils {
    public static boolean colorEquals(Figure f1, Figure f2){
        if(f1.getColor() == f2.getColor())
            return true;
        if(f1.getColor() == Color.GREEN && f2.getColor() == Color.RED)
            return true;
        if(f1.getColor() == Color.RED && f2.getColor() == Color.GREEN)
            return true;
        return false;
    }
}
