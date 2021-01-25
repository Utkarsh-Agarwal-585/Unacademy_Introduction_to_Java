package Introduction_To_Java_10;

public class Subarray_Sum_equals_K {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, -2, 1 };
		//1, 2
		//1, 2, 3, -2
		//3
		int target = 3;

		int count = subarraySum(nums, target);

		System.out.println(count);
	}

	//Time Complexity: O(n^2)
	//Space Complexity: O(1)
	private static int subarraySum(int[] nums, int target) {

		int count = 0;

		for (int start = 0; start < nums.length; start++) {

			int sum = 0;

			for (int end = start; end < nums.length; end++) {
				sum += nums[end];
				
				if(sum == target) {
					count++;
				}
			}
		}
		return count;

	}


}
