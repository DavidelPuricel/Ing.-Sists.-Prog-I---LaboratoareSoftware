package lab3;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class fisiere {
    public static void main(String[] args) {
        try {
            Path inputPath = Paths.get("src/lab3/in.txt");
            Path outputPath = Paths.get("src/lab3/out.txt");

            List<String> inMemorie = Files.readAllLines(inputPath);
            List<String> outputLines = new ArrayList<>();

            for (String line : inMemorie) {
                String[] parts = line.split("\\r?\\n");
                for (String part : parts) {
                    String modifiedLine = part + "\n";
                    System.out.println(modifiedLine);
                    outputLines.add(part);
                    outputLines.add("");
                }
            }

            List<String> rezultatuB = new ArrayList<>();
            for (String line : inMemorie) {
                String[] parts = line.split("\\.");
                for (int i = 0; i < parts.length; i++) {
                    String text = parts[i].trim();
                    if (!text.isEmpty()) {
                        if (line.contains(text + ".")) {
                            String formatted = text + ".";
                            System.out.println(formatted);
                            rezultatuB.add(formatted);
                        } else {
                            System.out.println(text);
                            rezultatuB.add(text);
                        }
                    }
                }
            }

            outputLines.addAll(rezultatuB);
            Files.write(outputPath, outputLines);
            System.out.println("\nRezultatul a fost salvat in out.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}