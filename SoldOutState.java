

public class SoldOutState implements State {
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertMoney(int cents) {
        System.out.println("You can't insert money, the machine is sold out");
    }
 
    public boolean eject() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
        return false;
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs");
    }
 
    public void dispense() {
        System.out.println("N   o gumball dispensed");
    }
    
    public void refill(int count){
        if (count > 0)
        {
            gumballMachine.setCount(count);
            System.out.println("Machine refilled. Now there are " + 
            gumballMachine.getCount() + " gumballs.");
            gumballMachine.setState(gumballMachine.getNotEnoughMoneyState());
        }
        else
             System.out.println("You didn't put any gumball in the machine. Refill failed.");
    }
 
    public String toString() {
        return "sold out";
    }
}
