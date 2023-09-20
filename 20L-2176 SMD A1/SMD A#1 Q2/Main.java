public class Main {
    public static void main(String[] args) {
        Student student = new Student(12345, "John Doe", "123 Main St", 1234567890, "Student", "S12345", "Computer Science",
                2, 3, "XYZ College", 85);
        myprint(student.Register("CS101"));
        myprint(student.Attend("CS101"));
        myprint(student.Learn());
        myprint("Grade: " + student.getGrade());

        Staff staff = new Staff(56789, "Alice Smith", "456 Elm St", 987654321, "Staff", "E56789", "Manager", "HR",
                55000.0f, 5);
        myprint(staff.Attend("Staff Meeting"));
        myprint(staff.getPramotion());
        myprint("Salary: $" + staff.getSalary());

        PG_Student pgStudent = new PG_Student(67890, "Jane Smith", "789 Oak St", 555555555, "PG Student", "PG12345",
                "Data Science", 1, 1, "ABC College", 92, "PGS67890", "Machine Learning");
        myprint(pgStudent.SubmitThesis());

        Faculty faculty = new Faculty(34567, "Prof. James Brown", "234 Maple St", 777777777, "Faculty", "F34567",
                "Professor", "Computer Science", 75000.0f, 10, "Machine Learning", "A", 50, "Ph.D.");
        myprint(faculty.Teach("CS301"));
        myprint(faculty.Assess("A"));

        Technician technician = new Technician(45678, "Tech Smith", "567 Pine St", 888888888, "Technician", "T45678",
                "Lab Technician", "Physics Lab", 60000.0f, 3, "Physics");
        myprint(technician.Maintain("Physics Lab"));
        myprint(technician.Install("Lab Equipment"));
    }
    public static void myprint(String str){
        System.out.println(str);
    }
}

