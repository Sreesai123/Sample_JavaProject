package qedge_feb24;

public class Using_Do_While_Loop_PrimeNum {

	public static void main(String[] args) {
		int i = 0, num = 0;

        String primeNumbers = "";

        do {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
            i++;
        } while (i <= 30);

        System.out.println("Prime numbers between 0 and 30 using do-while loop are:");
        System.out.println(primeNumbers);
    }
}
