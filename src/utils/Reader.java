package utils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Reader {
    public static void Scan(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner sc;
        if (file.exists()) {
            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
    }

    public static void Buffer(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        for (String line; (line = bufferedReader.readLine()) != null; ) {
            System.out.println(line);
        }
    }

    public static void Stream(String fileName) throws IOException {
        Stream<String> stream = Files.lines(Paths.get(fileName));
        stream.forEach(line -> {
            System.out.println(line);
        });
        /* Ugyanez kicsit másképp:
                stream.forEach(System.out::println);
         */
    }
}
