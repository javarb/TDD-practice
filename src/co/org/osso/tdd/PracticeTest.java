package co.org.osso.tdd;


import org.junit.Assert;
import org.junit.Test;

public class PracticeTest {

    // Convention for tests is to call this field object target in order not depend of the class name
    // or "mut" module under test? - not recommended target is more common
    Practice target = new Practice();
    // hast to be defined so
    /*  @Test
        - public
        - void
        - no args
    * */
    @Test
    public void a() {
        //Assert.assertEquals(1,2);
        Assert.assertEquals(2, target.returnTwo());

    }

    @Test
    public void greetsMeProperly() {

        String expected = "Hello, Javier!";
        String actual = target.greet("Javier");
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void greetRogerProperly() {

        String expected = "Hello, Roger!";
        String actual = target.greet("Roger");
        Assert.assertEquals(expected, actual);

    }

}
