package RankingPoints;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class FootballTeamTest extends TestCase {
    FootballTeam ft;
    @Before
    public void setUp() {
        ft = new FootballTeam();
    }
    @Test
    public void testGetTeamName() {
        ft=new FootballTeam("Chelsea",33,"Happy Foot");
        assertEquals("Chelsea",ft.getTeamName());
    }
    @Test
    public void testGetPoints() {
        ft=new FootballTeam("Chelsea",33,"Happy Foot");
        assertEquals(33,ft.getPoints());
    }
    @Test
    public void testGetSponsor() {
        ft=new FootballTeam("Chelsea",33,"Happy Foot");
        assertEquals("Happy Foot",ft.getSponsor());
    }

}