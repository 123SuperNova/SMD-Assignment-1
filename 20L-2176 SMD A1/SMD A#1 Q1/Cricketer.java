class Cricketer implements CricketerInterface {
    String Name;
    int age;
    String Nationality;

    public Cricketer(String name, int age, String nationality) {
        this.Name = name;
        this.age = age;
        this.Nationality = nationality;
    }

    @Override
    public void Print() {
        System.out.println("Name: " + Name + "\nAge: " + age + "\nNationality: " + Nationality);
    }
}