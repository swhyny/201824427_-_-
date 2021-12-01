### FootballClub.java
```java
import java.util.ArrayList;
import java.util.Objects;

public class FootballClub {
    private String name;
    private  final int maxSquadSize = 25;
    private ArrayList<Player> squad = new ArrayList<Player>(maxSquadSize);

    public FootballClub(String s) {
        name = s;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FootballClub that = (FootballClub) o;
        return Objects.equals(name, that.name) && Objects.equals(squad, that.squad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, maxSquadSize, squad);
    }*/

    public String toString() {
        System.out.println();
        String msg = "FootballClub Name: " + name + " Player Count: " + squad.size() + "\n";
        for (int i = 0; i < squad.size(); i++) {
            msg += "\t [" + squad.get(i).getName() + ", " + squad.get(i).getlast() + " " + squad.get(i).getNumber() + "]\n";
        }
        return msg;
    }

    public void addPlayer(Player newPlayer) {
        squad.add(newPlayer);
        System.out.println();
    }

    public void removeAllPlayer() {
        squad.clear();
        System.out.println();
    }

    public Player findPlayer(String playerFirstName, int jerseyNumber) {
        int find=0;
        Player result;
        for(int i=0; i<squad.size(); i++) {
            if (Objects.equals(squad.get(i).getName(), playerFirstName) && squad.get(i).getNumber() == jerseyNumber) {
                return squad.get(i);
            }
        }
        System.out.println();
        return null;
    }
}
```

### Player.java
```java
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
        System.out.println();
        String msg = "";
        msg += "[" + lastname + ", " + firstName + " " + jerseyNumber + "]";
        return msg;
    }
}
```
