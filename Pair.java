public class Pair<A, B> {
    private A a;
    private B b; 

    public Pair(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public A getFirst() {
        return a;
    }

    public B getSecond() {
        return b; 
    }

    public void setFirst(A a) {
        this.a = a;
    }

    public void setSecond(B b) {
        this.b = b;
    }

    public void setPair(Pair<A,B> p) {
        a = p.getFirst();
        b = p.getSecond();
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("<");
        s.append(a.toString());
        s.append(", ");
        s.append(b.toString());
        s.append(">");
        return s.toString();
    }
}
