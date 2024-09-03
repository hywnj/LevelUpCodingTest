public class JK {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }
        int[] result = new int[arr.length - 1];

        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[min] > arr[i]) {
                min = i;
            }
        }

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i != min) {
                result[index++] = arr[i];
            }
        }
        return result;
    }
}