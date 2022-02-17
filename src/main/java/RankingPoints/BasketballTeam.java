package RankingPoints;

import java.util.Comparator;

public class BasketballTeam implements Team {

    private String TeamName;
    private int Points;
    private boolean updated=false;


    public BasketballTeam( String teamName, int points) {
        TeamName = teamName;
        Points = points;
    }

    public BasketballTeam() {
    }

    @Override
    public void updatePoints(String result) {
        if(result.equals("Win"))
        {
            Points+=2;
            updated=true;
        }
    }
    public boolean isUpdated(){
        if(updated==true){
            return true;
        }
        else {
            return false;
        }
    }

    public String getTeamName() {
        return TeamName;
    }
    public int getPoints() {
        return Points;
    }


}
class Sortbypoints implements Comparator<BasketballTeam> {
    public int compare(BasketballTeam a, BasketballTeam b)
    {
        return a.getPoints() - b.getPoints();
    }
    }
