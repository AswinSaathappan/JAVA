import java.io.*;

class StreamIODemo {
    public static void main(String[] args) throws IOException {
        // Using OutputStream to write binary data to a file
        System.out.println("Using OutputStream:");
        String outputData = "Hello, OutputStream!";
        FileOutputStream outputStream = new FileOutputStream("output.txt");
        outputStream.write(outputData.getBytes()); // Convert string to bytes and write to file
        outputStream.close(); // Close the stream
        System.out.println("Data written to output.txt using OutputStream.\n");

        // Using InputStream to read binary data from a file
        System.out.println("Using InputStream:");
        FileInputStream inputStream = new FileInputStream("output.txt");
        int byteData;
        System.out.print("Data read from output.txt: ");
        while ((byteData = inputStream.read()) != -1) {
            System.out.print((char) byteData); // Convert byte to character and print
        }
        inputStream.close(); // Close the stream
        System.out.println("\n");

        // Using Writer to write character data to a file
        System.out.println("Using Writer:");
        String writerData = "Hello, Writer!";
        FileWriter writer = new FileWriter("writer.txt");
        writer.write(writerData); // Write characters to file
        writer.close(); // Close the writer
        System.out.println("Data written to writer.txt using Writer.\n");

        // Using Reader to read character data from a file
        System.out.println("Using Reader:");
        FileReader reader = new FileReader("writer.txt");
        int charData;
        System.out.print("Data read from writer.txt: ");
        while ((charData = reader.read()) != -1) {
            System.out.print((char) charData); // Print each character
        }
        reader.close(); // Close the reader
        System.out.println();
    }
}