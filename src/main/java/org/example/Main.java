package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Node root = new Node("1", List.of(
                new Node("2", List.of(
                        new Node("4", List.of(
                                new Node("7", List.of())
                        )),
                        new Node("5", List.of(
                                new Node("8", List.of()),
                                new Node("9", List.of())
                        ))
                )),
                new Node("3", List.of(
                        new Node("6", List.of())
                ))
        ));

        TreeClass.printTreeLevels(root);
    }
}