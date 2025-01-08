import java.io.File;

class DirectoryDemo {
    public static void main(String[] args) {
        // Directory path
        String dirPath = "exampleDir";

        // Creating a directory
        File directory = new File(dirPath);
        if (directory.mkdir()) {
            System.out.println("Directory created: " + dirPath);
        } else {
            System.out.println("Failed to create directory or it already exists.");
        }

        // Deleting the directory
        if (directory.exists()) {
            if (directory.delete()) {
                System.out.println("Directory deleted: " + dirPath);
            } else {
                System.out.println("Failed to delete directory.");
            }
        } else {
            System.out.println("Directory does not exist.");
        }

        // Releasing resources
        System.out.println("All resources released. No open streams to handle.");
    }
}