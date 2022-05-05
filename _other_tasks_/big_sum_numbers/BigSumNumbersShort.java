package _other_tasks_.big_sum_numbers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class BigSumNumbersShort {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(System.out);
        BigInteger a = new BigInteger(sc.nextLine());
        BigInteger b = new BigInteger(sc.nextLine());

        out.println(a.add(b));

        out.flush();
    }
}
