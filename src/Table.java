//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @author Created by Gabe on 2/4/2017.
// *         An object a server can be assigned to. Parties
// */
//public class Table {
//
//    /**
//     * variables for immutability declared below
//     */
//
//    private final int id = 0;
//    private final int seats = 0;
//    private final Servers waiter = null;
//    private final Party party = null;
//
//    /**
//     * constructor, made to be immutable
//     *
//     * @param id    name of the table
//     * @param seats how many the table can seat
//     * @param party name of party sitting at the table
//     */
//    public Table(int id, int seats, Servers waiter, Party party) {
//        int tableID = id;
//        int tableseats = seats;
//        Servers serverWaiter = waiter;
//        Party partyName = party;
//
//
//    }
//
//
//    /**
//     * @return whether there is a party sitting at this
//     * table or if it is open to be seated
//     */
//    public boolean isTableFree() {
//        if (partyName == null) {
//            return true;
//        }
//        return false;
//    }
//
//    /**
//     * @returns a text representation of the table
//     */
//    public String toString() {
//        return (id + seats + Boolean.toString(isTableFree()));
//    }
//
//    /**
//     * @param id the id of the table the user wants to retrieve
//     * @returns the table in the list of tables by id
//     */
//    public Table getTableByID(int id) throws IllegalArgumentException {
//        for (Table i : tables) {
//            if (i.id == id) {
//                return i;
//            }
//        }
//        return null;
//    }
//
//    /**
//     * @return the number of tables available
//     * iterates through the list of tables counting
//     * which tables are not taken
//     */
//    public int tablesAvailable() {
//        int numbAvailable = 0;
//        for (Table i : tables) {
//            if (!i.isTableFree()) {
//                numbAvailable++;
//            }
//        }
//        return numbAvailable;
//    }
//
//    /**
//     * @param waiter assigns a waiter to a table,
//     *               only if the table is not full
//     */
//    public void assignWaiterToTable(Servers waiter) throws IllegalArgumentException {
//        if (this.isTableFree() && !isWaiterAssigned()) {
//            this.serverWaiter = waiter;
//        } else System.out.println("Waiter could not be assigned to table," +
//                "Table is either empty or already has a waiter assigned");
//    }
//
//
//    /**
//     * @return whether a waiter has been assigned to the table or not
//     */
//    public boolean isWaiterAssigned() {
//        if (serverWaiter != null) {
//            return true;
//        }
//        return false;
//    }
//
//
//    /**
//     * @param party the partyName that will sit at the given table
//     */
//    public void assignParty(Party party) throws IllegalArgumentException {
//        if (party != null) {
//            this.partyName = party;
//        }
//    }
//
//}
