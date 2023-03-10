package Yandex.Intern.SpringSummer2023.Stage2.A;
//     3
//   /   \
//  2     5
// / \
//1   4
public class Main {
    public static void main(String[] args) {
        Node child1 = new Node(1, null, null);
        Node child4 = new Node(4, null, null);
        Node child2 = new Node(2, child1, child4);
        Node child5 = new Node(4, null, null);
        Node tree = new Node(3, child2, child5);

        System.out.println(deep(tree));

    }

    static Result deep(Node n) {
        Result result = new Result(true, null, null);
        if (n != null) {
            //return false if:
            //+++l >= value
            //l.max >= value
            //+++r <= value
            //r.min <= value
            result = compare(n.value, n.l, n.r);
            if (!result.ok) {
                return result;
            }
            Result resultL = deep(n.l);
            if (!resultL.ok || resultL.max != null && resultL.max >= n.value) {
                result.ok = false;
                return result;
            }
            if (resultL.min != null) {
                result.min = resultL.min;
            }
            Result resultR = deep(n.r);
            if (!resultR.ok || resultR.max != null && resultR.max <= n.value) {
                result.ok = false;
                return result;
            }
            if (resultL.max != null) {
                result.max = resultR.max;
            }
        }
        return result;
    }
    static Result compare(Integer base, Node l, Node r) {
        Result result = new Result(true, null, null);
        if (l != null){
            if (l.value >= base) {
                result.ok = false;
                return result;
            }
            result.min = l.value;
        }
        if (r != null){
            if (r.value <= base) {
                result.ok = false;
                return result;
            }
            result.max = r.value;
        }
        return result;
    }
}

class Result {
    boolean ok;
    Integer min;
    Integer max;

    public Result(boolean ok, Integer min, Integer max) {
        this.ok = ok;
        this.min = min;
        this.max = max;
    }

    @Override
    public String toString() {
        return "YandexInternSpringSummer2023.Stage2.A.Result{" +
                "ok=" + ok +
                ", min=" + min +
                ", max=" + max +
                '}';
    }
}

class Node {
    int value;
    Node l;
    Node r;

    public Node(int value, Node l, Node r) {
        this.value = value;
        this.l = l;
        this.r = r;
    }
}