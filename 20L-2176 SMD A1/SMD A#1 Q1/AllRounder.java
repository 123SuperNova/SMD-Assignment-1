class AllRounder implements BatsmanInterface, BowlerInterface {
    int ranking;

    public AllRounder(String _N, int _age, String _Nat, int _r) {
        this.ranking = _r;
    }

    @Override
    public void Print() {
        System.out.println("All-rounder Ranking: " + ranking);
    }

    @Override
    public int getranking() {
        return ranking;
    }
}

