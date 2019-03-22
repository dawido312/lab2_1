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

}
