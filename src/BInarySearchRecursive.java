import java.util.Arrays;
import java.util.Scanner;

public class BInarySearchRecursive {
    public static void main(String[] args) {
        // Bước 1: Khởi tạo một mảng bất kỳ với các giá trị nhập vào từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Bước 2: Sắp xếp lại mảng theo thứ tự từ bé đến lớn
        Arrays.sort(array);

        System.out.print("Nhập số cần tìm: ");
        int value = scanner.nextInt();

        // Bước 3: Gọi hàm tìm kiếm nhị phân
        int index = binarySearch(array, 0, n - 1, value);

        if (index == -1) {
            System.out.println("Không tìm thấy số trong mảng.");
        } else {
            System.out.println("Số " + value + " được tìm thấy tại vị trí " + index);
        }
    }

    // Bước 3: Hàm tìm kiếm nhị phân đệ quy
    public static int binarySearch(int[] array, int left, int right, int value) {
        if (right >= left) {
            // Bước 4: Tính giá trị trung bình của left và right
            int middle = left + (right - left) / 2;

            // Bước 5: So sánh giá trị tại vị trí middle với value
            if (array[middle] == value) {
                return middle;
            }

            // Bước 6: Nếu value lớn hơn giá trị tại vị trí middle, tìm kiếm phía bên phải của middle
            if (array[middle] < value) {
                return binarySearch(array, middle + 1, right, value);
            }

            // Bước 7: Nếu value nhỏ hơn giá trị tại vị trí middle, tìm kiếm phía bên trái của middle
            return binarySearch(array, left, middle - 1, value);
        }

        // Bước 8: Nếu left > right, không tìm thấy giá trị trong mảng
        return -1;
    }
}
