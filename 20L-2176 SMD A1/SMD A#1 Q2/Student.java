public class Student extends Person {
    String Student_ID;
    String Major;
    int Year;
    int Semester;
    String College;
    int grade;
    @Override
    public String Register(String Course) {
        return Name + " is registered in " + Course + ".\n";
    }
    public int getGrade(){return grade;}
    @Override
    public String Attend(String Class){
        return Name + " attended " + Class + ".\n";
    }
    public String Learn(){
        return Name + " is learning.\n";
    }
    public Student(int aadhar_id, String name, String address, int phone, String profession, String student_ID,
    String major, int year, int semester, String college, int grade) {
        super(aadhar_id, name, address, phone, profession);
        Student_ID = student_ID;
        Major = major;
        Year = year;
        Semester = semester;
        College = college;
        this.grade = grade;
    }
}
