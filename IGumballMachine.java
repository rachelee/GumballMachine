
/**
 * Write a description of interface IGumballMachine here.
 * 
 * @Xiaoxiao Li 
 * @2/20/2015
 */
public interface IGumballMachine
{
    /**
     * An example of a method header - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the result produced by sampleMethod 
     */
     
    void insertQuarter( );    
    void insertDime( );
    void insertNickel( );  
    void turnCrank( );
    boolean isGumballInSlot( ); 
    void takeGumballFromSlot( );
}
