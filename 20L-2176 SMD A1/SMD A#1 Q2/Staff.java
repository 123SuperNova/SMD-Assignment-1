public class Staff extends Person {
    String Emp_id;
    String Emp_Role;
    String Emp_Dept;
    Float Emp_Salary;
    int Emp_Experince;
    @Override
    public String Attend(String Duty){
        return Name + " attending " + Duty + ".\n";
    }
    public String getPramotion(){
        return Name + " is getting a pramotion.\n";
    }
    public Float getSalary(){
        return Emp_Salary;
    }
    public Staff(int aadhar_id, String name, String address, int phone, String profession, String emp_id, String emp_Role,
    String emp_Dept, Float emp_Salary, int emp_Experince) {
        super(aadhar_id, name, address, phone, profession);
        Emp_id = emp_id;
        Emp_Role = emp_Role;
        Emp_Dept = emp_Dept;
        Emp_Salary = emp_Salary;
        Emp_Experince = emp_Experince;
    }
}
