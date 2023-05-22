import java.util.Scanner;

public class OpTH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi: ");
        String inputString = scanner.nextLine();

        int[] frequentChar =  new int[256];
        for (int i = 0; i < inputString.length(); i++) {
            int ascii = (int) inputString.charAt(i);
            if (ascii >= 0 && ascii < 256) {
                frequentChar[ascii] += 1;
            }
        }

        int max = 0;
        char character = (char) 255;
        for (int j = 0; j < 256; j++){
            if (frequentChar[j] > max){
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println("Chữ cái xuất hiện nhiều nhất là: " + character + " với tần suất " + max + " lần ");
    }
}
