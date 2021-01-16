class Solution {
    public int findNumbers(int[] nums) {
        
        int count = 0;
        for (int i =0; i< nums.length; i++) {
        boolean div = false;
        int test = nums[i];
            while (test!= 0){
                if ((test%10)%2==0) {div=true;test =test/10;} //continue;}
                else{div=false;break;} 
               // test = test/10;
           } ;
        if (div) {count++;} ;
  } ;
      return count;
}
   } 