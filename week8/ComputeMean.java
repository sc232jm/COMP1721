package week8;

import java.io.IOException;

public class ComputeMean {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Usage: java ComputeMean <filename>");
            System.exit(1);
        }

        try {
            Dataset numbers = new Dataset(args[0]);
            System.out.printf("Dataset size = %d\n", numbers.size());
            System.out.printf("Mean value = %.3f\n", numbers.meanValue());
        } catch (Exception error) {
            System.err.println(error);
            System.exit(2);
        }
    }
}