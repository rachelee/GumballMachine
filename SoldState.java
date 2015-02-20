

public class SoldState implements State {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
	public void insertMoney(int cents) {
		System.out.println("Please wait, we're already giving you a gumball");
	}
 
	public boolean eject() {
		System.out.println("Sorry, you already turned the crank");
		return false;
	}
 
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
	}
 
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNotEnoughMoneyState());
		} else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
 
	public String toString() {
		return "dispensing a gumball";
	}
	
	public void refill(int count){
        System.out.println("Gumball machine still has gumballs, no needs to refill");
    }
}


