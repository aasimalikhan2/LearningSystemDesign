package factoryDesignPattern.documentAssignmentChatGPT;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextDocument implements Document{
    BufferedReader bufferedReader;
    @Override
    public void open(String filepath) {
        try
        {
            bufferedReader = new BufferedReader(new FileReader(filepath));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() {

    }


    @Override
    public void print() {
        try {
            String line;
            // Read each line from the file until reaching the end
            while ((line = bufferedReader.readLine()) != null) {
                // Process each line (e.g., print it)
                System.out.println(line);
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
