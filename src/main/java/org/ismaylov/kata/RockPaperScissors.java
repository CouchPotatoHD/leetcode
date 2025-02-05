package org.ismaylov.kata;

public class RockPaperScissors {

    private static final CustomLinkedList<String> whoBeatsWho = new CustomLinkedList<>();

    static {
        {
            whoBeatsWho.first = new CustomLinkedList.Node<>("rock");
            whoBeatsWho.first.next = new CustomLinkedList.Node<>("scissors", new CustomLinkedList.Node<>("paper", new CustomLinkedList.Node<>(whoBeatsWho.first.item)));
        }
    }

    private static final int itemCount = 3;

    public static String rps(String p1, String p2) {

        CustomLinkedList.Node<String> current = whoBeatsWho.first;

        for (int i = 0; i < itemCount; i++) {

            if (current.item.equals(p1)) {

                if (p1.equals(p2)) {
                    return "Draw!";
                }

                if (p2.equals(current.next.item)) {
                    return "Player 1 won!";
                }
            }

            current = current.next;

        }
        return "Player 2 won!";
    }

    public static class CustomLinkedList<E> {

        transient Node<E> first;

        public static class Node<E> {
            E item;
            Node<E> next;

            Node(E element, Node<E> next) {
                this.item = element;
                this.next = next;
            }

            Node(E element) {
                this.item = element;
            }

        }

    }

}
