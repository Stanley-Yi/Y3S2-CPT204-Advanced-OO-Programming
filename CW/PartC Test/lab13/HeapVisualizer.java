public class HeapVisualizer {

    /**
     *  Print a visualization of a binary heap.
     *  @param items array of Objects representation of a binary heap starting at index 1
     */
    public static void heapVisualize(Object[] items) {
        String drawing = heapVisualize(items, 1, "");
        System.out.println(drawing);
    }

    private static String heapVisualize(Object[] items, int index, String soFar) {
        if (index >= items.length || items[index] == null) {
            return "";
        } else {
            String toReturn = "";
            int rightIndex = 2 * index + 1;
            toReturn += heapVisualize(items, rightIndex, "        " + soFar);
            if (rightIndex < items.length && items[rightIndex] != null) {
                toReturn += soFar + "    /";
            }
            toReturn += "\n" + soFar + items[index] + "\n";
            int leftIndex = 2 * index;
            if (leftIndex < items.length && items[leftIndex] != null) {
                toReturn += soFar + "    \\";
            }
            toReturn += heapVisualize(items, leftIndex, "        " + soFar);
            return toReturn;
        }
    }

}
