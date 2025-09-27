import java.util.*;
public class Arryapart2{
  // Print Syb arrya
  public static void PrintSubArrya(int nums[]){
    for(int i = 0; i<nums.length; i++){
      int start = i;
      for(int j = i+1; j<nums.length; j++){
        int end = j;
        for(int k = i; k<=end; k++){
          System.out.print(nums[k] + " ");
        }
        System.out.println();
      }
      System.out.println();
    }
  }
  // Pairs in Array
  public static void PrintArrya(int nums[]){
    for(int i = 0; i<nums.length;i++){
      int curr = nums[i];
      for(int j = i+1; j<nums.length; j++){
        System.out.print("(" + curr + "," + nums[j] + ")");
      }
      System.out.println();
    }

  }
  // print maxmim sum
  public static void maxmimsubArrya(int nums[]){
    int currsum = 0;
    int maxsum = Integer.MIN_VALUE;
    for(int i = 0; i<nums.length;i++){
      int start = i;
      for(int j = i+1; j<nums.length; j++){
        int end = j;
        for(int k = start; k<=end; k++){
          currsum += nums[k];
        }
        if(maxsum < currsum){
          maxsum = currsum;
        }

      }
      System.out.println();
    }
    System.out.println(maxsum);


  }

public static boolean DoubaleElement(int nums[]){

    for(int i = 0; i<nums.length; i++){
     for(int j = i + 1; j<nums.length; j++){
      if(nums[i] == nums[j]){
        return true;
      }
     }

    }
    return false;
  }
public static void PrintMaxSubArrysum(int nums[]){
  int currsum = 0;
  int MaxSum = Integer.MIN_VALUE;
  // System.out.print(" Max value is  = " + MaxSum);
  for(int i = 0; i<nums.length; i++){
    int curr = i;
    System.out.print(" cureent value is  " + curr);
    for(int j = i+1; j<nums.length;j++){
      int end = j;
      System.out.print( "and" + nums[j]);
      for(int k = curr; k<=end; k++){
        currsum += nums[k];
        System.out.print(nums[k] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }
  if(MaxSum < currsum){
    MaxSum = currsum;
  }
  System.out.print("Max sum is  : - " + MaxSum);
  System.out.print("Current sum = " + MaxSum);
}




  public static void main(String args[]){
    Scanner Sc = new Scanner(System.in);
    int nums[] = {2,4};
    // PrintSubArrya(nums);
    // System.out.println("-----------------------------------------");
    // PrintArrya(nums);
    // maxmimsubArrya(nums);
    // System.out.print(DoubaleElement(nums));
    // System.out.println(5&6);
    // System.out.println(9|8);
    PrintMaxSubArrysum(nums);
    


  }
}
