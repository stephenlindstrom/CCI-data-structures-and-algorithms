import java.util.ArrayList;

public class Graph {
  public ArrayList<Node> nodes = new ArrayList<Node>();
  
  public void addNode(Node node) {
    this.nodes.add(node);
  }
  class Node {
    public String name;
    public ArrayList<Node> children = new ArrayList<Node>();
    Search.State state;

    Node (String name) {
      this.name = name;
    }

    public void addChild(Node node) {
      this.children.add(node);
    }
  }
}
