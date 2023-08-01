package org.example;
import java.util.List;

public class Node {
    private String value;
    private List<Node> children;

    public Node(String data, List<Node> children) {
        this.value = data;
        this.children = children;
    }

    public String getValue() {
        return value;
    }

    public void setData(String value) {
        this.value = value;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }
}
