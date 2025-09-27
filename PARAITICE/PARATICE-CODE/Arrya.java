import java.util.*;
public class Arrya{
  // Reverse the Arrya
  public static void Reverse(int num[]){
    int start = 0; int end = num.length-1;
    System.out.print("Start number is  " + start + "  and end number is    " +  end);
    while(start <  end){
      int temp = num[end];
      num[end] = num[start];
      num[start] = temp;
      
      start ++;
      end --;
    }
    System.out.println("Revese the arrya ");

    for(int i = 0; i<num.length; i++){
      System.out.println(num[i]);
    }

  }

  public static int SearchElement(int num[], int key){
    for(int i = 0; i<num.length; i++){
      if(num[i] == key){
        System.out.print("Key Found " + num[i] + " and index is  " + i);
      } 
    }
    return 0;


  }
  
  public static void PrintSubArrya(int number[]){
    for(int i = 0; i<number.length; i++){
      int start = i;
      for(int j = i+1; j<number.length; j++){
        int end = j;
        for(int k = start; k<=end; k++){
          System.out.print(number[k] + " ");
        }
        System.out.println();
      }
      System.out.println();
    }
  }

  public static void PrintPairs(int num[]){
    for(int i = 0; i<=num.length; i++){
      int curr = num[i];
      System.out.print( num[i] + "  Number[i]");
      for(int j=i+1; j<num.length; j++){
        System.out.print("(" + curr + " ," + num[j] + ")");
      }
      System.out.println();
    }
  }
  public static void  MaxSubArrya(int num[]){
    int currsum = 0;
    int maxSum = Integer.MIN_VALUE;
    System.out.print(maxSum);

    for(int i =  0; i<num.length; i++){
      int start = i;
      for(int j = i+1; j<num.length; j++){
         int end = j; int currSum = 0;
        for(int k = start; k<=end; k++){
          // System.out.print(num[k] + " ");
          currSum += num[k];
        }
        System.out.println(currSum);
        if(maxSum < currSum){
          maxSum = currSum;
        }
      
      }
      
    }
    System.out.println("max sum = " + maxSum);
  }

  public static void main(String args[]){
    Scanner Sc = new Scanner(System.in);
    int num[] = {2,4,6,8,10};
    // Reverse(num);
    // SearchElement(num, 6);
    // PrintSubArrya(num);
    // PrintPairs(num);
    MaxSubArrya(num);

  }
}