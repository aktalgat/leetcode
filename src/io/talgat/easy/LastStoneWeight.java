package io.talgat.easy;

import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/last-stone-weight
 */
public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int n : stones) {
            pq.offer(n);
        }
        while (pq.size() > 1) {
            int h1 = pq.poll();
            int h2 = pq.poll();
            if (h1 != h2) {
                pq.offer(h1 - h2);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
}
