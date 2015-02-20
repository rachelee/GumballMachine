

import java.util.Random;

public class HasEnoughMoneyState implements State {
    GumballMachine gumballMachine;
 
    public HasEnoughMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
  
    public void insertMoney(int cents) {
        System.out.println("You can't insert money since the machine has enough money.");
    }
    
    public boolean eject() {
        gumballMachine.setState(gumballMachine.getNotEnoughMoneyState());
        return true;
    }
 
    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.deductMoney();
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
    public String toString() {
        return "waiting for turn of crank";
    }
    
    public void refill(int count){
        System.out.println("Gumball machine still has gumballs, no needs to refill");
    }
}
