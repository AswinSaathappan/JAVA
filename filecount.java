import java.io.*;

public class filecount{
    public static void main(String[] args) throws IOException {
        // Input file name
        String fileName = "abc.txt";
       
        FileOutputStream fos = new FileOutputStream(fileName);
        String data = "Hello Everyone\nWelcome to the Java tutorial\nThis is the third line";
        fos.write(data.getBytes());
        fos.close();
    
        // Create a FileInputStream to read the file
        FileInputStream fis = new FileInputStream(fileName);

        // Variables to store counts
        int lines = 0, words = 0, characters = 0;
        int c;

        // Read the file byte by byte
        while ((c = fis.read()) != -1) {
            char ch = (char) c;

            // Count characters (excluding spaces/newlines)
            if (ch != ' ' && ch != '\n' && ch != '\t') {
                characters++;
            }

            // Count lines
            if (ch == '\n') {
                lines++;
            }

            // Count words
            if (ch == ' ' || ch == '\t' || ch == '\n') {
                words++;
            }
        }
        if(characters>0)
        {
        // Increment the line count for the last line
        lines++;

        // Increment word count for the last word 
        words++;
        }

        // Print statistics
        System.out.println("Total characters: " + characters);
        System.out.println("Total words: " + words);
        System.out.println("Total lines: " + lines);

        // Close the file stream
        fis.close();
    }
}
