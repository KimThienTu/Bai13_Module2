import java.util.Arrays;
import java.util.Scanner;

public class SortSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();

        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        String sortedString = new String(chars);
        System.out.println("Chuỗi kí tự con được sắp xếp theo thứ tự từ bé đến lớn là: " + sortedString);
    }
}
