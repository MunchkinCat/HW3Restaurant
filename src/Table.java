import java.util.ArrayList;
import java.util.List;

/**
 * @author Created by Gabe on 2/4/2017.
 */
public class Table{

    /**
     * variables for immutability delclared below
     */

    private final int id = 0;
    private final int seats = 0;
    private final boolean taken = true;

    /**
     * constructor, made to be immutable
     */


    public Table(int id, int seats, boolean taken) {
        int tableID = id;
        int tableseats = seats;
        boolean tabletaken = false;

    }



    /** @return whether the table is taken or is free*/
    boolean isTaken() {
        return this.taken;
    }

    /**returns a text representation of the table */
    public String toString(){
        return ( id + seats + Boolean.toString(isTaken()));
    }

    /** */
    public Table getTableByID(int id)throws IllegalArgumentException{
    for( Table i: tables){
    if(i.id == id){
        return i;
    }
    else
    }
    }


}
