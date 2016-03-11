package app;

import entities.Name;
import entities.Person;
import guestGenerator.GuestListParser;
import nameFormats.FormalName;
import nameFormats.InformalName;

import java.io.*;
import java.util.ArrayList;
public class LabelPrinter {

    public static void main(String[] args) throws IOException {
//        String fileName = CmdArgSeparator.fileSeparator(args);
        String fileData = readFile("./data/records");
        ArrayList<Person> guestList = new GuestListParser(fileData).parse();
        for (Person person : guestList) {
            System.out.println(person.formatUsing(new InformalName()));
        }

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
