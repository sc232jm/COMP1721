package week5;

import java.util.Arrays;

public class MeanValue {
    public static double meanValue(String[] data) {
        return Arrays.stream(data).mapToDouble(Double::parseDouble).sum()/(double) data.length;
    }
  
    public static void main(String[] args) {
        if(args.length > 1 ) {
            System.out.printf("%.3f\n", meanValue(args));
        } else System.err.println("Usage: java MeanValue <values...>");
    }
  }