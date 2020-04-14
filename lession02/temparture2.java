package lession2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class temparture2 {
    public  static List<Integer> intArray(int size) {
        List<Integer> Temparture = new ArrayList<Integer>();

        Handle handle = new Handle();

        for(int i =0; i <size;i++) {
            Temparture.add(handle.temperatures());
        }
        for(int i = 0; i <size;i++) {
            System.out.println("Element "+i+", type value was "+Temparture.get(i));
        }
        return Temparture;
    }
    public static float getAverage(List<Integer> afterTemparture,int day) {
        int sum = 0;
        for(int i =0; i< day;i++) {
            sum = sum+afterTemparture.get(i);
        }
        return (float) sum/day;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Khoi tao cac bien
        int day;
        float avg;
        List<Integer> afterTemparture =new ArrayList<Integer>();

        System.out.println("Enter the number of days: ");
        day = input.nextInt();

        afterTemparture = intArray(day);
        avg = getAverage(afterTemparture, day);

        System.out.println("Average is "+avg);


    }
}