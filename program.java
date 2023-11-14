import java.util.Scanner;

class Program{
    public static void main(String[] args){
        Scanner customer = new Scanner(System.in);
        System.out.println("Enter customer name and age:");

        String name = customer.nextLine();
        int age = customer.nextInt();
        
        System.out.println("Name: " + name);
    System.out.println("Age: " + age);

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
