import api.NodeData;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DWGraphTest {
    DWGraph g = new DWGraph();
    NodeData node1 = new myNode(1);
    NodeData node2 = new myNode(2);
    NodeData node3 = new myNode(3);



    @Test
    void getNode() {
        assertNull(g.getNode(1));
        g.addNode(node1);
        assertEquals(node1 , g.getNode(1));



    }

    @Test
    void getEdge() {
        DWGraph a = new DWGraph();
        NodeData tmp = new myNode(node1.getKey());
        a.addNode(node1);
        a.addNode(node2);
        assertNull(a.getEdge(node1.getKey() , tmp.getKey()));
        assertNull(a.getEdge(node1.getKey(),node2.getKey()));
        a.connect(node1.getKey() , node2.getKey() , 3);
        assertEquals(3 , a.getEdge(node1.getKey() , node2.getKey()).getWeight());
    }

    @Test
    void addNode() {
        DWGraph g1 = new DWGraph();
        assertEquals(0 , g1.nodeSize());
        g1.addNode(node1);
        assertEquals(1 , g1.nodeSize());
        g1.addNode(node1);
        assertEquals(1 , g1.nodeSize());
        g1.addNode(node2);
        assertEquals(2 , g1.nodeSize());


    }

    @Test
    void connect() {
        DWGraph a = new DWGraph();
        a.addNode(node1);
        a.addNode(node2);
        assertFalse(a.edgeBetween(node1.getKey() , node2.getKey()));
        a.connect(node1.getKey() , node2.getKey() , 3);
        assertTrue(a.edgeBetween(node1.getKey() , node2.getKey()));

    }

    @Test
    void nodeIter() {
    }

    @Test
    void edgeIter() {
    }

    @Test
    void testEdgeIter() {
    }

    @Test
    void removeNode() {
    }

    @Test
    void removeEdge() {
        DWGraph a = new DWGraph();
        a.addNode(node1);
        a.addNode(node2);
        assertFalse(a.edgeBetween(node1.getKey() , node2.getKey()));
        a.connect(node1.getKey() , node2.getKey() , 3);
        assertTrue(a.edgeBetween(node1.getKey() , node2.getKey()));
        assertEquals(1 , a.edgeSize());
        a.removeEdge(node1.getKey() , node2.getKey());
        assertFalse(a.edgeBetween(node1.getKey() , node2.getKey()));
        assertEquals(0 , a.edgeSize());
    }

    @Test
    void nodeSize() {
    }

    @Test
    void edgeSize() {
    }

    @Test
    void getMC() {
    }
}