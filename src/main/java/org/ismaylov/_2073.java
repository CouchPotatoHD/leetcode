package org.ismaylov;

import org.ismaylov.core.LeetCode;
import org.ismaylov.core.Level;

import java.util.ArrayDeque;
import java.util.Queue;

@LeetCode(
        number = 2073,
        name = "Time Needed to Buy Tickets",
        level = Level.EASY,
        tags = {"Array", "Queue", "Simulation"}
)
public class _2073 {

    public int timeRequiredToBuy(int[] tickets, int k) {

        Queue<Integer> waitingLine = new ArrayDeque<>();

        int n = tickets.length;

        for(int i = 0; i<n; i++){
            waitingLine.offer(i);
        }

        int time = 0;

        while(!waitingLine.isEmpty()){

            int currentPerson = waitingLine.poll();

            int ticketsToBuy = Math.min(tickets[currentPerson], 1);

            tickets[currentPerson] -= ticketsToBuy;
            time ++;

            if(currentPerson == k && tickets[currentPerson] == 0){
                return time;
            }

            if(tickets[currentPerson] > 0){
                waitingLine.offer(currentPerson);
            }

        }

        return -1;

    }

}
