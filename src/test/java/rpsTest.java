import org.junit.*;
import static org.junit.Assert.*;

public class rpsTest {

  @Test
  public void checkWinner_rockBeatsScissors_true() {
    RockPaperScissors testRBS = new RockPaperScissors();
    assertEquals(true, testRBS.checkWinner("Rock", "Scissors"));
   }

   @Test
   public void checkLoser_rockLosesToPaper_true() {
     RockPaperScissors testPBR = new RockPaperScissors();
     assertEquals(true, testPBR.checkLoser("Rock", "Paper"));
   }
}
