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
    public void givenString_ReturnTwoHouses (){
        /*1.
        * RED:   I set the desired value and get the result from the method created at first test case
        *        So this first time the Test will fail since we are returning 1 inside calculateHouses() method
        * GREEN  I make changes in method to return 2 when tje lenght of the string is 1. Nothing to refactor
        * 2.
        * RED: Enter any character is working. this should only work for ">,<,^,v"
        * GREEN: Establish conditions for this be accomplished, refactor adding some spaces
        * REFACTOR: Drop the unneccesary if
        * */
        //int expected = 2;
        try {
            //int houseCount = new Challenge("asdf").getNumberOfHouses();
            new Challenge("asdf").getNumberOfHouses();
            //int houseCount = Challenge.getNumberOfHouses();
//            Assert.assertEquals(expected, houseCount);
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
        //int houseCount = new Challenge(">^");
        Assert.assertEquals(expected, houseCount);
    }
}
