public class Batsman extends Cricketer implements BatsmanInterface {
    int Score;
    int BatsmanRanking;

    public Batsman(String _N, int _age, String _Nat, int _s, int _BR) {
        super(_N, _age, _Nat);
        this.Score = _s;
        this.BatsmanRanking = _BR;
    }

    @Override
    public void Print() {
        System.out.println("Score: " + Score + "\nBatsman Ranking: " + BatsmanRanking);
    }

    @Override
    public int getranking() {
        return BatsmanRanking;
    }
}
