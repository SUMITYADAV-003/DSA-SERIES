import java.util.*;
public class DAY{
  // public static boolean Isprime(int n){
  //   boolean Isprime = true;
  //   if(n == 0 && n == 1){
  //     System.out.print("PLease enter grater number  :");
  //   }
  //   for(int i = 2; i<=n; i++){
  //     if(n%2==0){
  //       Isprime = false;
  //     }
  //   }
  //   return Isprime;
  // }

  public static boolean Isprime(int n){
    for(int i = 2; i<=Math.sqrt(n); i++){
      if(n % 2 == 0){
        return false;
      }
    }
    return true;
  }

public static void BinToDec(int binnery){
  int pow = 0;
  int decNum = 0;
  int mynum = binnery;
  while(binnery > 0){
    int lastDigit = binnery % 10;
    decNum = decNum + (lastDigit*(int)Math.pow(2,pow));
    pow++;
    binnery = binnery / 10;
  }
  System.out.println("Decimal of " + mynum + " = "+ decNum);
}

public static void PrintParmiter(int n){
  for(int i = 1; i<=n; i++){
    for(int j=i; j<=n-1; j++){
      System.out.print(" ");

    }
    for(int j=1; j<=i;j++){
      System.out.print("*");
    }
       System.out.println();
  }
 

}

public static void Table(int n){
  int multi = 1;
  for(int i = 1; i<=10; i++){
    multi = n * i;
    System.out.println( n + " * " + i + " = " + multi);
  }
}

public static void Pattern1(int n){
  for(int i = 1; i<=n; i++){
    for(int j = 1; j<=i; j++){
      if((i+j) % 2 == 0){
        System.out.print("1");
      } else {
        System.out.print("0");
      }
    }
    System.out.println();
  }
} 

public static void Pallindrom(int n){
  int pallindrom = n;
  int rev =  0;

  while(pallindrom != 0){
    int reminder  = pallindrom % 10;
    rev = rev  * 10 + reminder;
    pallindrom = pallindrom / 10;
  }
  if(rev == n){
    System.out.print("Your number is  Pallindrom : " + n );
  } else {
    System.out.print("Your number is  Pallindrom : " + n );


  }
}

public static void Patter2(int n){
    for(int i = 0; i<n; i++){
      for(int j=i; j<n-1; j++){
        System.out.print(" ");
      }
      for(int j = 1; j<=i; j++ ){
        System.out.print("*");
      }
      System.out.println();
    }
}

// public static void Patter3(int row, int col){
//   for(int i = 1; i<=row; i++){
//     for(int j = 1; j<=col; j++){
//       if(i == 1 || i == row || j == 1 ||  j ==col){
//         System.out.print("*");
//       }else {
//         System.out.print(" ");
//       }
//     }
//     System.out.println();
//   }
// }

 public static void Patter3(int row){
  for(int i = 1; i<row; i++){
    for(int j = 1; j<row-i; j++){
      System.out.print(" ");
    }
     for(int j = 1; j<row; j++){
      System.out.print("*");
    }
    System.out.println();
  }
}

// i  am creting Hollow Roumbus
public static void HollowRomBus(int n){
  for(int i = 1; i<=n; i++){
    for(int j = 1; j<=n-i; j++){
      System.out.print(" ");
    }
    for(int j = 1; j<=n; j++){
     if(i == 1 || i == n || j == 1 || j==n){
      System.out.print("*");
     } else {
          System.out.print(" ");
     }
    }
    System.out.println();
  }
}

// Print Diamond pattern
public static void Diamond(int n){
  for(int i = 1; i<=n; i++){
    for(int j = 1; j<=(n-i); j++){
      System.out.print(" ");
    }
    for(int j = 1; j<=(2*i) -1; j++){
      System.out.print("*");
    }
    System.out.println();
  }
}

// print number haif parmit
public static void HaifNumberPar(int row){
  for(int i = row; i>=1; i--){
    for(int j = 1; j<=i; j++){
      System.out.print(j + " ");
    }
    System.out.println();
  }
}

public static void  Butterfly_pattern(int n){
  for(int i = 1; i<=n; i++){
    for(int j = 1; j<=i; j++){
      System.out.print("*");
    }
    for(int j = 1; j<=2*(n-i); j++ ){
      System.out.print(" ");
    }

    // i can go to print right hafe  usig this code 
    for(int j = 1; j<=i; j++){
      System.out.print("*");

    }
    System.out.println();
  }
  // second hafe
  for(int i = n; i>=1; i--){
    for(int j = 1; j<=i; j++){
      System.out.print("*");
    }
    for(int j = 1; j<=2*(n-i); j++ ){
      System.out.print(" ");
    }

    // i can go to print right hafe  usig this code 
    for(int j = 1; j<=i; j++){
      System.out.print("*");

    }
    System.out.println();

  }
}

// public static void Patter21(int n){
//   for(int i = 1; i<=n; i++){
//     for(int j =1; j<=(n-i); j++){
//       System.out.print(' ');
//     }
//     for(int j = 1; j<=i; j++){
//       System.out.print("*");
//     }
//     System.out.println();
//   } 
// }






  public static void main(String[] args){
    Scanner Sc = new Scanner(System.in);
    // System.out.print( Isprime(11));
    //  System.out.print( CeckPrime(11));
    System.out.print("Enter your row  number : ");
    int row = Sc.nextInt();   
    // System.out.print("Enter your col  number : ");
    // int col = Sc.nextInt();   
    // BinToDec(n);
    // PrintParmiter(n);
    // Table(n);
    // Pattern1(n);
    // Pallindrom(n);
    // Patter3(row);
    // HollowRomBus(row);
    //HaifNumberPar(row);
    // Butterfly_pattern(row);
    // Patter21(row);
    // Diamond(row);
    
   
    

  }
}