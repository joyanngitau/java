import java.util.*;

class Program{
    public static void main(String[] args){
        int age;
        String name;

        Scanner customer = new Scanner(System.in);
        System.out.println("Enter customer name and age:");

        try{
            name = customer.nextLine();
            age = customer.nextInt();
        } catch (InputMismatchException ex){
            System.out.println("Enter a number!");
            age = customer.nextInt();
        }

        Customer jane = new Customer();

        jane.setName(name);
        jane.setAge(age);

        String cusname = jane.getName();
        int cusage = jane.getAge();

        System.out.println("name: " +cusname);
        System.out.println(" age: " +cusage);
        
    }
}

class Customer{
    String cname;
    int cage;

    //constructor
    public Customer(){
        System.out.println("initialized");
    }

    public void setName(String name){
        cname = name;
    }

    public void setAge(int age){
        cage = age;
    }

    public String getName(){
        return this.cname;
    }

    public int getAge(){
        return cage;
    }
}
