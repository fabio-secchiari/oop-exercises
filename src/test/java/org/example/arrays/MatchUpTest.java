package org.example.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchUpTest {
    @Test
    void matchUp() {
        assertEquals(2, MatchUp.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 10}));
        assertEquals(3, MatchUp.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 5}));
        assertEquals(2, MatchUp.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 3}));
        assertEquals(2, MatchUp.matchUp(new int[]{5, 7, 4, 9}, new int[]{2, 3, 3, 7}));
        assertEquals(3, MatchUp.matchUp(new int[]{-8, 2, -6, 5, 1}, new int[]{-6, 5, -5, 3, 1}));
    }
}