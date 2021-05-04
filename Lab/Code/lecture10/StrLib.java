public class StrLib {

    /** Returns the length of the longest string. */
    public static String longestStr(ListIF<String> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i += 1) {
            String longestString = list.get(max);
            String thisString = list.get(i);
            if (thisString.length() > longestString.length()) {
                max = i;
            }
        }
        return list.get(max);
    }

    public static void main(String[] args) {
        ListIF<String> list1 = new SLList<>();
        list1.addLast("a");
        list1.addLast("ab");
        list1.addLast("abc");
        System.out.println(longestStr(list1));

        ListIF<String> list2 = new ARList<>();
        list2.addLast("a");
        list2.addLast("ab");
        list2.addLast("abc");
        System.out.println(longestStr(list2));
    }

}
