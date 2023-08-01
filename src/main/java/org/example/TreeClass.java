package org.example;
import java.util.List;

public class TreeClass {
    public static void printTreeLevels(Node root) {
        // Находим глубину дерева
        int depth = getDepth(root);

        for (int level = depth; level >= 1; level--) {
            System.out.println("Level " + level + ":");
            printNodesAtLevel(root, level);
            System.out.println();
        }
    }

    private static int getDepth(Node node) {
        // Если узел пустой, возвращаем 0
        if (node == null) {
            return 0;
        }

        int maxChildDepth = 0;
        // Находим максимальную глубину для дочерних элементов текущего узла
        for (Node child : node.getChildren()) {
            int childDepth = getDepth(child);
            maxChildDepth = Math.max(maxChildDepth, childDepth);
        }

        // Глубина текущего узла равна глубине наиболее глубокого дочернего узла + 1
        return maxChildDepth + 1;
    }

    private static void printNodesAtLevel(Node node, int level) {
        // Если достигли конечной ноды или уровень 0, выводим данные этой нодыы
        if (node == null || level == 1) {
            System.out.println(node.getValue());
            return;
        }

        // Рекурсивно вызываем метод для дочерних узлов на уровень ниже
        for (Node child : node.getChildren()) {
            printNodesAtLevel(child, level - 1);
        }
    }
}
