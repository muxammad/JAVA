 package Models;

public class Constructor {


    final int must = 23;

    final int mux;{
        mux = 20;
    }


    String name;
    int age;
    String email;
    String phoneNumber;

   public static int i;{
        i = 5;
    }

    final byte b;{
        b = 10;
    }

    public Constructor(){

    }
    public Constructor(String name, int age, String email, String phoneNumber){

        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

   


    public void getValues(){
        System.out.println("Name: " + name + " Age: " + age + " Email: " + email + " PhoneNumber: " + phoneNumber);
    }


}