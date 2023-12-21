import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {10, 5, 20, 20, 5, 20, 10, 20, 10};
        System.out.println("Programa sağlanılan dizi: " + Arrays.toString(list));
        for (int i = 0; i < list.length; i++) {
            int repeatingNumber = 0;
            boolean isSame = false;
            for (int j = i - 1; j >= 0; j--) {
                if (list[i] == list[j]) {
                    isSame = true;
                    break;
                }
            }
            if (isSame) {
                continue;
            }
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    repeatingNumber++;
                }
            }
            if (repeatingNumber > 0) {
                System.out.println(list[i] + " sayısı seride " + (repeatingNumber + 1) + " kere tekrar edildi.");
            }
        }
    }
}