package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Math.pow;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test public void searchTestWithOneElementWhichIsInSequence() {
        int[] seq = {5};
        SearchResult sr = BinarySearch.search(5, seq);
        Assert.assertThat(sr.isFound(), is(true));
    }

    @Test public void searchTestWithOneElementWhichIsNotInSequence() {
        int[] seq = {5};
        SearchResult sr = BinarySearch.search(0, seq);
        Assert.assertThat(sr.isFound(), is(false));
    }

    @Test public void searchTestWithSearchingElementInFirstPlace() {
        int[] seq = {1, 2, 3};
        SearchResult sr = BinarySearch.search(1, seq);
        Assert.assertThat(sr.isFound() && sr.getPosition() == 1, is(true));
    }

    @Test public void searchTestWithSearchingElementInLastPlace() {
        int[] seq = {1, 2, 3, 4};
        SearchResult sr = BinarySearch.search(4, seq);
        Assert.assertThat(sr.isFound() && sr.getPosition() == 4, is(true));
    }

    @Test public void searchTestWithSearchingElementInMiddlePosition() {
        int[] seq = {1, 2, 3, 4, 5};
        SearchResult sr = BinarySearch.search(3, seq);
        Assert.assertThat(sr.isFound() && sr.getPosition() == 3, is(true));

    }

    @Test public void searchTestWithSearchingElementIsNotInSequence() {
        int[] seq = {1, 2};
        SearchResult sr = BinarySearch.search(4, seq);
        Assert.assertThat(sr.isFound() && sr.getPosition() == 2, is(false));

    }

    @Test public void searchTestWithEmptySequence() {
        int[] seq = {};
        SearchResult sr = BinarySearch.search(7, seq);
        Assert.assertThat(!sr.isFound() && sr.getPosition() == -1, is(true));

    }

    @Test public void searchTestWithNullSequence() {
        int[] seq = null;
        try {
            SearchResult sr = BinarySearch.search(7, seq);
        } catch (NullPointerException e) {
        }

    }

    @Test public void searchTestWithDescendingSequence() {
        int[] seq = {5, 3, 1};
        SearchResult sr = BinarySearch.search(5, seq);
        Assert.assertThat(sr.isFound() && sr.getPosition() == 1, is(false));

    }

    @Test public void searchTestWithUnorderedSequence() {
        int[] seq = {5, 9, 7, 1};
        SearchResult sr = BinarySearch.search(1, seq);
        Assert.assertThat(sr.isFound() && sr.getPosition() == 4, is(false));
    }

}
