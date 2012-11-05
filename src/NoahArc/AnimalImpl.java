package NoahArc;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 05/11/2012
 * Time: 15:59
 */
public abstract class AnimalImpl implements Animal {
    private TimeFrame timeFrame;
    private String name, sound;

    public AnimalImpl(String name, TimeFrame timeFrame, String sound) {
        this.name = name;
        this.timeFrame = timeFrame;
        this.sound = sound;
    }

    @Override
    public final void call() {
        timeFrame.call(name);
    }

    @Override
    public final String getName() {
        return name;
    }

    @Override
    public final void makeSound() {
        System.out.println(sound);
    }
}
