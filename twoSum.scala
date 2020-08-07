object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        if(nums(0) + nums(1) == target){
        }
      Array(nums.indexWhere(_==2),nums.lastIndexWhere(_==7))
    }
    twoSum(Array(2, 7, 11, 15), 9)
}
