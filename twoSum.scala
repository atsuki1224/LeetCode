//解答1
/*
object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        // helper function for finding answer
        // diff: Map for (value, idx)
        @scala.annotation.tailrec
        def acc(diff: Map[Int, Int], idx: Int): Array[Int] = {
            if(idx >= nums.length) Array()
            else {
                if(diff contains nums(idx)) Array(diff(nums(idx)), idx)
                else acc(diff + ((target - nums(idx)) -> idx), idx + 1)
            }
        }
        
        acc(Map(), 0)
    }
}
*/

//解答2
object Solution {
  def main(args: Array[String]) = {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
      def twoSum(index: Int, previous: Map[Int, Int]): Array[Int] = {
        previous.get(target - nums(index)) match {
          case Some(previousIndex) => Array(previousIndex, index)
          case None => twoSum(index + 1, previous ++ Map(nums(index) -> index))
        }
      }
      twoSum(0, Map.empty)
    }
  }
  println("hello")
}
