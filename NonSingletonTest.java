package oop2.week5.lecture1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NonSingletonTest {

    String fileName;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public NonSingletonTest(String fileName) {
        setFileName(fileName);
    }

    public NonSingletonTest() {
    }

    public void createFile(String fileName) {
        setFileName(fileName);
        try {
            File myObj = new File(this.fileName);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void spam(String fileName, String threadId) {

        for (int i = 0; i < 10; i++) {
            try {
                FileWriter type = new FileWriter(fileName);
                type.write("write on the file.");
                System.out.println("Successfully wrote sentence " + (i + 1) + " on file from " + threadId);

                type.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }

    }
}
