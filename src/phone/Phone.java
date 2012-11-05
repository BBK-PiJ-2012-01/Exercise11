package phone;

/**
 * Created with IntelliJ IDEA.
 * User: eatmuchpie
 * Date: 05/11/2012
 * Time: 13:34
 * To change this template use File | Settings | File Templates.
 */

/**
 * A phone makes calls
 */
public interface Phone {
    /**
     * Just print on the screen: "Calling <number>...".
     */
    void call(String number);
}