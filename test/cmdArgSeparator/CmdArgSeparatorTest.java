package cmdArgSeparator;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CmdArgSeparatorTest {
    @Test
    public void testForTheSplittingOfTheOptionsWhenitIsGiven() throws Exception {
        String [] options = {"-f", "hello.txt"};
        CmdArgSeparator argSeparator = new CmdArgSeparator(options);
        String[] expectedFiles = {"hello.txt"};
        assertArrayEquals(expectedFiles, argSeparator.fileSeparator());
        String [] expectedOptions = {"-f"};
        assertArrayEquals(expectedOptions, argSeparator.optionSeparator());
    }

    @Test
    public void testForThesplittingOfTheOptionsWhenNoOptionProvided() throws Exception {
        String [] file = {"hello.txt"};
        CmdArgSeparator argSeparator = new CmdArgSeparator(file);
        String [] expectedOptions = {"-f"};
        assertArrayEquals(expectedOptions, argSeparator.optionSeparator());
    }

    @Test
    public void testForTheMultipleFiles() throws Exception {
        String [] options = {"-i","hello.txt","world.txt"};
        CmdArgSeparator argSeparator = new CmdArgSeparator(options);
        String [] expectedOptions = {"-i"};
        assertArrayEquals(expectedOptions, argSeparator.optionSeparator());
        String [] files = {"hello.txt","world.txt"};
        assertArrayEquals(files, argSeparator.fileSeparator());
    }

    @Test
    public void testAddTheFiltersToTheOptionsIfItHasTheCountryName() throws Exception {
        String [] options = {"-i","-cMacedonia","hello.txt","world.txt"};
        CmdArgSeparator argSeparator = new CmdArgSeparator(options);
        String [] expectedOptions = {"-i"};
        assertArrayEquals(expectedOptions, argSeparator.optionSeparator());
        String [] files = {"hello.txt","world.txt"};
        assertEquals(1, argSeparator.getFilters().size());
        assertArrayEquals(files, argSeparator.fileSeparator());
    }

    @Test
    public void testAddTheFiltersToAddAgeFilterToIt() throws Exception {
        String [] options = {"-a9","hello.txt"};
        CmdArgSeparator argSeparator = new CmdArgSeparator(options);
        String [] expectedOptions = {"-f"};
        assertArrayEquals(expectedOptions, argSeparator.optionSeparator());
        String [] files = {"hello.txt"};
        assertEquals(1, argSeparator.getFilters().size());
        assertArrayEquals(files, argSeparator.fileSeparator());
    }

    @Test
    public void testAddTheFiltersToAddBothAgeFilterAndCountryFilter() throws Exception {
        String [] options = {"-cBangladesh","-a9","hello.txt"};
        CmdArgSeparator argSeparator = new CmdArgSeparator(options);
        String [] expectedOptions = {"-f"};
        assertArrayEquals(expectedOptions, argSeparator.optionSeparator());
        String [] files = {"hello.txt"};
        assertEquals(2, argSeparator.getFilters().size());
        assertArrayEquals(files, argSeparator.fileSeparator());
    }
}