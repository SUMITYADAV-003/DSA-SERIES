import java.util.*;
public class Arrya2{

  // Print pairs in arrya element
  public static void  PrintPaires(int num[]){
    int  n = num.length;
    int ts = 0;
    // System.out.print("n = " + n);
    for(int i = 0; i<n; i++){
      int curr = num[i];
      for(int j = i + 1 ; j<n; j++){
        System.out.print("(" + curr + "," + num[j] + ")");
        ts ++;
      }
      
      System.out.println();
    }
    System.out.println(ts);
    

  }

 public static float Shostepath(String path){
  int y = 0; int  x = 0;
  for(int i = 0; i<path.length(); i++ ){
    char dir = path.charAt(i);
    // south 
    if(dir == 'S'){      // ← Use 'S' not "S"
            y--;
    }
    else if(dir == 'N'){
      y++;
    }
    else if(dir == 'W'){
      x--;
    }else {
      x++;
    }

  }
  int X2 = x*x;
  int Y2 = y*y;
  return (float)Math.sqrt(X2 + Y2);

 }

 public static boolean isPallindrom(String str){
  
  for(int i = 0; i<str.length(); i++){
    int n = str.length();
    if(str.charAt(i) != str.charAt(n-1-i)){
      return false;
    }
  
  }
  return true;
 }

//  public static void LasgestString(String str[]){
//     String largest = str[0];
//     for(int i = 0; i<str.length; i++){
//       if(largest.compareTo(str[i]) < 0){
//         largest = str[i];
//       }
//     }
//     System.out.println(largest);

//  }

public String toUpperCase(String str) {    // dry run this code in your note book 
    if (str == null || str.isEmpty()) {
        return str;
    }
    
    StringBuilder sb = new StringBuilder();
    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    
    for (int i = 1; i < str.length(); i++) {
        if (str.charAt(i) == ' ' && i < str.length() - 1) {
            sb.append(str.charAt(i)); // append space
            i++;
            if (i < str.length()) { // additional safety check
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
        } else {
            sb.append(str.charAt(i));
        }
    }
    return sb.toString();
}

// majority Element 
public static int Majority(int nums[]){
  int ex = 0;
  for(int i = 0; i<nums.length; i++){
    for(int j=1 ; j<nums.length; j++){
      if(nums[i] == nums[j]){
         ex = nums[j];
      }
    }
  }
  System.out.print("majority" + ex);
  for(int i = 0; i<ex; i++){
    System.out.println(i);
  }
  return 0;
}

public static String Compression(String str){  // dry run this code also 
  String newStr = "";
  for(int i =0; i<str.length(); i++){
    Integer Count = 1;
    while(i < str.length()-1 &&  str.charAt(i) == str.charAt(i+1)){
      Count ++;
      i++;
    }
    newStr += str.charAt(i);
    if(Count > 1){
      newStr += Count.toString();
    }
  }
  return newStr;
}



       










  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
  //  System.out.println("Enter the Number when you want: - ");
  //  int n[] = {2,4,6,8,10}; 
  //  PrintPaires(n);
  //  System.out.print(isPalindrome(-121));
  // String path = "NNWWEEEEE";
  // System.out.println(Shostepath(path));
  // String str = "lool";
  // System.out.println(isPallindrom(str));
  // String str[] = {"Apple", "Banana", "Mango"};
  // LasgestString(str);


  // String str = "hii i am sumit am i am learing dsa";
  // Arrya2 obj = new Arrya2();
  // System.out.println(obj.toUpperCase("hello world"));
  // System.out.println(obj.toUpperCase(str));
  // String str = "aaabbbcccd";
  // System.out.println(Compression(str));

  int nums[] = {1,1,1,2,2,2,3};
  Majority(nums);
 
  

  }
}