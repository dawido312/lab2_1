package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test public void searchTest() {
        int[] seq = {5};
        SearchResult sr = BinarySearch.search(5, seq);
        Assert.assertTrue(sr.isFound());
    }

    @Test public void searchTest2(){
        int[] seq = {5};
        SearchResult sr = BinarySearch.search(0, seq);
        Assert.assertFalse(sr.isFound());
    }

    @Test public void searchTest3()
    {
        int[] seq = {1, 2, 3};
        SearchResult sr = BinarySearch.search(1, seq);
        Assert.assertTrue(sr.isFound());
        Assert.assertEquals(sr.getPosition(),1);
    }


}
