import java.util.LinkedList;

public class Search {
  enum State { UNVISITED, VISITED, VISITING; }

  boolean search (Graph g, Graph.Node start, Graph.Node end) {
    if (start == end) return true;

    // operates as Queue
    LinkedList<Graph.Node> q = new LinkedList<Graph.Node>();

    for (Graph.Node u : g.nodes) {
      u.state = State.UNVISITED;
    }
    start.state = State.VISITING;
    q.add(start);
    Graph.Node u;
    while (!q.isEmpty()) {
      u = q.removeFirst();
      if (u != null) {
        for (Graph.Node v : u.children) {
          if (v.state == State.UNVISITED) {
            if (v == end) {
              return true;
            } else {
              v.state = State.VISITING;
              q.add(v);
            }
          }
        }
        u.state = State.VISITED;
      }
    }
    return false;
  }
}
