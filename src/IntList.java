public class IntList {
    private int numElements = 0;

    // caps at 100 elements with no bullet-proofing or bounds checks, etc.
    private int[] data = new int[100];

    public void add(int item) {
        data[numElements++] = item;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numElements; i++) {
            result.append(data[i]);
            result.append(" ");
        }
        return result.toString();
    }

    public int sum() {
        int sum = 0;

        for (int e: this.data){
            sum += e;
        }
        return sum;
    }

    public int indexOf(int target) {

        int numOfElements = this.data.length;
        if (numOfElements > 0){
            for (int i = 0; i < numOfElements; i++) {
                if (data[i] == target){
                    return i;
                }
            }
        }
        return -1;
    }

    // main from lab goes here
    public static void main(String[] args) {
        IntList list = new IntList();
        list.add(95);
        list.add(100);
        list.add(58);
        System.out.println(list.toString());
        System.out.println(list.sum());
        System.out.println(list.indexOf(95));
        System.out.println(list.indexOf(20));
        //  System.out.println(list.save());
    }
}
