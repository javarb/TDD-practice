package co.org.osso.tdd;

import java.util.HashSet;
import java.util.Set;

public class House {

    // fields
    int x = 0;
    int y = 0;

    public House (int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return x + "," +  y;
    }

}
