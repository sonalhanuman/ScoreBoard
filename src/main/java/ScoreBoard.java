public class ScoreBoard {

    public String generateFinalScore(ScoreCard scoreCard, int winA, int winB) {
        scoreCard.setTeamA(scoreCard.getTeamA() + winA);
        scoreCard.setTeamB(scoreCard.getTeamB() + winB);
        String displayScore = scoreCard.convertDisplay();
        return displayScore;
    }
}
