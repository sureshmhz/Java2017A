package Assignment;

import java.util.Scanner;

public class CodeBlocks {
    public static void main(String[] args) {
        OpenFile file = new OpenFile();
        Compile file1 = new Compile();
        int choice;
        String filename;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to codeBlocks");
        System.out.println("This is a LITERAL version(v -1) so nothing cool happens here");
        do{
            System.out.println("\n\n");
            System.out.println("Enter 1 to create a file");
            System.out.println("Enter 2 to read from a file");
            System.out.println("Enter 3 to compile a file");
            System.out.println("Enter 4 to execute the compiled file");
            choice = input.nextInt();
            input.nextLine();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter a name for the file  ");
                    filename = input.nextLine();
                    file.createfile(filename);
                    break;
                case 2:
                    System.out.println("Enter a name of file to open");
                    filename = input.nextLine();
                    file.readfile(filename);
                    break;
                case 3:
                    System.out.println("Enter the name of file to compile");
                    filename = input.nextLine();
                    file1.check(filename);
                    file1.compile(filename);
                    break;
                case 4:
                    System.out.println("Executing the file ...");
                    file1.run();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice !=0);
        System.out.println("Thank You for running CODEBLOCKS v -1.0");
    }
}

class OpenFile{
    public void readfile(String text)
    {
        System.out.println("File "+text+" opened.");
    }
    public void createfile(String text) {
        System.out.println("New File "+text+" is created");
    }
}

class Compile{
    Scanner input = new Scanner(System.in);
    public void check(String text )
    {
        System.out.println("Checking File "+text+" for Syntax Errors");
        input.nextLine();
        System.out.println("No Errors Found!");
    }
    public void compile(String text)
    {
        System.out.println("Compiling File "+text+" Now ..........");
        input.nextLine();
        System.out.println("Source File Compiled");
    }
    public void run()
    {
        System.out.println("Running File ");
        System.out.println("=====Output========\n\n=================");
        System.out.println("Hello World!");
    }
}