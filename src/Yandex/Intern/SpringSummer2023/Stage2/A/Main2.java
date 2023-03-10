package Yandex.Intern.SpringSummer2023.Stage2.A;
/*
             3
           /   \
          2     5
         / \
        1   4
*/
public class Main2 {
    public static void main(String[] args) {
        Node child1 = new Node(1, null, null);
        Node child4 = new Node(4, null, null);
        Node child2 = new Node(2, child1, child4);
        Node child5 = new Node(4, null, null);
        Node tree = new Node(3, child2, child5);

        if (tree != null) {
            System.out.println(deep(tree));
        } else {
            System.out.println("ok");
        }

    }

    static Result deep(Node n) {
        Result result = new Result(true, n.value, n.value);

        if (n.l != null) {
            if (n.l.value >= n.value) {
                result.ok = false;
                return result;
            }
            Result resultL = deep(n.l);
            if (!resultL.ok || resultL.max >= n.value) {
                result.ok = false;
                return result;
            }
            result.min = resultL.min;
        }
        if (n.r != null) {
            if (n.r.value <= n.value) {
                result.ok = false;
                return result;
            }
            Result resultR = deep(n.r);
            if (!resultR.ok || resultR.min <= n.value) {
                result.ok = false;
                return result;
            }
            result.max = resultR.max;
        }
        return result;
    }

    static class Result {
        boolean ok;
        int min;
        int max;

        public Result(boolean ok, int min, int max) {
            this.ok = ok;
            this.min = min;
            this.max = max;
        }

        @Override
        public String toString() {
            return "Result{" +
                    "ok=" + ok +
                    ", min=" + min +
                    ", max=" + max +
                    '}';
        }
    }

    static class Node {
        int value;
        Node l;
        Node r;

        public Node(int value, Node l, Node r) {
            this.value = value;
            this.l = l;
            this.r = r;
        }
    }

}
