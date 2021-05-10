public class StatLib {

    public static Comparable max(Comparable[] items) {
        int maxIndex = 0;
        int cmp;
        for (int i = 0; i < items.length; i++) {

            cmp = items[i].compareTo(items[maxIndex]);

            if (cmp > 0) {
                maxIndex = i;
            }
        }
        return items[maxIndex];
    }

}