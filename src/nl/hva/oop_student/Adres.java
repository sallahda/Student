package nl.hva.oop_student;

public class Adres {
    private String straat;
    private int huisnummer;
    private String postcode;
    private String plaats;

    public Adres(String straat, int huisnummer, String postcode, String plaats) {
        this.straat = straat;
        this.huisnummer = huisnummer;
        this.postcode = postcode;
        this.plaats = plaats;
    }


    public static boolean isGeldigePostcode(String postcode) {

        boolean uitkomst = postcode.matches("^[1-9][0-9]{3}[A-Za-z]{2}$");

        return uitkomst;
    }

    public String toString() {
        return String.format("%s %d, %s, %s",this.straat, this.huisnummer, this.postcode, this.plaats);
    }
}
