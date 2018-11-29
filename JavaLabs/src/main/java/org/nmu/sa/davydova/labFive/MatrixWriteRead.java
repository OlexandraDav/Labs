package org.nmu.sa.davydova.labFive;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.google.gson.Gson;

//import asd.Matrix;

public class MatrixWriteRead {
    private static Gson GSONFile = new Gson();
    private static String GSONString;
    private static FileWriter writer;
    private static Scanner scan;

    public String writeJSON(Matrix matrix, String fileName) throws IOException {
        writer = new FileWriter(fileName, false);
        GSONString = GSONFile.toJson(matrix);
        writer.write(GSONString);
        writer.close();
        return GSONString;
    }

    public Matrix readJSON(Matrix matrix, String fileName) throws IOException {
        try {
            FileReader reader = new FileReader(fileName);
            scan = new Scanner(reader);
            matrix = GSONFile.fromJson(scan.nextLine(), Matrix.class);
            reader.close();
            return matrix;
        } catch (FileNotFoundException e) {
            System.out.println("This file doesn't exist, we're soo sorry :C");
            return matrix;
        }
    }
}
