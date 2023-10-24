package A__object;

public class A_object
{
    String fname="Hari";
    String country="india";
    int age=21;
    String state="Tamilnadu";

    public static void main(String[] args) {
        A_object object=new A_object();
        System.out.println(object);
        System.out.println(object.age);
        System.out.println(object.country);
        System.out.println(object.fname);
        System.out.println(object.state);


        A_object object1=new A_object();
        System.out.println(object1);
        System.out.println(object1.fname);
    }
}

