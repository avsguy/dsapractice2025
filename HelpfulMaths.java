
package practice;

import java.util.Arrays;

public class HelpfulMaths {
public static void main (String[] args) {
    
String s1 = "3+2+1";
String s2 = "1+1+3+1+3";
String s3 = "2";

System.out.println(mathsOrder(s1));
System.out.println(mathsOrder(s2));
System.out.println(mathsOrder(s3));

}

public static String mathsOrder(String str) {
    
//separate the string into char array
char[] char1 = str.toCharArray();

// if the string is only 1 number end process and return the same string
if (char1.length == 1) return str;

// count the number of plus signs
int n = 0;
for (int i=0; i<char1.length; i++) {
    if (char1[i] == '+') n++;
}

// initialize an int array that has the size where + signs are removed
int[] int1 = new int[char1.length - n];

// skip the + signs and add the numbers to int array
int index = 0;
for (int i=0; i<char1.length; i++) {
    if (char1[i] != '+') int1[index++] = Integer.parseInt(String.valueOf(char1[i]));
}

// sort the numbers 
insertSort(int1);

//add the plus signs
String output = Integer.toString(int1[0]);
for (int i=1; i<int1.length; i++) {
output = output + "+" + Integer.toString(int1[i]);
}

return output;
}

public static void insertSort(int[] arr) {
        int i, j;
        int n = arr.length;
        int passCount = 0;
        for (i = 1; i < n; ++i) {
            int key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                passCount++;
            }
            arr[j + 1] = key;
            
        }
    }
}
