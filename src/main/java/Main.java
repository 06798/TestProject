import java.util.Scanner;
    class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("How old are you");
            int age = input.nextInt();
            if (age < 13){
                System.out.println("You are younger than a teenager");
            }else if (age > 19){
                System.out.println("You are older than a teenager.Sorry!");
            }else {
                System.out.println("You are a teenager. lucky you!");
            }
        }
    }
