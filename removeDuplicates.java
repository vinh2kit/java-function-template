public static int[] removeDuplicates(int[] arr) {
        // Tạo một HashSet để loại bỏ phần tử trùng lặp
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }
        
        // Chuyển HashSet trở lại thành mảng
        int[] uniqueArray = new int[uniqueSet.size()];
        int index = 0;
        for (int num : uniqueSet) {
            uniqueArray[index++] = num;
        }
        
        return uniqueArray;
    }


// js
 const uniqueSet = new Set(arr);