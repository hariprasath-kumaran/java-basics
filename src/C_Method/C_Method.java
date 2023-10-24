package C_Method;

public class C_Method {

    static int sum(){
        return 28+82;
    }

    public static void main(String[] args) {
        C_Class cClass=new C_Class();
        cClass.run();
        System.out.println( cClass.run("Methodoverloading"));
       int sum=C_Method.sum();
        System.out.println("the sum is " +sum);
    }
}
