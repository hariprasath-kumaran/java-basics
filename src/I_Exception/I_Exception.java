package I_Exception;

public class I_Exception {
    public static void main(String[] args) {
        try {
            new test().add();

        }catch (Exception e){
            throw new RuntimeException(e);
        }


        try{
            int a=100/0;
            System.out.println(a);
        }catch (Exception e){
         if (e instanceof ArithmeticException ) {
             System.out.println("Error");
         }else {
             System.out.println(e);
         }
        }
    }
}
class  test{
    void add() throws  Exception{
        throw new Exception("custom exception");
    }
}