public class MyList {
    private int value;
    private MyList next;

    public MyList(int value, MyList next) {
        this.value = value;
        this.next = next;
    }

    // LAB EXERCISE 4.1 MYLIST ITERATIVE SQUARE MUTATE 

    /**
     * Square the elements of a MyList. Mutates the MyList.
     * @param list is a MyList object.
     */
    public static void iterSquareMutList(MyList list) {

		while (list != null){
            list.value = list.value * list.value;
            list = list.next;
        }
		
    }


    // LAB EXERCISE 4.2 MYLIST RECURSIVE SQUARE MUTATE 

    /**
     * Square the elements of a MyList. Mutates the MyList.
     * @param list is a MyList object.
     */
    public static void recSquareMutList(MyList list) {

        // base case
        if (list == null){
            return;
        }
        if (list.next == null) {
            list.value = list.value * list.value;
            return;
        }

        // recursive step
        list.value = list.value * list.value;
        recSquareMutList(list.next);

    }


    // LAB EXERCISE 4.3 MYLIST ITERATIVE SQUARE IMMUTATE 

    /**
     * Square the elements of a MyList. Does not mutate the MyList.
     * @param list is a MyList object.
     * @return another MyList with all of input MyList's element squared.
     */
    public static MyList iterSquareList(MyList list) {

        if (list == null) {
            return null;
        }
        MyList result, p;
        result = new MyList(list.value * list.value, null);
        p = result;

        list = list.next;
        while (list != null){
            p.next = new MyList(list.value * list.value, null);
            list = list.next;
            p = p.next;
        }
        return result;
    }


    // LAB EXERCISE 4.4 MYLIST RECURSIVE SQUARE IMMUTATE 

    /**
     * Square the elements of a MyList. Does not mutate the MyList.
     * @param list is a MyList object.
     * @return another MyList with all of input MyList's element squared.
     */
    public static MyList recSquareList(MyList list) {

        // base case
        if (list == null) {
            return null;
        }
        if (list.next == null) {
            return new MyList(list.value * list.value, null);
        }

        // recursive step
        MyList result;
        result = new MyList(list.value * list.value, recSquareList(list.next));

        return result;
    }


    // EXERCISE 4.1 MYLIST ITERATIVE CATENATE MUTATE 

    /**
     * Catenate two MyLists, listA and listB. Mutate listA.
     * @param listA is a MyList object.
     * @param listB is a MyList object.
     * @return a list consisting of the elements of listA followed by the
     * elements of listB.
     */
    public static MyList iterCatMutList(MyList listA, MyList listB) {
        if (listA == null) {
            return listB;
        }
        if (listB == null) {
            return listA;
        }

        MyList p = listA;
        while (p.next != null) {
            p = p.next;
        }
        int i;
        for (i = 0; i < listB.iterSize(); i++, p = p.next) {
            p.next = new MyList(listB.get(i), null);
        }

        return listA;
    }


    // EXERCISE 4.2 MYLIST RECURSIVE CATENATE MUTATE 

    /**
     * Catenate two MyLists, listA and listB. Mutate listA.
     * @param listA is a MyList object.
     * @param listB is a MyList object.
     * @return a list consisting of the elements of listA followed by the
     * elements of listB.
     */
    public static MyList recCatMutList(MyList listA, MyList listB) {
        // base case
        if (listA == null) {
            return listB;
        }
        if (listB == null) {
            return listA;
        }

        // recursive
        listA.next = recCatMutList(listA.next, listB);

        if (listA.next == null) {
            listA.next = listB;
            return listA;
        }

        return listA;
    }


    // EXERCISE 4.3 MYLIST ITERATIVE CATENATE IMMUTATE 

    /**
     * Catenate two MyLists, listA and listB. Does not mutate listA.
     * @param listA is a MyList object.
     * @param listB is a MyList object.
     * @return a list consisting of the elements of listA followed by the
     * elements of listB.
     */
    public static MyList iterCatList(MyList listA, MyList listB) {
        if (listA == null) {
            return listB;
        }
        if (listB == null) {
            return listA;
        }

        MyList list = null;
        MyList p_A = listA;

        list = new MyList(p_A.value, null);
        MyList p_list = list;

        while (p_A.next != null) {
            p_A = p_A.next;
            p_list.next = new MyList(p_A.value, null);
            p_list = p_list.next;
        }

        int i = 0;
        for (; i < listB.iterSize(); i++, p_list = p_list.next) {
            p_list.next = new MyList(listB.get(i), null);
        }

        return list;
    }


    // EXERCISE 4.4 MYLIST RECURSIVE CATENATE IMMUTATE 

    /**
     * Catenate two MyLists, listA and listB. Does not mutate listA.
     * @param listA is a MyList object.
     * @param listB is a MyList object.
     * @return a list consisting of the elements of listA followed by the
     * elements of listB.
     */
    public static MyList recCatList(MyList listA, MyList listB) {
        // base case
        if (listA == null) {
            return listB;
        }
        if (listB == null) {
            return listA;
        }

        // recursive step
        MyList list;
        list = new MyList(listA.value, recCatList(listA.next, listB));

        return list;
    }





    /*
     *
     *****  Do NOT modify the codes below from the lecture notes!  *****
     *****  Only for your JUnit Testing purposes!                  *****
     *
     */


    /**
     * @return the size of the MyList iteratively.
     */
    public int iterSize() {
        MyList p = this;
        int size = 0;
        while (p != null) {
            size += 1;
            p = p.next;
        }
        return size;
    }

    /**
     * @return the size of the MyList recursively.
     */
    public int recSize() {
        // base case
        if (next == null) {
            return 1;
        }
        // recursive step
        return 1 + this.next.recSize();
    }

    /**
     * @param i is a valid index of MyList.
     * @return the ith value of this MyList.
     */
    public int get(int i) {
        // base case
        if (i == 0) {
            return value;
        }
        // recursive step
        return next.get(i - 1);
    }

    /**
     * @param args is a variable number of integers.
     * @return a new MyList containing the integers in args.
     */
    public static MyList ofEntries(Integer... args) {
        MyList result, p;
        if (args.length > 0) {
            result = new MyList(args[0], null);
        } else {
            return null;
        }
        int k;
        for (k = 1, p = result; k < args.length; k += 1, p = p.next) {
            p.next = new MyList(args[k], null);
        }
        return result;
    }

    /**
     * @param l is a MyList object.
     * @return true iff l is a MyList object containing the same sequence of
     * integers as this.
     */
    public boolean equals(Object l) {
        if (!(l instanceof MyList)) {
            return false;
        }
        MyList list = (MyList) l;
        MyList p;
        for (p = this; p != null && list != null; p = p.next, list = list.next) {
            if (p.value != list.value) {
                return false;
            }
        }
        if (p != null || list != null) {
            return false;
        }
        return true;
    }

    public String toString() {
        int size = this.recSize();
        String output= "[";
        for (int i = 0; i < size; i++) {
            output = output + this.get(i);
            if (i != size-1)
                output = output + ", ";
        }
        output = output + "]";
        return output;
    }
	
	
}
