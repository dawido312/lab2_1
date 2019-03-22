package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test public void searchTest() {
        int[] seq = {5};
        SearchResult sr = BinarySearch.search(5, seq);
        Assert.assertThat(sr.isFound(), is(true));
    }

    @Test public void searchTest2() {
        int[] seq = {5};
        SearchResult sr = BinarySearch.search(0, seq);
        Assert.assertThat(sr.isFound(), is(false));
    }

    @Test public void searchTest3() {
        int[] seq = {1, 2, 3};
        SearchResult sr = BinarySearch.search(1, seq);
        Assert.assertThat(sr.isFound() && sr.getPosition() == 1, is(true));
    }

    @Test public void searchTest4() {
        int[] seq = {1, 2, 3};
        SearchResult sr = BinarySearch.search(3, seq);
        Assert.assertThat(sr.isFound()&&sr.getPosition()==3, is(true));
    }

    @Test public void searchTest5() {
        int[] seq = {1, 2, 3};
        SearchResult sr = BinarySearch.search(2, seq);
        Assert.assertThat(sr.isFound()&&sr.getPosition()==2, is(true));

    }

    @Test public void searchTest6() {
        int[] seq = {1, 2, 3};
        SearchResult sr = BinarySearch.search(4, seq);
        Assert.assertThat(sr.isFound()&&sr.getPosition()==2, is(false));

    }

    @Test public void searchTest7()
    {
        int[] seq = {};
        SearchResult sr = BinarySearch.search(7, seq);
        Assert.assertThat(!sr.isFound()&&sr.getPosition()==-1, is(true));

    }

    @Test public void searchTest8()
    {
        int [] seq=null;
        try {
            SearchResult sr = BinarySearch.search(7, seq);
        }catch(NullPointerException e){}

    }

}
