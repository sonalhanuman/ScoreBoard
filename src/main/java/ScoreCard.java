public class ScoreCard {
    private int teamA;
    private int teamB;

    public int getTeamA() {
        return teamA;
    }

    public void setTeamA(int teamA) {
        this.teamA = teamA;
    }

    public int getTeamB() {
        return teamB;
    }

    public void setTeamB(int teamB) {
        this.teamB = teamB;
    }

    public ScoreCard (int teamA, int teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
    }

    public String convertDisplay() {
        String displayTeamA = String.format("%03d", teamA);
        String displayTeamB = String.format("%03d", teamB);
        String displayScore = displayTeamA + ":" + displayTeamB;
        return displayScore;
    }
}
