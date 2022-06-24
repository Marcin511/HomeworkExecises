package iterator.iterator;

import java.util.ArrayList;
import java.util.List;

public class Team implements FootballTeamIterator {
    List<FootballTeam> players = new ArrayList<>();
    public void addPlayer(FootballTeam footballTeam){players.add(footballTeam);}
 private int position = -1;
    @Override
    public boolean hasNext() {
        if((position + 1) <players.size()){
            return true;
        }else {
            return false;
        }
    }
    @Override
    public FootballTeam next() {
        return players.get(++position);
    }
}
