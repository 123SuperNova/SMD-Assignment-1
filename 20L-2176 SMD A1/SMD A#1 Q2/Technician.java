public class Technician extends Staff {
    String Tech_Type;
    String Maintain(String Lab){
        return Name + " maintains a lab in " + Lab + ".\n";
    }
    String Install(String system){
        return Name + " is installing " + system + ".\n";
    }

    public Technician(int aadhar_id, String name, String address, int phone, String profession, String emp_id,
    String emp_Role, String emp_Dept, Float emp_Salary, int emp_Experince, String tech_Type) {
        super(aadhar_id, name, address, phone, profession, emp_id, emp_Role, emp_Dept, emp_Salary, emp_Experince);
        Tech_Type = tech_Type;
    }
}
