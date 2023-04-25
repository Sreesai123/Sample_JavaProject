package qedge_feb24;

public class While_Loop_Prime_Numbers {

	public static void main(String[] args) {
int i = 0, num = 0;
        
        String primeNumbers = "";

        for (i = 0; i <= 30; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers between 0 and 30 using while loop are:");
        System.out.println(primeNumbers);
    }
}