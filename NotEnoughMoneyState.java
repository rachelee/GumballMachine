

public class NotEnoughMoneyState implements State {
    GumballMachine gumballMachine;
 
    public NotEnoughMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertMoney(int cents) {
        gumballMachine.setMoney(cents);
        if (gumballMachine.getMoney() >= 50)
            gumballMachine.setState(gumballMachine.getHasEnoughMoneyState());
    }
    
    public boolean eject() {
        return true;
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there's only " + gumballMachine.getMoney() + 
        " cents in the machine, not enough for a Gumball.");
     }
 
    public void dispense() {
        System.out.println("You need to insert 50 cents first");
    } 
 
    public String toString() {
        return "waiting for 50 cents";
    }
}