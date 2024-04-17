public class ObjectList {
    private int numElements = 0;
    private Object[] myShapes = new Object[100];

    public void add(Object shape) {
        myShapes[numElements++] = shape;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numElements; i++) {
            result.append(myShapes[i]);
            result.append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        ObjectList list = new ObjectList();
        list.add(95);
        list.add(100);
        list.add(58);
        System.out.println(list);
        //  System.out.println(list.save());
    }
}
