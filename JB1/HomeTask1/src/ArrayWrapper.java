import java.util.Arrays;

public class ArrayWrapper {

    static int size = 0;
    static int[] arr = new int[10];


    public void add(int num) {
        if (size >= arr.length) {
            copyArray();
        }
        arr[size++] = num;
    }

    private void copyArray() {
        int[] tmp = new int[arr.length * 2];
        System.arraycopy(arr, 0, tmp, 0, arr.length);
        arr = tmp;
    }

    /**
     * Remove element on specific position.
     * <p>
     * Steps
     * 1) Create new array
     * 2) Copy all elements before deleted one in new array
     * 3) Copy all elements after deleted one in new array
     * 4) Resign `arr` reference to new array
     * 5) Result - new array without deleted element
     *
     * @param index - position of deleted element.
     * @throws ArrayIndexOutOfBoundsException - if index less then 0 and more than array length.
     */
    public void remove(int x) {
        int[] num = new int[10];
        System.arraycopy(arr, 0, num, 0, x);
        System.arraycopy(arr, 6, num, x, 4);
        arr = num;
    }


    /**
     * Remove element on specific position.
     * <p>
     * Steps
     * 1) Use implemented search method (find index)
     * 2) Use remove method above
     *
     * @param value - position of deleted element.
     * @return true if was deleted. false - if wasn't
     */
    public boolean removeValue(int value) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                remove(value);
                return true;
            }
        }
        System.out.println("IndexValue - " + value + "removed");
        return false;
    }


    public int[] sort() {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - (i + 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
                x++;
            }
        }
        return null;

    }


    public String toSting() {
        System.out.println("The string representation of array is:");
        System.out.println(Arrays.toString(arr));

        return null;
    }

    public int search(int value) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return value;
            }
        }

        return 0;
    }

    public int[] copy() {
        int[] x = new int[arr.length * 2];
        System.arraycopy(arr, 0, x, 0, arr.length);
        arr = x;


        return null;
    }

    public int[] revers() {
        return null;
    }

    public int min() {
        Arrays.sort(arr);

        int min = arr[0];
        System.out.println(min);
        int max = arr[arr.length - 1];
        System.out.println(min);

        return 0;
    }

    public int max() {
        Arrays.sort(arr);

        int min = arr[0];
        System.out.println(min);
        int max = arr[arr.length - 1];
        System.out.println(max);

        return 0;

    }

}






