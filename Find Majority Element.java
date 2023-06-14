import java.util.*;

public class MajorityElement {
    public static int findMajorityElement(int[] nums) {
        int count = 0;
        int majorityElement = 0;

        for (int num : nums) {
            if (count == 0) {
                majorityElement = num;
                count++;
            } else if (majorityElement == num) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int num : nums) {
            if (num == majorityElement) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return majorityElement;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        int majorityElement = findMajorityElement(nums);
        System.out.println("Majority Element: " + majorityElement);
    }
}

