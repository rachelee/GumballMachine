

public class GumballMachine implements IGumballMachine {
 
    State soldOutState;
    State notEnoughMoneyState;
    State hasEnoughMoneyState;
    State soldState;
 
    State state = soldOutState;
    int count = 0;
    int money = 0;
 
    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        notEnoughMoneyState = new NotEnoughMoneyState(this);
        hasEnoughMoneyState = new HasEnoughMoneyState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = notEnoughMoneyState;
        } 
        else
        {
            state = soldOutState; // added by xiaoxiao li
        }
    }
 
    public void insertQuarter(){
       state.insertMoney(25);
    }
    
    
     public void insertDime() {
       state.insertMoney(10);
    }
    
     public void insertNickel() {
       state.insertMoney(1);
    }
    
    public boolean isGumballInSlot( ){
        return false;
    }
    
    public void takeGumballFromSlot( ){
    }
    
    public void eject() {
        if(state.eject())
        {
            System.out.println(money + " cents returned!");
            money = 0;
        }
    }
    
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }
 
    void deductMoney()
    {
        money = money - 50;
    }
    
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot..." + money + " cents returned!");
        if (count != 0) {
            count = count - 1;
        }
        money = 0;
        
    }
    
    void setMoney(int cents){
        money = money + cents;
    }
    
    int getMoney(){
        return money;
    }
    
    int getCount() {
        return count;
    }
 
    void refill(int count) {
        this.count = count;
        state = notEnoughMoneyState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNotEnoughMoneyState() {
        return notEnoughMoneyState;
    }

    public State getHasEnoughMoneyState() {
        return hasEnoughMoneyState;
    }

    public State getSoldState() {
        return soldState;
    }
 
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}