package RankingPoints;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class BasketballTeamTest extends TestCase {

    BasketballTeam bt;
    @Before
    public void setUp() {
        bt = new BasketballTeam();
    }


    @Test
    public void updatePoints() {
        bt = new BasketballTeam("Boston Celtics", 10);
        bt.updatePoints("Win");
        assertEquals(12, bt.getPoints(), 0);
    }


    @Test
    public void testGetTeamName() {
        bt = new BasketballTeam("Boston Celtics", 10);
        assertEquals("Boston Celtics",bt.getTeamName());
    }

    @Test
    public void testGetPoints() {
        bt = new BasketballTeam("Boston Celtics", 10);
        // bt.setPoints(10);
        assertEquals(10,bt.getPoints());
    }
}