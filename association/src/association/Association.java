/*
 NAME: BINUYO SIMEON OLAJIDE
 DEPT: COMPUTER SCIENCE
 MATRIC NO: CSC/15/3045
 */package association;
public class Association {
public static void main(String[] args) {
        Bank bank = new Bank("FIRST BANK");
        Employee emp = new Employee("DAVID","$20000");
        System.out.println(emp.getEmployeeName()
        +" is an employee of "+bank.getBankName()+" and his salary is ");
    }}
    class Bank{
    private final String name;
    Bank(String name){
    this.name = name;
    }    
    public String getBankName(){
    return this.name;
    }
    }
    class Employee{
    private final String name; 
    private final String salary;
    Employee(String name,String salary){
    this.name = name;
    this.salary =salary;
    }
    public String getEmployeeName(){
    return this.name;
    }
    public String getSalary(){
    return this.salary;
    }
    }