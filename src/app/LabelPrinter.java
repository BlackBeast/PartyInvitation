package app;

import cmdArgSeparator.CmdArgSeparator;
import entities.Person;
import guestGenerator.GuestListParser;
import printingUtilities.ConsolePrinter;

import java.io.*;
import java.util.ArrayList;
public class LabelPrinter {

    public static void main(String[] args) throws IOException {
        CmdArgSeparator arguments = new CmdArgSeparator(args);
        String[] option = arguments.options;
        String [] files = arguments.nonOptions;
        String fileData = readFile(files[0]);
        ArrayList<Person> guestList = new GuestListParser(fileData).parse();
        ConsolePrinter printingList = new ConsolePrinter();
        printingList.print(guestList,option[0]);

    }

    private static String readFile(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
        BufferedReader data = new BufferedReader(fileReader);
        StringBuilder sb = new StringBuilder();
        String eachLine = data.readLine();
        while (eachLine != null) {
            sb.append(eachLine);
            sb.append(System.lineSeparator());
            eachLine = data.readLine();
        }
        return sb.toString();
    }
}
