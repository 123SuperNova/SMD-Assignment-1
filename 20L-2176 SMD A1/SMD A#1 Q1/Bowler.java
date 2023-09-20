public class Bowler extends Cricketer implements BowlerInterface {
    int Wickets;
    int BowlerRanking;

    public Bowler(String _N, int _age, String _Nat, int _W, int BR) {
        super(_N, _age, _Nat);
        this.Wickets = _W;
        this.BowlerRanking = BR;
    }

    @Override
    public void Print() {
        System.out.println("Wickets: " + Wickets + "\nBowler Ranking: " + BowlerRanking);
    }

    @Override
    public int getranking() {
        return BowlerRanking;
    }
}