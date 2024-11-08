public class Main {
  public static void main (String[] args) {
    Graph graph = new Graph();

    Graph.Node n1 = graph.new Node("A");
    Graph.Node n2 = graph.new Node("B");
    Graph.Node n3 = graph.new Node("C");
    Graph.Node n4 = graph.new Node("D");
    Graph.Node n5 = graph.new Node("E");

    n1.addChild(n2);
    n2.addChild(n3);
    n2.addChild(n4);
    n4.addChild(n5);

    graph.addNode(n1);
    graph.addNode(n2);
    graph.addNode(n3);
    graph.addNode(n4);
    graph.addNode(n5);

    Search searcher = new Search();
    boolean output = searcher.search(graph, n1, n5);
    System.out.println(output);

  }
  
}
