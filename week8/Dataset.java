package week8;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Dataset {
    private List<Double> data = new ArrayList<>();

    public void load(String fileName) {
        BufferedReader reader;

        try{
            reader = new BufferedReader( new FileReader(fileName) );
            String line;
            while ((line = reader.readLine()) != null) {
                double value = Double.parseDouble(line);
                data.add(value);
            };
        } catch (FileNotFoundException e){
            System.err.println("FILE NOT FOUND");
        } catch (IOException e) {
            System.err.println("IO EXCEPTION");
        }
    };

    public int size() {
        return data.size();
    };

    public double meanValue() {
        return data.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    public Dataset(String fileName) {
        this.load(fileName);
    }

}
