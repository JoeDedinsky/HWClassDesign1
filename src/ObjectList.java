/**
 * For Class Design - convert to IntList
 */
public class ObjectList {
    private int numElements = 0;

    // caps at 100 elements with no bullet-proofing or bounds checks, etc.
    private Object[] myShapes = new Object[100];

    /**
     * Adds item to this list without checking for array bounds.
     *
     * @param shape value to add to the list
     */
    public void add(Object shape) {
        myShapes[numElements++] = shape;
    }

    /**
     * Returns a string representation of this list.
     *
     * @return a string representation of this list
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numElements; i++) {
            result.append(myShapes[i]);
            result.append(" ");
        }
        return result.toString();
    }


    // main from lab goes here
    public static void main(String[] args) {
        ObjectList list = new ObjectList();
        list.add(95);
        list.add(100);
        list.add(58);
        System.out.println(list.toString());


        // Uncomment these to work on next

        //  System.out.println(list.save());
    }
}
