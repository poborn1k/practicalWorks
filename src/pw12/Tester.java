package pw12;

import java.util.*;

public class Tester {
    private static String[] player1;
    private static String[] player2;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("1 - Stack\n2 - Queue\n3 - Dequeue\n0 - Exit\nYour choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1 -> {
                    inputDeck();
                    System.out.println(task1(player1, player2));
                }
                case 2 -> {
                    inputDeck();
                    System.out.println(task2(player1, player2));
                }
                case 3 -> {
                    inputDeck();
                    System.out.println(task3(player1, player2));
                }
                case 0 -> {
                    System.out.println("Program closed");
                    return;
                }
            }
        }
    }

    private static void inputDeck() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            scan.reset();
            System.out.print("First deck: ");
            player1 = scan.nextLine().split("");
            System.out.print("Second deck: ");
            player2 = scan.nextLine().split("");
            if (player1.length == 5 && player2.length == 5) {
                break;
            } else {
                System.out.println("Invalid input, try again");
            }
        }
    }

    // STACK
    private static String task1(String[] p1, String[] p2) {
        Stack<Integer> deck1 = new Stack<>();
        Stack<Integer> deck2 = new Stack<>();

        while (deck1.size() < 5 && deck2.size() < 5) {
            deck1.push(Integer.valueOf(p1[deck1.size()]));
            deck2.push(Integer.valueOf(p2[deck2.size()]));
        }

        int moves = 0;

        while (moves < 106 && !deck1.isEmpty() && !deck2.isEmpty()) {
            int card1 = deck1.pop();
            int card2 = deck2.pop();

            if (card1 > card2 || (card1 == 0 && card2 != 0)) {
                deck1.push(card2);
                deck1.push(card1);
            } else if (card1 < card2 || card2 == 0) {
                deck2.push(card1);
                deck2.push(card2);
            } else {
                deck1.push(card1);
                deck2.push(card2);
            }
            moves++;
        }

        if (moves == 106) {
            return "botva";
        } else if (deck1.isEmpty()) {
            return "second " + moves;
        } else {
            return "first " + moves;
        }
    }

    // QUEUE
    private static String task2(String[] p1, String[] p2) {
        Queue<Integer> deck1 = new LinkedList<>();
        Queue<Integer> deck2 = new LinkedList<>();

        while (deck1.size() < 5 && deck2.size() < 5) {
            deck1.offer(Integer.valueOf(p1[deck1.size()]));
            deck2.offer(Integer.valueOf(p2[deck2.size()]));
        }

        int moves = 0;

        while (moves < 106 && !deck1.isEmpty() && !deck2.isEmpty()) {
            int card1 = deck1.poll();
            int card2 = deck2.poll();

            if (card1 > card2 || (card1 == 0 && card2 != 0)) {
                deck1.offer(card2);
                deck1.offer(card1);
            } else if (card1 < card2 || card2 == 0) {
                deck2.offer(card1);
                deck2.offer(card2);
            } else {
                deck1.offer(card1);
                deck2.offer(card2);
            }
            moves++;
        }

        if (moves == 106) {
            return "botva";
        } else if (deck1.isEmpty()) {
            return "second " + moves;
        } else {
            return "first " + moves;
        }
    }

    // Dequeue
    private static String task3(String[] p1, String[] p2) {
        Deque<Integer> deck1 = new ArrayDeque<>();
        Deque<Integer> deck2 = new ArrayDeque<>();

        while (deck1.size() < 5 && deck2.size() < 5) {
            deck1.offerLast(Integer.valueOf(p1[deck1.size()]));
            deck2.offerLast(Integer.valueOf(p2[deck2.size()]));
        }

        int moves = 0;

        while (moves < 106 && !deck1.isEmpty() && !deck2.isEmpty()) {
            int card1 = deck1.pollFirst();
            int card2 = deck2.pollFirst();

            if (card1 > card2 || (card1 == 0 && card2 != 0)) {
                deck1.offerLast(card2);
                deck1.offerLast(card1);
            } else if (card1 < card2 || card2 == 0) {
                deck2.offerLast(card1);
                deck2.offerLast(card2);
            } else {
                deck1.offerLast(card1);
                deck2.offerLast(card2);
            }
            moves++;
        }

        if (moves == 106) {
            return "botva";
        } else if (deck1.isEmpty()) {
            return "second " + moves;
        } else {
            return "first " + moves;
        }
    }

    // DoubleList ????
    private static String task4(String[] p1, String[] p2) {
        return "";
    }

}
