import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

       // System.out.println(reverseNumber(9865231));
       // System.out.println(calcAvg(0, 60, 70, 80));
      //  printDividedBySix(1, 100);
      //  System.out.println(calcPower(5, 5));
      //  printMultiTableWhile();
       // printAn(3, 2, 5);
      //  printSn(3, 2, 5);
      //  System.out.println(isPalindrome(3553));
     //   printFactorial(6);


    }

    public static boolean sumEqualsToSecondNumber(int num1, int num2) {
        int sum = 0;
        while (num1 > 0) {
            sum += num1 % 10;
            num1 /= 10;
        }
        return sum == num2;
    }

    public static String longestSeq(String[] names, int num) {

        int maxLength = 0;
        String maxSeq = "";
        String seq = "";

        for (int i = 0; i < names.length - num + 1; i++) {
            for (int j = 0, k = i; j < num; j++, k++) {
                seq += names[k];
            }
            if (seq.length() > maxLength) {
                maxLength = seq.length();
                maxSeq = seq;
            }
            seq = "";
        }

        return maxSeq;
    }

    public static void peak(int[] array) {

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                System.out.println("peak = " + array[i] + " index = " + i);
            }
        }

    }

    public static boolean isPrime(int num) {
        if(num == 0 || num == 1 || num == 2) {
            return true;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeNumbers(int endNumber) {
        for (int i = 1; i <= endNumber; i++) {
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static int reverseNumber(int num) {
        int reverse = 0;
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        return reverse;
    }

    public static double calcAvg(double score1, double score2, double score3, double score4) {
        int amountOfScores = 4;
        if(score1 < 1 || score1 > 100) {
            score1 = 0;
            amountOfScores --;
        }
        if(score2 < 1 || score2 > 100) {
            score2 = 0;
            amountOfScores --;
        }
        if(score3 < 1 || score3 > 100) {
            score3 = 0;
            amountOfScores --;
        }
        if(score4 < 1 || score4 > 100) {
            score4 = 0;
            amountOfScores --;
        }

        return (score1 + score2 + score3 + score4) / amountOfScores;
    }


    public static void printDividedBySix(int start, int end) {
        for(int i = start; i <= end; i++) {
            if(i % 6 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static int calcPower(int base, int pow ) {
        int mul = 1;
        for(int i = 0; i < pow; i++) {
            mul *= base;
        }
        return mul;
    }

    public static void printMultiTableFor() {
        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

    public static void printMultiTableWhile() {
        int i = 1;
        int j = 1;

        while(i <= 10) {
            while (j <= 10) {
                System.out.print(i * j + " ");
                j++;
            }
            System.out.println();
            j = 0;
            i++;
        }

    }

    public static void printAn(int a1, int d, int n) {
        int an = a1 + d * (n - 1);
        System.out.println(an);
    }

    public static void printSn(int a1, int d, int n) {
        int sn = (n * (2*a1 + (n - 1) * d)) / 2;
        System.out.println(sn);
    }

    public static boolean isPalindrome(int num) {
        return num == reverseNumber(num);
    }

    public static void printFactorial(int num) {
        int fact = 1;
        for(int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println(fact);
    }


}




