import java.util.*;
public class StringMethodsExample{
   public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "hello world";
        String str3 = "  Java Programming  ";
        String str4 = "apple";
        String str5 = "banana";
        
        System.out.println("=== 1. equals() and equalsIgnoreCase() ===");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // false
        System.out.println("str1.equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2)); // true
        
        System.out.println("\n=== 2. compareTo() and compareToIgnoreCase() ===");
        System.out.println("str4.compareTo(str5): " + str4.compareTo(str5)); // negative (apple < banana)
        System.out.println("str5.compareTo(str4): " + str5.compareTo(str4)); // positive (banana > apple)
        System.out.println("str1.compareTo(str1): " + str1.compareTo(str1)); // 0 (equal)
        System.out.println("str1.compareToIgnoreCase(str2): " + str1.compareToIgnoreCase(str2)); // 0
        
        System.out.println("\n=== 3. length() ===");
        System.out.println("str1.length(): " + str1.length()); // 11
        
        System.out.println("\n=== 4. charAt() ===");
        System.out.println("str1.charAt(0): " + str1.charAt(0)); // 'H'
        System.out.println("str1.charAt(6): " + str1.charAt(6)); // 'W'
        
        System.out.println("\n=== 5. substring() ===");
        System.out.println("str1.substring(6): " + str1.substring(6)); // "World"
        System.out.println("str1.substring(0, 5): " + str1.substring(0, 5)); // "Hello"
        
        System.out.println("\n=== 6. indexOf() and lastIndexOf() ===");
        System.out.println("str1.indexOf('o'): " + str1.indexOf('o')); // 4 (first occurrence)
        System.out.println("str1.lastIndexOf('o'): " + str1.lastIndexOf('o')); // 7 (last occurrence)
        System.out.println("str1.indexOf(\"World\"): " + str1.indexOf("World")); // 6
        
        System.out.println("\n=== 7. contains() ===");
        System.out.println("str1.contains(\"World\"): " + str1.contains("World")); // true
        System.out.println("str1.contains(\"world\"): " + str1.contains("world")); // false (case-sensitive)
        
        System.out.println("\n=== 8. startsWith() and endsWith() ===");
        System.out.println("str1.startsWith(\"Hello\"): " + str1.startsWith("Hello")); // true
        System.out.println("str1.endsWith(\"World\"): " + str1.endsWith("World")); // true
        
        System.out.println("\n=== 9. toUpperCase() and toLowerCase() ===");
        System.out.println("str1.toUpperCase(): " + str1.toUpperCase()); // "HELLO WORLD"
        System.out.println("str1.toLowerCase(): " + str1.toLowerCase()); // "hello world"
        
        System.out.println("\n=== 10. trim() ===");
        System.out.println("Before trim: '" + str3 + "'"); // "  Java Programming  "
        System.out.println("After trim: '" + str3.trim() + "'"); // "Java Programming"
        
        System.out.println("\n=== 11. replace() and replaceAll() ===");
        System.out.println("str1.replace('o', 'x'): " + str1.replace('o', 'x')); // "Hellx Wxrld"
        System.out.println("str1.replaceAll(\"[aeiou]\", \"*\"): " + str1.replaceAll("[aeiou]", "*")); // "H*ll* W*rld"
        
        System.out.println("\n=== 12. split() ===");
        String[] words = str1.split(" ");
        System.out.print("str1.split(\" \"): ");
        for (String word : words) {
            System.out.print("[" + word + "] ");
        }
        System.out.println();
        
        System.out.println("\n=== 13. isEmpty() and isBlank() ===");
        String empty = "";
        String blank = "   ";
        System.out.println("empty.isEmpty(): " + empty.isEmpty()); // true
        System.out.println("blank.isEmpty(): " + blank.isEmpty()); // false
        System.out.println("blank.isBlank(): " + blank.isBlank()); // true (Java 11+)
        
        System.out.println("\n=== 14. valueOf() - Converting other types to String ===");
        int number = 123;
        boolean flag = true;
        System.out.println("String.valueOf(number): " + String.valueOf(number)); // "123"
        System.out.println("String.valueOf(flag): " + String.valueOf(flag)); // "true"
        
        System.out.println("\n=== 15. concat() ===");
        String hello = "Hello";
        String world = "World";
        System.out.println("hello.concat(\" \").concat(world): " + hello.concat(" ").concat(world)); // "Hello World"
        
        // Practical examples
        System.out.println("\n=== PRACTICAL EXAMPLES ===");
        
        // Example 1: User input validation
        String userInput = "  Admin  ";
        if (userInput.trim().equalsIgnoreCase("admin")) {
            System.out.println("Access granted!");
        }
        
        // Example 2: Email validation (basic)
        String email = "user@example.com";
        if (email.contains("@") && email.indexOf("@") > 0 && email.lastIndexOf("@") == email.indexOf("@")) {
            System.out.println("Email format looks valid");
        }
        
        // Example 3: File extension check
        String filename = "document.pdf";
        if (filename.toLowerCase().endsWith(".pdf")) {
            System.out.println("This is a PDF file");
        }
        
        // Example 4: String comparison for sorting
        String[] names = {"Charlie", "Alice", "Bob"};
        System.out.println("Sorting comparison:");
        for (int i = 0; i < names.length - 1; i++) {
            int comparison = names[i].compareTo(names[i + 1]);
            if (comparison < 0) {
                System.out.println(names[i] + " comes before " + names[i + 1]);
            } else if (comparison > 0) {
                System.out.println(names[i] + " comes after " + names[i + 1]);
            } else {
                System.out.println(names[i] + " is equal to " + names[i + 1]);
            }
        }
    }

}

   
