import java.util.Arrays;

public class quickSort {
    // public static void printArray(int[] array) {
    //     for (int i = 0; i < array.length; i++) {
    //         System.out.print(array[i] + " ");
    //     }
    //     System.out.println(); // Xuống dòng sau khi in hết mảng
    // }
    public void swap(int arr[], int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
 
    // ham de chia mang thanh 2 phan, su dung phan tu chot (pivot)
    public int partition(int arr[], int left, int right) {
        int pivot = arr[right];
        int leftPointer = left ;
        int rightPointer = right-1;   // -1 để bỏ qua pivot
        while (true) {
            while (arr[leftPointer] < pivot) 
                leftPointer++;
            while (rightPointer > left && arr[rightPointer] > pivot) // rightPointer > left là để k trừ tiếp khi đã ở đầu mảng, trừ nữa thành -1 nó lỗi
                rightPointer--;
            if (leftPointer >= rightPointer) break;
            swap(arr, leftPointer, rightPointer);
                leftPointer++; // tránh TH = giá trị vs pivot bị đứng cứng ngắt
                rightPointer--; 
        }
 

        swap(arr, leftPointer, right);
        System.out.println(Arrays.toString(arr));
        System.out.println(leftPointer);
        return leftPointer;
    }
 
    // ham sap xep
    public void quickSort(int arr[], int left, int right) {
        if (right - left <= 0) { // ngừng đệ quy khi mảng còn 1 phần tử
            return;
        } else {
            int partitionPoint = partition(arr, left, right); // method để xếp
            quickSort(arr, left, partitionPoint - 1);  // nó sẽ gọi lại method partition trên để xếp mảng bên trái
            quickSort(arr, partitionPoint + 1, right);  
        }
    }
 
    
 
    public static void main(String[] args) {
        // khoi tao mang arr
        int arr[] = {1,3,4,5,1,1,1,1,1,1,1,1};
 
        quickSort sapXepNhanh = new quickSort();
        System.out.println("Mang du lieu dau vao: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("-----------------------------");
        sapXepNhanh.quickSort(arr, 0, arr.length - 1);
        System.out.println("-----------------------------");
        System.out.println("\nMang sau khi da sap xep: ");
        System.out.println(Arrays.toString(arr));
    }
}
