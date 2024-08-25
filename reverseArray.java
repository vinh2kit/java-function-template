   // Hàm để đảo ngược mảng
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            // Hoán đổi phần tử tại vị trí left và right
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Di chuyển chỉ số
            left++;
            right--;
        }
    }
    // ít tốn bộ hơn so với tạo mảng mới rồi chạy ngược add vào

    // js
    array.reverse();