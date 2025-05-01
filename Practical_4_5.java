class Employee{
    String name;
    int empId;
    double salary;

    Employee(String name, int empId, double salary){
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    public void display(){
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee{
    String department;

    Manager(String name, int empId, double salary, String department){
        super(name, empId, salary);
        this.department = department;
    }

    public void display(){
        super.display(); 
        System.out.println("Department: " + department);
    }
}

class Developer extends Employee{
    String programmingLanguage;

    Developer(String name, int empId, double salary, String programmingLanguage) {
        super(name, empId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void display(){
        super.display(); 
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class Practical_4_5{
    public static void main(String[] args){
        Manager m = new Manager("Dhairy Trambadiya", 101, 75000, "HR");
        System.out.println("\nManager Details:");
        m.display();

        Developer d = new Developer("Vansh Hingrajiya", 102, 85000, "Java");
        System.out.println("\nDeveloper Details : ");
        d.display();
    }
}
