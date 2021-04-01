package io.talgat.easy;

public class RemoveElement {

    public static void main(String[] args) {
        RemoveElement r = new RemoveElement();
        int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};
        System.out.println(r.removeElement(nums, 3));
    }

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return nums.length;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
            }
        }

        return j;
    }
}
