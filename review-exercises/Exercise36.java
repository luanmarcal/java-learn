// Exercício 36
// Ordene um array em ordem ascendente.

// import java.util.Arrays;

public class Exercise36 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 82, 5, 6, 7, 8, 9};

        System.out.println("\nOrdem original:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        // poderia ser feito assim:
        // Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            for (int j = i+1; j < nums.length; j++) {

                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }

        }

        System.out.println("\n\nOrdem ascendente:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("\n");
    }
}
