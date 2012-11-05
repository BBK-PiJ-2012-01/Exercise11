package phone;

/**
 * Created with IntelliJ IDEA.
 * User: eatmuchpie
 * Date: 05/11/2012
 * Time: 13:42
 * To change this template use File | Settings | File Templates.
 */
public class OldPhone implements Phone {
    @Override
    public void call(String number) {
        System.out.format("Calling %s\n", number);
    }
}
