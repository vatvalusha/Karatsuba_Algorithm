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
    public static void main(String[] args) throws Exception {

        Karatsuba karatsuba = new Karatsuba();
        long start, stop;
//        int var = 128;
        final double random = Math.random();
        Random rand = new Random();
//        System.out.println("Random for BigInteger: " + random);


        int N = 2048 + (int) (Math.random() * 4096);
        System.out.println("Random for numBit: " + N);
        BigInteger a = new BigInteger(N, rand);
        System.out.println("A: " + a);
        BigInteger b = new BigInteger(N, rand);
        System.out.println("B: " + b);

        System.out.println("Bit for A: " + a.bitLength());
        System.out.println("Bit for B: " + b.bitLength());
        start = System.currentTimeMillis();
        BigInteger c = karatsuba.karatsuba(a, b);
        System.out.println("Multiply: "+ c.toString());
        stop = System.currentTimeMillis();
        System.out.println("Time for Karatsuba multiply:");
        System.out.println(stop - start);
//
//        start = System.currentTimeMillis();
//        BigInteger d = a.multiply(b);
//        stop = System.currentTimeMillis();
//        System.out.println("Time for simple multiply:");
//        System.out.println(stop - start);
//        BigInteger result = karatsuba.karatsuba(new BigInteger("23"),new BigInteger("47"));
//        System.out.println(result);
//
//        System.out.println((c.equals(d)));
    }
}
