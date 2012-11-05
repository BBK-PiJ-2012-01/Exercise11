package NoahArc;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 05/11/2012
 * Time: 15:50
 */
public class AnimalFactory {
    public static Animal create(String name, boolean isMammal, TimeFrame timeFrame, String sound) {
        if (isMammal)
            return new MammalImpl(name, timeFrame, sound);
        else
            return new NonMammalImpl(name, timeFrame, sound);
    }
}
