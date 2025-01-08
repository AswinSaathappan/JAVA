import java.io.*;

class FileCharacterCount {
    public static void main(String[] args) throws IOException {
        // Input file name
        String fileName = "input.txt";

        // Write some sample content to the file
        FileOutputStream fos = new FileOutputStream(fileName);
        String data = "Hello123!\nJava File Handling Test @2024";
        fos.write(data.getBytes());
        fos.close(); // Close FileOutputStream after writing

        // Create a FileInputStream to read the file
        FileInputStream fis = new FileInputStream(fileName);

        // Variables to count digits, alphabets, and other characters
        int digits = 0, alphabets = 0, others = 0;
        int c;

        // Read the file byte by byte
        while ((c = fis.read()) != -1) {
            char ch = (char) c;

            // Check if character is a digit
            if (Character.isDigit(ch)) {
                digits++;
            }
            // Check if character is an alphabet
            else if (Character.isLetter(ch)) {
                alphabets++;
            }
            // Count everything else as "other"
            else {
                others++;
            }
        }

        // Print the counts
        System.out.println("Total digits: " + digits);
        System.out.println("Total alphabets: " + alphabets);
        System.out.println("Total other characters: " + others);

        // Close the file stream
        fis.close();
    }
}
