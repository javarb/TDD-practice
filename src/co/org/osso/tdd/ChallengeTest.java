package co.org.osso.tdd;

import org.junit.Assert;
import org.junit.Test;

public class ChallengeTest {

    // we cause an error at first and the most simple is the nonexistent class we need to test methods
    @Test
    public void givenEmptyString_ReturnOneHouse () {
        //new Challenge()
        //I make this red when the method doesn't exists. When I create becomes green and after I refactor (nothing to do here)
        //new Challenge().calculateHouses("");
        // Now is red when doesn't return anything. Green we make the method to return int (this is primitive we don't need null). to refactor cleaned some spaces
        int houseCount = new Challenge("").getNumberOfHouses();
        //int houseCount = new Challenge().calculateHouses("");
        // At this part its red since the returned value in the method is 0. We make greeen changin that value there. Nothing to refactor
        int expected = 1;
        Assert.assertEquals(expected, houseCount);
        // Now we have a complete method

    }

    //@Test(<expect...> = RuntimeException.class)
    // Another way to do it but I have not access to the Runtimexception
    @Test
    public void givenWrongString_ReturnError (){
        try {

            new Challenge("asdf").getNumberOfHouses();
            // this is only ran when there's no an throwed exception
            Assert.fail();
            // As I throwed an exception that exception is handled here
        } catch (RuntimeException re){
            Assert.assertTrue(re.getMessage().contains("Error:"));
            //re.printStackTrace();
        }

    }

    @Test
    public void givenString_ReturnNumberOfHouses () {
        /*1.
         * RED: I set the desired value, but my method is not able to do it
         * GREEN: Adding some logic to handle it
         */
        int expected = 8;
        int houseCount = new Challenge(">^><^>>v").getNumberOfHouses();

        Assert.assertEquals(expected, houseCount);
    }
}
