import java.util.Random;

public class ArrayExample {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("danh sach phan tu cua mang: ");
        for (int i = 0 ;i<100 ; i++){
            arr[i] = rd.nextInt(100);
            System.out.printf(arr[i]+" ");
        }
        return arr ;

    }
}
