package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean primeNum = number > 1;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                primeNum = false;
                break;
            }
        }

        return primeNum;
    }
}
