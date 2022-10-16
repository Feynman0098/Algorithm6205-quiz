public class RotateArray {

    public static int[] getRotatedArray (int[] arr, int k) {
        int[] newArr = new int[arr.length];
        k = k % arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (i+k < arr.length)
                newArr[i+k] = arr[i];
            else
                newArr[i+k-arr.length] = arr[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,4,5,6,7};
        int k = 2;
        for(int i : getRotatedArray(input, k)) {
            System.out.println(i);
        }
    }
}
