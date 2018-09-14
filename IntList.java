public class IntList {

    private int node;
    private IntList next;

    public IntList(int node, IntList next) {
        this.node = node;
        this.next = next;
    }

    public IntList(int node) {
        this.node = node;
    }

    public IntList() {
    }

    public void setNode(int node) {
        this.node = node;
    }

    public void addNext(int nextNum){
        IntList temp = this.next;
        this.next = new IntList(nextNum, this.next);
    }

    public void getNode() {
        System.out.println(node);
        if (next != null) {
            next.getNode();
        }
    }

    public static void main(String[] args) {
        IntList toAdd = new IntList(3);
        IntList test = new IntList(2,toAdd);
        test.setNode(1);
        test.addNext(2);
        test.getNode();
    }
}