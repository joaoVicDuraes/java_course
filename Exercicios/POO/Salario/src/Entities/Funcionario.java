package Entities;

public class Funcionario {
    public String name;
    public double grossSalary;
    public double tax;


    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percetage){
        grossSalary = netSalary() + (grossSalary * percetage / 100);
    }

    @Override
    public String toString() {
        return "Emplooye: " + name + ", $" + grossSalary;
    }
}
