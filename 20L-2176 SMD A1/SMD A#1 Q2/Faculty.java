public class Faculty extends Staff {
    String Faculty_Specialization;
    String Section;
    int No_of_Students;
    String Qualification;
    public String Teach(String Course){
        return Name + " is teaching " + Course + ".\n";
    }
    public String Assess(String Student_Grade){
        return Name + " is assessing " + Student_Grade + ".\n";
    }

    public Faculty(int aadhar_id, String name, String address, int phone, String profession, String emp_id,
    String emp_Role, String emp_Dept, Float emp_Salary, int emp_Experince, String faculty_Specialization,
    String section, int no_of_Students, String qualification) {
        super(aadhar_id, name, address, phone, profession, emp_id, emp_Role, emp_Dept, emp_Salary, emp_Experince);
        Faculty_Specialization = faculty_Specialization;
        Section = section;
        No_of_Students = no_of_Students;
        Qualification = qualification;
    }
}
