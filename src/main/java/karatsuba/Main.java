package karatsuba;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Random;
import java.io.*;
import java.util.Scanner;


/**
 * Created by vatva on 07.02.2017.
 */
public class Main {
    public static void main(String[] args)  throws Exception {

        Karatsuba karatsuba = new Karatsuba();
        long start, stop;
        final double random = Math.random();
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println(random);
        System.out.println("1");

        int N = 2147483647 + (int)Math.round((random * 2147483647) + (-2147483648));
//        BigInteger a = new BigInteger(N, random);
        System.out.println(N);
        System.out.println("Input number X: ");
        BigInteger a = new BigInteger((int)  N, rand);
        System.out.println("A: " + a);
//        BigInteger b = new BigInteger(N, random);
        System.out.println("Input number Y: ");
        BigInteger b = new BigInteger(43, rand);

        System.out.println("B: "+ b);

        start = System.currentTimeMillis();
        BigInteger c = karatsuba.karatsuba(a, b);
        System.out.println(c.toString());
        stop = System.currentTimeMillis();
        System.out.println("Time for Karatsuba multiply:");
        System.out.println(stop - start);

        start = System.currentTimeMillis();
        BigInteger d = a.multiply(b);
        stop = System.currentTimeMillis();
        System.out.println("Time for simple multiply:");
        System.out.println(stop - start);

        System.out.println((c.equals(d)));
    }
}
