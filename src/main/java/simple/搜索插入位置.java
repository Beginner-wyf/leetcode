package simple;

/**
 * @author wangyifan
 * @create 2021/3/10 14:25
 */
public class 搜索插入位置 {
    /**
     *给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。可以假设数组中无重复元素。
     *
     * 示例 1:
     * 输入: [1,3,5,6], 5
     * 输出: 2
     *
     * 示例 2:
     * 输入: [1,3,5,6], 2
     * 输出: 1
     *
     * 示例 4:
     * 输入: [1,3,5,6], 0
     * 输出: 0
     */
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums,0));
    }

    public static int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]){
                return i;
            }
        }
        return nums.length;
    }

}
