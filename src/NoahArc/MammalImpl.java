package NoahArc;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 05/11/2012
 * Time: 15:51
 */
public class MammalImpl extends AnimalImpl implements Mammal {
    public MammalImpl(String animal, TimeFrame timeFrame, String sound) {
        super(animal, timeFrame, sound);
    }

    @Override
    public void giveBirth() {
        System.out.format("I am giving birth to another %s!\n", getName());
    }

    @Override
    public void reproduce() {
        giveBirth();
    }
}
