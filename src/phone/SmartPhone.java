package phone;

/**
 * Created with IntelliJ IDEA.
 * User: eatmuchpie
 * Date: 05/11/2012
 * Time: 14:03
 * To change this template use File | Settings | File Templates.
 */
public class SmartPhone extends MobilePhone {

    public void browseWeb(String str) {
        System.out.format("Browsing website at \'%s\'\n", str);
    }

    public String findPosition() {
        return "51.521792,-0.130651";
    }
}
