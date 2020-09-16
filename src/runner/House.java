package runner;

public class House implements Carpenter, Painter {

    public static void main(String[] args) {
        Carpenter obj = new House();

        obj.doCarpetWork();

        Painter obj1 = (Painter) obj; // type casting

        obj1.doPaintWork();

    }

    public void doCarpetWork() {
        System.out.println("Carpenter work");
    }

    public void doPaintWork() {
        System.out.println("Painter work");
    }
}

interface Carpenter {
    void doCarpetWork();
}

interface Painter {
    void doPaintWork();
}