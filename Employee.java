package co.develhope.introduction._18;

public class Employee {
    public String name;
    public String surname;
    public String address;

    public Employee (String newEmployeeName , String newEmployeeSurname , String newEmployeeAddress){
        this.name=newEmployeeName;
        this.surname=newEmployeeSurname;
        this.address=newEmployeeAddress;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void getEmployeeDetails(){
        System.out.println("Name = " + name);
        System.out.println("Surname = " + surname);
        System.out.println("Address = " + address);
    }

}
