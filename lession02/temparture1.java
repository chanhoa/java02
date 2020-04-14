package lession2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Handle {
    private int sum;
    private int temperature;
    private String temperaturestring;
    Scanner input = new Scanner(System.in);
    // Ham lay gia tri nhiet
    public int temperatures() {
        temperature = input.nextInt();
        return temperature;
    }
    public String temperaturestring() {
        temperaturestring = input.nextLine();
        return temperaturestring;
    }
    // Ham nhap gia  tri nhiet
    public int Input() {
        int a = input.nextInt();
        return a;
    }
    // Ham
    public float AVG(int a){
        sum = sum +a;
        return sum;
    }
    public void SC(int a, int b) {
        System.out.println("Element "+a+", type value was "+b);
    }

}

public class temparture1 {
    public static void main(String[] args) {
        Handle handle = new Handle();
        float sum = 0;
        int day;

        List<Integer> Temparture = new ArrayList<Integer>();

        System.out.println("Enter the number of days : ");

        day = handle.Input();
        System.out.println("Enter " +day+" integer value");

        for (int i = 0; i < day; i++) {
            Temparture.add(handle.temperatures());
        }

        for(int i = 0; i <day;i++) {
            handle.SC(i, Temparture.get(i));
        }

        for (int i = 0; i < day; i++) {
            sum = handle.AVG(Temparture.get(i));
        }
        System.out.println("Average is "+(float) sum/(day));

    }
}