package lessons.lesson_30_treeSet_compareSort.compareObjects.comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PairCompareDemo {
    public static void main(String[] args) {

        Comparator<Pair> pairComparator = new PairComparatorId().thenComparing(new PairComparatorName());

        Set<Pair> pairSetCompareSet = new TreeSet<>(pairComparator);

        pairSetCompareSet.add(new Pair(1,"Black"));
        pairSetCompareSet.add(new Pair(2,"White"));
        pairSetCompareSet.add(new Pair(3,"Red"));
        pairSetCompareSet.add(new Pair(4,"Black-White"));
        pairSetCompareSet.add(new Pair(5,"Blue"));

        System.out.println(pairSetCompareSet);

    }

}
