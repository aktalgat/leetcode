package io.talgat.easy;

/**
 * https://leetcode.com/problems/distance-between-bus-stops
 */
public class DistanceBetweenBusStops {

    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start > destination) {
            int tmp = start;
            start = destination;
            destination = tmp;
        }
        int clock = 0;
        int total = 0;
        for (int i = 0; i < distance.length; i++) {
            total += distance[i];
            if (i >= start && i < destination) {
                clock += distance[i];
            }
        }
        return Math.min(clock, total - clock);
    }
}
