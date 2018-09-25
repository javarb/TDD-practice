package co.org.osso.tdd;

import java.util.HashSet;
import java.util.Set;

public class Challenge {

    // HashSet only allows one single occurrence of each element
    Set<String> coord = new HashSet<>();
    String str;

    /**
     * This methods populate the HashSet with the coordinates (override string in House object).
     * Each coordinate is calculated taking the same House object and adding or subtracting according to the movement direction.
     * @param s is string with the given path. ie: ">^><^>>v"
     */
    public Challenge (String s){
            str=s;
            House house = new House(0, 0);
            coord.add(house.toString());
            byte[] direct = str.getBytes();

            for (int i = 0; i < direct.length; i++) {
                house = calculateHouses(direct[i], house);
                coord.add(house.toString());
            }
    }

    /**
     * Returns the amount of visited houses depending in the provided string in the constructor. ie: ">^><^>>v" returns 8
     * @return
     */
    public int getNumberOfHouses(){
        if (str.length() == 0){
            return 1;
        } else {
            return coord.size();
        }
    }

    /**
     * Adds or subtract the coordinates in House object depending on each received char of the provided string in the constructor
     * @param c The char
     * @param house House object
     * @return Modified House Object
     */
    public House calculateHouses(byte c, House house) {

        switch (c){
            case '<' :
                return new House(house.x - 1, house.y);
            case '>' :
                return new House(house.x + 1, house.y);
            case 'v' :
                return new House(house.x, house.y - 1);
            case '^' :
                return new House(house.x, house.y + 1);
            default:
                throw new RuntimeException("Error: valid characters are <,>,^ and v");

        }
    }
}


/*
*
* caso que mire cada caracter y actaulzia las coordenadas con base en el objeto anterior, añadiendo o quitando uno en x o y*/

/*project euler
codewars
*/