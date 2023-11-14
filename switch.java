import java.util.Scanner;

class Switch{
    public static void main(String[] args){

        Scanner mynum = new Scanner(System.in);
        System.out.println("Enter your age:");

        int age = mynum.nextInt();
        System.out.println("" + age);

        int limit = 18;

        int ans = (age <= limit) ? 1 : -1;

        switch (ans){
            case 1:
                System.out.println("You can't vote");
                break;

            case -1:
                System.out.println("You can vote");
                break;
        }
    }
}