import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
       int i2;
        double d2;
        String s2;
        i2 = Integer.parseInt(scan.nextLine());
        d2 = Double.parseDouble(scan.nextLine());
        s2 = scan.nextLine();
        System.out.println(i + i2);
        System.out.printf("%.1f\n", d + d2);
        System.out.println(s + s2);
       
        scan.close();
    }
}
