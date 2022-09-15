import
public class Main {
    public static void main(String[] args) {
        int attempt =1;
        int guess  =0;
        int secret_number = (int) (math.random() * 99 +1);
        scanner sc = new scanner(system.in);
        System.out.println("Welcome to guess number game \n You will be asked  to guess a number to win the game \n You have 5 attempt limit");

        do{
            System.out.println("Enter a guess number between 1 to 100\n");
            if(sc.hasNextInt()){
                guess = sc.nextInt();
                if(guess == secret_number){
                    System.out.println("OOHOOO ! , Your Number is correct . You win the Game!");
                    break;
                } else if (guess < secret_number) {
                    System.out.println("your number is  smaller");
                } else if (guess > secret_number) {
                    System.out.println(" your number is  greater");
                }
                if(attempt==5){
                    System.out.println(" you have exceed the maximum attempt . TRY AGAIN");
                    break;
                }
                attempt++;
            }
            else{
                System.out.println("Enter a Valid Integer Number");
                break;
            }
        }while( guess != secret_number);


    }
}