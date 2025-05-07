public class frq2 {
    public static class Scoreboard{
        private String team1;
        private String team2;
        private String active;
        private int score1 = 0;
        private int score2 =0;
        public Scoreboard(String temp1, String temp2){
            team1 = temp1;
            team2 = temp2;
            active = team1;
        }
        public String getScore(){
            return score1 + " - " + score2 + " - " + active;
        }
        public void recordPlay(int points){
            if (points >= 1){
                if (active.equals(team1)){
                    score1+=points;
                }
                else if (active.equals(team2)){
                    score2+=points;
                }
            }
            else{
                if (active.equals(team1)){
                    active = team2;
                }
                else if (active.equals(team2)){
                    active = team1;
                }
            }
        }
    }
    public static void main(String[] args){
        Scoreboard beef = new Scoreboard("Drake", "Kendrick");
        System.out.println(beef.getScore());
        beef.recordPlay(69);
        System.out.println(beef.getScore());
        beef.recordPlay(0);
        System.out.println(beef.getScore());
        beef.recordPlay(6942);
        System.out.println(beef.getScore());
    }
}
