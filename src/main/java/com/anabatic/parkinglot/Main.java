package com.anabatic.parkinglot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputParser inputParser = new InputParser();
        switch (args.length) {
            case 0:
                System.out.println("WELCOME TO ANABATIC PARKING");
                System.out.println("Enter Input :");
                // Interactive command-line input/output
                for (;;) {
                    try {
                        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
                        String inputString = bufferRead.readLine();
                        if (inputString.equalsIgnoreCase("exit")) {
                            break;
                        } else if ((inputString == null) || (inputString.isEmpty())) {
                            // Do nothing
                        } else {
                            inputParser.parseTextInput(inputString.trim());
                        }
                    } catch(IOException e) {
                        System.out.println("Oops! Error in reading the input from console.");
                        e.printStackTrace();
                    }
                }
                break;
            case 1:
                // File input/output
                inputParser.parseFileInput(args[0]);
                break;
            default:
                System.out.println("Invalid input. Usage: java -jar <jar_file_path> <input_file_path>");
        }
    }
}
