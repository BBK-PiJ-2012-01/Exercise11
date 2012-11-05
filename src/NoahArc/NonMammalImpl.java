package NoahArc;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 05/11/2012
 * Time: 15:56
 */
public class NonMammalImpl extends AnimalImpl implements NonMammal {
    public NonMammalImpl(String animal, TimeFrame timeFrame, String sound) {
        super(animal, timeFrame, sound);
    }

    @Override
    public void layEggs() {
        System.out.format("I am giving birth to another %s!", getName());
    }

    @Override
    public void reproduce() {
        layEggs();
    }
}
