

public interface State {
 
	public void insertMoney(int cents);
	public boolean eject();
	public void turnCrank();
	public void dispense();
	public void refill(int count);
}
