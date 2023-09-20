public class PG_Student extends Student {
    String Roll_No;
    String Specialization;
    public String SubmitThesis(){
        return Name + " is submitting a thesis.\n";
    }
    public PG_Student(int aadhar_id, String name, String address, int phone, String profession, String student_ID,
    String major, int year, int semester, String college, int grade, String roll_No, String specialization) {
        super(aadhar_id, name, address, phone, profession, student_ID, major, year, semester, college, grade);
        Roll_No = roll_No;
        Specialization = specialization;
    }
}
