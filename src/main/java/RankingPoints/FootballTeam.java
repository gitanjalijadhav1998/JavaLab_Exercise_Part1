package RankingPoints;

import java.util.Comparator;

public class FootballTeam implements Team {

    private String TeamName;
    private int Points;
    private String Sponsor;

    public FootballTeam(String teamName, int points, String sponsor) {
        TeamName = teamName;
        Points = points;
        Sponsor = sponsor;
    }

    public FootballTeam() {
    }

    @Override
    public void updatePoints(String result) {
        if(result.equals("Win"))
        {
            this.Points+=3;
        }
        if(result.equals("Drawn"))
        {
            this.Points+=1;
        }
    }

    public String getTeamName() {
        return TeamName;
    }
    public int getPoints() {
        return Points;
    }
    public String getSponsor() {
        return Sponsor;
    }


}
class Sortbypoints1 implements Comparator<FootballTeam>
{
    public int compare(FootballTeam a, FootballTeam b)
    {
        return a.getPoints() - b.getPoints();
    }
}
