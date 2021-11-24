import api.EdgeData;

public class myEdge implements EdgeData {
    private int src;
    private int dest;
    private double weight;
    private String info;
    private int tag;

    public myEdge(int src , int dest , double weight , int tag , String info){
        this.src = src;
        this.dest = dest;
        this.weight = weight;
        this.tag = tag;
        this.info = info;
    }

    public myEdge(int src , int dest , double weight){
        this.src = src;
        this.dest = dest;
        this.weight = weight;
        this.tag = 0;
        this.info = null;
    }

    @Override
    public int getSrc() {
        return this.src;
    }

    @Override
    public int getDest() {
        return this.dest;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public String getInfo() {
        return this.info;
    }

    @Override
    public void setInfo(String s) {
        this.info = s;
    }

    @Override
    public int getTag() {
        return this.tag;
    }

    @Override
    public void setTag(int t) {
        this.tag = t;
    }
}
