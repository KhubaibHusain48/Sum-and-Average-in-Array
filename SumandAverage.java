public class SumandAverage {
    public static void main(String[] args) {
        sum();
        average();
    }

    public static void sum() {
        int[] sumElements = { 2, 3, 4, 5 };
        int sum = 0;
        for (int i = 0; i < sumElements.length; i++) {
            sum += sumElements[i];
        }
        System.out.println("Sum of all elements present in given array is: " + sum);
    }

    public static void average() {
        int[] avgElements = { 12, 34, 56, 78 };
        double avg;
        int sum = 0;
        int i = 1;
        while (i < avgElements.length) {

            sum += avgElements[i];
            i++;
        }
        avg = (double) sum / avgElements.length;
        System.out.println("Average of given elements in array is: " + avg);
    }
}
