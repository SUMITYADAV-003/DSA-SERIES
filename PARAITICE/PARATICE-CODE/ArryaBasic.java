import java.util.*;
public class ArryaBasic {
 
 // find largest number in my arrya 
  public static void FindLargest(int nums[]){
    int Largest = Integer.MIN_VALUE;
    for(int i = 0; i<nums.length; i++){
      if(nums[i] > Largest){
        Largest = nums[i];
      }
    }
    System.out.println("Largest Element is  : " + Largest);
  }

  // smallest number 
    public static void Smallest(int nums[]){
    int Smallest = Integer.MAX_VALUE;
    for(int i = 0; i<nums.length; i++){
      if(nums[i] < Smallest){
        Smallest = nums[i];
      }
    }
    System.out.println("Smallest  Element is  : " + Smallest);
  }



public static void ReveseArrya(int[] nums){
  int start = 0;
  int end = nums.length-1;
  while(start < end){
    int test = nums[start];
    nums[start] = nums[end];
    nums[end] = test;
    start ++;
    end --;
  }
  for(int i = 0; i<nums.length; i++){
    System.out.println(nums[i]);
  }
}




  // marges and shorted arrya 

  // Finding pairs that sum to a target
 public static void PrintPairSum(int [] nums, int target){
  boolean found = false;
  for(int i = 0; i<nums.length; i++){
    for(int j = i+1; j<nums.length; j++){
      if(nums[i] + nums[j] == target){
        System.out.println("Pair found: " + nums[i] + " + " + nums[j] + " = " + target );
        found = true;
      }
    }
  }
   if(!found) {
        System.out.println("No pair found for target: " + target);
    }

 }


 
  public static void main(String args[]){
    Scanner Sc = new Scanner(System.in);
    // System.out.print("Enter your Arrya size : - ");
    // int size = Sc.nextInt();
    // int nums[] = new int[size];
    // int nums1[] = {5,4,2,3,5};

    // System.out.println("Enter " + size + " number");
    // for(int i = 0; i<nums.length; i++){
    //   System.out.println("Enter number " + (i+1) + " :");
    //   nums[i] = Sc.nextInt();
    // }

    // for(int i = 0; i<nums.length; i++){
      
    //   System.out.print(nums[i] + " ");
    // }
    // FindLargest(nums);
    // Smallest(nums);
    int nums[] = {2, 7, 11, 15, 3, 6};
    // ReveseArrya(nums);
    PrintPairSum(nums, 11);
    
  }
  
}