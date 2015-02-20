

public class GumballMachineTestDrive {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.insertDime();
        gumballMachine.turnCrank();
        
        System.out.println("Gumball in slot? " + gumballMachine.isGumballInSlot());
        gumballMachine.takeGumballFromSlot();
        System.out.println("Gumball in slot? " + gumballMachine.isGumballInSlot());
        System.out.println(gumballMachine);
    }
}
