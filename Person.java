public class Person implements Info
{
    private String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public void greet(){
        System.out.println("Hello there");
    }
    @Override  //@Override annotation is not required
    public void showInfo(){
        System.out.println("Person name is: " + name);
        int e = 4; //Server no purpose just shows that you can add whatever you like to this.              
    }
 }
