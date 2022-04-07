public class Machine implements Info { 
    
    private int id = 7;
    
    public void start(){
        System.out.println("Machine Started");

    }
    @Override //@Override annotation is not required
    public void showInfo(){
        System.out.println("Hello there, I am just a machine.");
    }
}
