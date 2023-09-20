public class Main {
    public static void main(String[] args) {
        Batsman batsman = new Batsman("John", 25, "England", 5000, 1);
        Bowler bowler = new Bowler("Alice", 28, "Australia", 200, 3);
        AllRounder allRounder = new AllRounder("Bob", 30, "India", 2);

        batsman.Print();
        System.out.println("Batsman Ranking: " + batsman.getranking());

        bowler.Print();
        System.out.println("Bowler Ranking: " + bowler.getranking());

        allRounder.Print();
        System.out.println("All-rounder Ranking: " + allRounder.getranking());

        Cricketer C = (Cricketer)bowler;//gets casted but prints with the bowler print not the Cricketer print.
        C.Print();

        CricketerInterface CI = (CricketerInterface) allRounder; //Cannot be casted.
        CI.Print();

        
    }
}