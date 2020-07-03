package test;
import main.BonusBinarySearch;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class BonusBinarySearchTest {
    int[] testArrayToPassIn;
    int testSearchTermToPassIn;
    //TODO: add tests here
    @Before
    public void init() {
        testArrayToPassIn = new int[]{1,2,3};
        testSearchTermToPassIn=1;

    }
    @Test
    public void firstTest(){

        assertEquals(0,BonusBinarySearch.binarySearch(testArrayToPassIn, testSearchTermToPassIn));
    }

}
