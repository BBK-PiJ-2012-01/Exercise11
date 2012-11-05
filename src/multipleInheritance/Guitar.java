package multipleInheritance;

/**
 * Created with IntelliJ IDEA.
 * User: Sam Wright
 * Date: 05/11/2012
 * Time: 14:57
 */
public class Guitar extends MusicalInstrument {
    private WoodenObject wood_delegator = new WoodenObject();

    public void burn() {
        wood_delegator.burn();
    }
}
