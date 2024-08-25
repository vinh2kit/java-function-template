// tìm tần số xuất hiện nhiều nhần nhất
public static int findMode(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        int mode = arr[0];

        for (int num : arr) {
            int frequency = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, frequency);
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mode = num;
            }
        }

        return mode;
    }

 /*      js
    function findMode(arr) {
    const frequencyMap = {};
    let maxFrequency = 0;
    let mode = arr[0];

    for (const num of arr) {
        // Tăng đếm số lần xuất hiện của phần tử num
        frequencyMap[num] = (frequencyMap[num] || 0) + 1;

        // Cập nhật mode nếu tìm thấy tần suất lớn hơn
        if (frequencyMap[num] > maxFrequency) {
            maxFrequency = frequencyMap[num];
            mode = num;
        }
    }

    return mode;
}

*/