import java.util.Random;
import java.util.Scanner;

public class try_cat {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner sc = new Scanner(System.in);
        System.out.println("\n Vui long nhap chi so cua mot phan tu so bat ki: ");
        int x = sc.nextInt();
        try {
            System.out.println("gia tri cua phan tu co chi so " + x + " la " + arr[x]);
        }
        catch (IndexOutOfBoundsException e){
            System.err.println("chi so vuot qua gioi han cua mang");
        }

    }
}

