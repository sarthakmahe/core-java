public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("sarthak", 500);
        System.out.println(newScore);
        calculateScore(75);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("player " + playerName + " scorerd " +
                score + " points");
        return score * 1000;

    }

    public static int calculateScore( int score) {
        System.out.println("unknown player scorerd " +
                score + " points");
        return score * 1000;
    }
}
