package edu.pnu.admin;
public class Player {
    private String firstName;
    private String lastname;
    private int jerseyNumber;

    public Player(String playerFirstName, String playerLastName, int jerseyNumber) {
        firstName = playerFirstName;
        lastname = playerLastName;
        this.jerseyNumber = jerseyNumber;
    }

    public String getName() {
        return firstName;
    }

    public String getlast() {
        return lastname;
    }

    public int getNumber() {
        return jerseyNumber;
    }

    public String toString() {
        String msg = "";
        msg += "[" + lastname + ", " + firstName + " " + jerseyNumber + "]";
        return msg;
    }
}
