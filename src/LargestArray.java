public class LargestArray {
    static int largest = Integer.MIN_VALUE;
    public static int findLargest(int[] list, int currentIndex) {
        if(currentIndex == list.length) return largest;
        if(list[currentIndex] > largest) largest = list[currentIndex];
        return findLargest(list, currentIndex+1);
    }
    public static int max(int a, int b) {
        if(a > b) return a;
        else return b;
    }

    public static void main(String[] args) {
        System.out.println(findLargest(new int[] {1,2,3,4,5,3,2,4},0));
    }
}
