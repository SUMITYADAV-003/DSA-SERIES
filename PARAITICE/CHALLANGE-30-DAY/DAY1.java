import java.util.*;
public class DAY1 {
  // PrintSubArrya
  public static void PrintSubArrya(int[] nums){
    for(int i = 0; i<nums.length; i++){
       int start = i;
      //  System.out.println(" i Element is : - " + i);
      for(int j = i; j<nums.length; j++){
        int end = j;
        //  System.out.println(" j Element is : - " + j);
        for(int k = start; k<=end; k++){
          System.out.print(nums[k] + " ");
        }
         System.out.println();
      }
      System.out.println();
    }
   
  }
  // PrintPairs
  public static void PrintPairs(int[] nums){
    for(int i = 0; i<nums.length; i++){
      int curr = nums[i];
      for(int j = i + 1; j<nums.length; j++){
        System.out.print("(" + curr + "," + nums[j] + ")");
      }
      System.out.println();
    }
  }
  // Find max sum sub Arrya 
  public static void FindMaxSubArryaSum(int[] nums){
    int maxSum = Integer.MIN_VALUE;
    for(int i = 0; i<nums.length; i++){
      int start = i;
      for(int j =  i +1; j<nums.length; j++){
        int end = j;
        int curr = 0;
        for(int k = start; k<=end; k++){
          curr += nums[k];
          // stem.out.print("nums[k] value is  " + nums[k] + "and sum is " + curr);
          System.out.print(nums[k]+" ");
        }
        System.out.println();
         if(maxSum <  curr){
          maxSum = curr;
        }

      }
       System.out.println();
    
      
    }
    System.out.println("Max Sum is = " + maxSum);
   
  }
  // Find  prefixsum
  public static void maxsubArryaSum(int [] nums){
    int currsum = 0;
    int maxsum = Integer.MIN_VALUE;
    int  prefixsum[] = new int[nums.length];
    prefixsum[0] = nums[0];
    for(int i = 1; i<prefixsum.length; i++){
      prefixsum[i] = prefixsum[i - 1] + nums[i];
      
    }
    for(int i = 0; i<nums.length; i++){
      int start = i;
      for(int j = i; j<nums.length; j++){
        int end = j;
        currsum = start == 0 ? prefixsum[end] : prefixsum[end] - prefixsum[start - 1];
        System.out.print("Prefix sum End is  " + prefixsum[end]);
        if(maxsum < currsum){
          maxsum = currsum;
        }
        
      }
      System.out.println("max sum is " + maxsum);
    }
  }

  // Using kadames algolethem
  public static void KadanAlg(int[] nums){
    int ms = Integer.MIN_VALUE;
    int cs = 0;
    for(int i = 0; i<nums.length; i++){
      cs = cs + nums[i];
      if(cs < 0){
        cs = 0;
      }
    }
    ms = Math.max(cs, ms);
    System.out.println("Max number of :" + ms);
  }
  // trapping rainwater

public static int TrappedRainWater(int[] height){
  int n = height.length;
  
  // calculate left max boundary - arrya
  int leftmax[] = new int[n];
  leftmax[0]= height[0];
  for(int i = 1; i<n; i++){
    leftmax[i] = Math.max(height[i], leftmax[i-1]);
  }
  // calculte right max boundary arry
  int rightMax[] = new int [n];
  rightMax[n-1] = height[n-1];
  for(int i = n-2; i>=0; i--){
    rightMax[i] = Math.max(height[i], rightMax[i + 1]);
  }
  // loop 
  int trappedwater = 0;
  for(int i = 0; i<n; i++){
    int waterlevel = Math.min(leftmax[i], rightMax[i]);
    trappedwater += waterlevel - height[i];

    
 }
  return trappedwater;
}
public static int[] reverseArray(int[] A) {
    int start = 0;
    int end = A.length - 1;
    int temp = 0;
    
    while(start < end) {  // Changed from >= to <
        temp = A[start];
        A[start] = A[end];
        A[end] = temp;
        
        start++;
        end--;
        // Removed the print statement from here
    }
    
    return A;  // Return the reversed array
}

    
  public static void main(String[] args){
  Scanner Sc = new Scanner(System.in);
  //  System.out.print("Enter your Fist number : -");
  //  int num = Sc.nextInt();
  //  System.out.println(num);
   int nums[] = {1,2,3};
  //  PrintSubArrya(nums);
  //  PrintPairs(nums);
  //  FindMaxSubArryaSum(nums);
  //  FindMaxSubArryaSum(nums);
  //  maxsubArryaSum(nums);
  //  KadanAlg(nums);

   int[] array = {1, 2, 3, 4, 5};
    
    System.out.println("Original array:");
    for(int num : array) {
        System.out.print(num + " ");
    }
    
    reverseArray(array);
    
    System.out.println("\nReversed array:");
    for(int num : array) {
        System.out.print(num + " ");
    }

   
  }
}
