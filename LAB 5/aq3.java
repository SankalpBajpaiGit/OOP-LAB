interface Sports {
    int getNumberOfGoals();
    String dispTeam();
}
class Hockey implements Sports {
    private String team1;
    private String team2;
    private int goalsTeam1;
    private int goalsTeam2;

    public Hockey(String team1, String team2, int goalsTeam1, int goalsTeam2) {
        this.team1 = team1;
        this.team2 = team2;
        this.goalsTeam1 = goalsTeam1;
        this.goalsTeam2 = goalsTeam2;
    }
    public int getNumberOfGoals() {
        return goalsTeam1 + goalsTeam2;
    }
    public String dispTeam() {
        if (goalsTeam1 > goalsTeam2) {
            return team1 + " wins!";
        } else if (goalsTeam2 > goalsTeam1) {
            return team2 + " wins!";
        } else {
            return "It's a tie!";
        }
    }
}
class Football implements Sports {
    private String teamA;
    private String teamB;
    private int goalsTeamA;
    private int goalsTeamB;

    public Football(String teamA, String teamB, int goalsTeamA, int goalsTeamB) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.goalsTeamA = goalsTeamA;
        this.goalsTeamB = goalsTeamB;
    }

    public int getNumberOfGoals() {
        return goalsTeamA + goalsTeamB;
    }
    public String dispTeam() {
        if (goalsTeamA > goalsTeamB) {
            return teamA + " wins!";
        } else if (goalsTeamB > goalsTeamA) {
            return teamB + " wins!";
        } else {
            return "It's a draw!";
        }
    }
}
public class aq3{
    public static void main(String[] args) {
        Hockey hockeyMatch = new Hockey("Maple Leafs", "Blackhawks", 3, 2);
        Football footballMatch = new Football("Barcelona", "Real Madrid", 2, 2);

        System.out.println("Hockey match result: " + hockeyMatch.dispTeam());
        System.out.println("Total goals in hockey match: " + hockeyMatch.getNumberOfGoals());

        System.out.println("\nFootball match result: " + footballMatch.dispTeam());
        System.out.println("Total goals in football match: " + footballMatch.getNumberOfGoals());
    }
}
