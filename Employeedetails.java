import java.util.Scanner;
class Employee
{
    String Name,Address;
    int Age,Salary;
    long Phonenumber;
    void print_Salary()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Salary of the Employee");
        Salary=sc.nextInt();
        System.out.println("Salary of the Employee is "+Salary);
    }
}

class Officer extends Employee
{
    String specialization, department;
    void readprint()
    {
        Scanner imp=new Scanner(System.in);
        System.out.println("Enter Name of the Officer");
        Name=imp.nextLine();
        System.out.println("Enter Address of the Officer");
        Address=imp.nextLine();
        System.out.println("Enter Specialization of the Officer");
        specialization=imp.nextLine();
        System.out.println("Enter Department of the Officer");
        department=imp.nextLine();
        System.out.println("Enter Age of the Officer");
        Age=imp.nextInt();
        System.out.println("Enter Phone number of the Officer");
        Phonenumber=imp.nextLong();
        System.out.println("Enter Salary of the Officer");
        Salary=imp.nextInt();
        System.out.println();
        System.out.println("Name of the Officer is "+Name);
        System.out.println("Age of the Officer is "+Age);
        System.out.println("Phone number of the Officer is "+Phonenumber);
        System.out.println("Address of the Officer is "+Address);
        System.out.println("Salary of the Officer is "+Salary);
        System.out.println("Specialization of the Officer is "+specialization);
        System.out.println("Department of the Officer is "+department);
        System.out.println();
    }
}

class Manager extends Employee
{
    String specialization, department;
    void readprint()
    {
        Scanner imp=new Scanner(System.in);
        System.out.println("Enter Name of the Manager");
        Name=imp.nextLine();
        System.out.println("Enter Address of the Manager");
        Address=imp.nextLine();
        System.out.println("Enter Specialization of the Manager");
        specialization=imp.nextLine();
        System.out.println("Enter Department of the Manager");
        department=imp.nextLine();
        System.out.println("Enter Age of the Manager");
        Age=imp.nextInt();
        System.out.println("Enter Phone number of the Manager");
        Phonenumber=imp.nextLong();
        System.out.println("Enter Salary of the Manager");
        Salary=imp.nextInt();
        System.out.println();
        System.out.println("Name of the Manager is "+Name);
        System.out.println("Age of the Manager is "+Age);
        System.out.println("Phone number of the Manager is "+Phonenumber);
        System.out.println("Address of the Manager is "+Address);
        System.out.println("Salary of the Manager is "+Salary);
        System.out.println("Specialization of the Manager is "+specialization);
        System.out.println("Department of the Manager is "+department);
        System.out.println();
    }
}

public class Employeedetails
{
    public static void main(String args[])
    {
        Manager obj1=new Manager();
        obj1.readprint();
        Officer obj2=new Officer();
        obj2.readprint();
        obj2.print_Salary();
    }
}
