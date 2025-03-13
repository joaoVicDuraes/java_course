package entities;

public class Cliente {

    private int number;
    private String name;
    private double initialDeposit;

    public Cliente(int number, String name, double initialDeposit) {
        this.number = number;
        this.name = name;
        this.initialDeposit = initialDeposit;
    }

    public Cliente(int number, String name) {
        this.number = number;
        this.name = name;
        this.initialDeposit = 0;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    @Override
    public String toString() {
        return "Cliente [number=" + number + ", name=" + name + ", initialDeposit=" + initialDeposit + "]";
    }

    public void deposit(double value){
        this.initialDeposit += value;
    }

    public void withdraw(double value){
        this.initialDeposit -= value - 5;
    }
    
    

    

    


}
