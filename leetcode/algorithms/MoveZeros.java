/*
 *
 */
public class MoveZeros {

    public void moveZeros(int[] nums) {
        int count = 0;
        int k = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 0)
                count++;
            else
                nums[k++] = nums[i];
        }
        for (int i = 0; i < count; ++i) {
            nums[nums.length - 1 - i] = 0;
        }
    }

    public void moveZeros(int[] nums) {
        int count = 0; // count of non-zeros.
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }
        for (int i = nums.length - 1; i >= count; --i) {
            nums[i] = 0;
        }
    }

}
