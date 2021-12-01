package edu.pnu.admin;
import edu.pnu.collection.*;
import java.util.Objects;

public class FootballClub {
    private String name;
    private  final int maxSquadSize = 25;
    private GenericList<Player> squad = new GenericList<Player>();

    public FootballClub(String s) {
        name = s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FootballClub that = (FootballClub) o;
        return Objects.equals(name, that.name) && Objects.equals(squad, that.squad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, maxSquadSize, squad);
    }

    public String toString() {
        String msg = "FootballClub Name: " + name + " Player Count: " + squad.size() + "\n";
        for (int i = 0; i < squad.size(); i++) {
            msg += "\t [" + squad.get(i).getlast() + ", " + squad.get(i).getName() + " " + squad.get(i).getNumber() + "]\n";
        }
        return msg;
    }

    public void addPlayer(Player newPlayer) {
        squad.add(newPlayer);
    }

    public void removeAllPlayer() {
        squad.clear();
    }

    public Player findPlayer(String playerFirstName, int jerseyNumber) {
        int find=0;
        Player result;
        for(int i=0; i<squad.size(); i++) {
            if (Objects.equals(squad.get(i).getName(), playerFirstName) && squad.get(i).getNumber() == jerseyNumber) {
                find = i;
                break;
            }
        }

        if (find > 0) {
            result = squad.get(find);
            return result;
        }
        else
            return null;
    }
}
