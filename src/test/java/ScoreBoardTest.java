import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreBoardTest {

    @Test
    void startScoreZeroTeamAWin1() {
        ScoreCard scoreCard = new ScoreCard(0, 0);
        ScoreBoard scoreBoard = new ScoreBoard();
        assertEquals("001:000",scoreBoard.generateFinalScore(scoreCard, 1, 0));
    }

    @Test
    void secondRoundTeamBWin3() {
        ScoreCard scoreCard = new ScoreCard(1, 0);
        ScoreBoard scoreBoard = new ScoreBoard();
        assertEquals("001:003",scoreBoard.generateFinalScore(scoreCard, 0, 3));
    }

    @Test
    void gotPenaltyMinusTeamA2() {
        ScoreCard scoreCard = new ScoreCard(1, 3);
        ScoreBoard scoreBoard = new ScoreBoard();
        assertEquals("-01:003",scoreBoard.generateFinalScore(scoreCard, -2, 0));
    }
}