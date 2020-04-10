package lession1;


import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        List<Integer> firstFiveNumbers = new ArrayList<>();
        firstFiveNumbers.add(2);
        firstFiveNumbers.add(3);
        firstFiveNumbers.add(5);
        firstFiveNumbers.add(7);
        firstFiveNumbers.add(11);

        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFiveNumbers);
        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);

        System.out.println(firstTenPrimeNumbers);
    }
}