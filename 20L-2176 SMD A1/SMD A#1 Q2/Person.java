abstract class Person {
    int Aadhar_id;
    String Name;
    String Address;
    int Phone;
    String Profession;
    public String Register(String UID){
        return Name + " is registered as " + UID + ".\n";
    }
    public String Perform(String duty){
        return Name + " is performing " + duty + ".\n";
    }
    public String include(String service){
        return service + " is included.\n";
    }
    public String like(String item){
        return Name + " likes this " + item + ".\n";
    }
    public abstract String Attend(String Duty_Class);

    public Person(int aadhar_id, String name, String address, int phone, String profession) {
        this.Aadhar_id = aadhar_id;
        this.Name = name;
        this.Address = address;
        this.Phone = phone;
        this.Profession = profession;
    }
}
