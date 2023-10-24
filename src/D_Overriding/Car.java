package D_Overriding;
public class Car extends Vehicle{
    private int wheels=5;
//    void color(){
//        System.out.println("Child - orange");
//    }
//    void wheels(){
//        System.out.println("there are wheels "+wheels);
//    }
    public void stop(){
        System.out.println("there are wheels "+wheels);
    }
    void drive(){
        System.out.println("there are wheels "+wheels);
    }
}
