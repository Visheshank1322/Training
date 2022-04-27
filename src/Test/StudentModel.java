package Test;

public class StudentModel {
    String name;
    int age;
    String Standard;
    int Roll_no;
    int phone;
    String Address;

    StudentModel(String name, int age, String Standard, int Roll_no, int phone, String Address) {
        this.name = name;
        this.age =age;
        this.Standard = Standard;
        this.Roll_no= Roll_no;
        this.phone = phone;
        this.Address = Address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRoll_no() {
        return Roll_no;
    }

    public void setRoll_no(int roll_no) {
        Roll_no = roll_no;
    }

    public String getStandard() {
        return Standard;
    }

    public void setStandard(String standard) {
        Standard = standard;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
