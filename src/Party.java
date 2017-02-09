/**
 * @author Gabe on 2/4/2017.
 *
 * Class of Party who will fill tables. Contains constructors and getter methods for
 * Restaurant.
 */
public class Party {

    private int numbInParty;
    private String partyName;

    public Party(int numbInParty, String partyName) {
        this.numbInParty = numbInParty;
        this.partyName = partyName;
    }

    /**@return the number in a given party */
    public int getNumberInParty() {
        return numbInParty;
    }

    /**@return the partyname of a given party */
    public String getPartyName() {
        return partyName;
    }



}
