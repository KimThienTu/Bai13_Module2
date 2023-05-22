import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LongesSubstringSort {
    public static void main(String[] args) {
        // Nhập chuỗi từ người dùng.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String input = scanner.nextLine();

        // Tách chuỗi thành các chuỗi con.
        String[] substrings = input.split(" ");

        // Sắp xếp các chuỗi con theo thứ tự có độ dài lớn nhất.
        Arrays.sort(substrings, Comparator.comparingInt(String::length).reversed());

        // Hiển thị chuỗi con có độ dài lớn nhất.
        if (substrings.length > 0){
            System.out.println("Chuỗi con dài nhất là: " + substrings[0]);
        } else {
            System.out.println("Không tìm thấy chuỗi con.");
        }
    }
}
