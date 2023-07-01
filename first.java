import java.util.Scanner;

public class first {
    public static void main(String[] args) {
       int rollno;
       String name;
       static String college = "ITS";

       
    }

    public static void main9(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };

        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 = sum1 + arr[i];
        }
        System.out.println("Sum1: " + sum1);

        int sum2 = 0;
        for (int i = 1; i <= 10; i++) {
            sum2 = sum2 + i;
        }
        System.out.println("sum2: " + sum2);

        System.out.println("Missing number is : " + (sum2 - sum1));

    }

    public static void main8(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int rev = 0;

        int org_num = num;

        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        if (org_num == rev) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }

    }

    public static void main7(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int count = 0;

        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }

            }
            if (count == 2) {
                System.out.println("prime number");
            } else {
                System.out.println("Not a prime number");
            }

        } else {
            System.out.println("Not a prime number");
        }

    }

    public static void main6(String[] args) {
        int arr[] = { 12, 24, 36, 48, 60, 72 };
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int rev = 0;

        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Reverse number is: " + rev);
    }

    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements in an array");
        Scanner sc1 = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc1.nextInt();
        }

        System.out.println("The sum of an array");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(" The sum is: " + sum);
    }

    public static void main3(String[] args) {
        // Sum of Digits
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int sum = 0;

        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("Sum of the digits: " + sum);
    }

    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        System.out.println("Before swapping : " + a + " " + b);

        // Logic 1 using third variable
        // int temp;
        // temp = a;
        // a = b;
        // b = temp;

        // Logic 2: use (+ and -) operator without using third variable
        // a = a + b;
        // b = a - b;
        // a = a - b;

        // Logic 3: use (* and /) without using third operator
        // a = a * b;
        // b = a / b;
        // a = a / b;

        // Logic 4 use XOR(^)
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping: " + a + " " + b);

    }

    public static void main1(String[] args) {
        String original = "Hello, Ram";
        String reversed = reversedString(original);
        System.out.println("Original string: " + original);
        System.out.println("Reversed string:" + reversed);
    }

    private static String reversedString(String s) {

        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }

}