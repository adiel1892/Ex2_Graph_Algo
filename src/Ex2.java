import api.DirectedWeightedGraph;
import api.DirectedWeightedGraphAlgorithms;

/**
 * This class is the main class for Ex2 - your implementation will be tested using this class.
 */
public class Ex2 {
    /**
     * This static function will be used to test your implementation
     *
     * @param json_file - a json file (e.g., G1.json - G3.gson)
     * @return
     */
    public static DirectedWeightedGraph getGrapg(String json_file) {
        DirectedWeightedGraph ans = null;
        DirectedWeightedGraphAlgorithms algo = new DWGraphAlgorithms();
        algo.load(json_file);
        ans = algo.getGraph();
        algo.init(ans);
        return ans;
    }

    /**
     * This static function will be used to test your implementation
     *
     * @param json_file - a json file (e.g., G1.json - G3.gson)
     * @return
     */
    public static DirectedWeightedGraphAlgorithms getGrapgAlgo(String json_file) {
        DirectedWeightedGraphAlgorithms ans = null;
        ans = new DWGraphAlgorithms();
        ans.load(json_file);
        DirectedWeightedGraph graph = ans.getGraph();
        ans.init(graph);
        return ans;
    }

    /**
     * This static function will run your GUI using the json fime.
     *
     * @param json_file - a json file (e.g., G1.json - G3.gson)
     */
    public static void runGUI(String json_file) {
        DirectedWeightedGraphAlgorithms alg = getGrapgAlgo(json_file);
        // ****** Add your code here ******
        graphWindow window = new graphWindow(alg);
        // ********************************
    }

    public static void main(String[] args) {
        String myJson = args[0];
        getGrapg(myJson);
        getGrapgAlgo(myJson);
        runGUI(myJson);
    }
}