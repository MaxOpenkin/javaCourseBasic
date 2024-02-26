package lessons.lesson_30_treeSet_compareSort.compareObjects.comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PairCompareDemo {
    public static void main(String[] args) {

        Comparator<Pair> pairComparatorId = new PairComparatorId();

        Set<Pair> pairSetCompareId = new TreeSet<>(pairComparatorId);

        pairSetCompareId.add(new Pair(1,"Black"));
        pairSetCompareId.add(new Pair(2,"White"));
        pairSetCompareId.add(new Pair(3,"Red"));
        pairSetCompareId.add(new Pair(4,"Black-White"));
        pairSetCompareId.add(new Pair(5,"Blue"));

        System.out.println(pairSetCompareId);


        Comparator<Pair> pairComparatorName = new PairComparatorName();
        Set<Pair> pairSetCompareName = new TreeSet<>(pairComparatorName);

        pairSetCompareName.add(new Pair(1,"Black"));
        pairSetCompareName.add(new Pair(2,"White"));
        pairSetCompareName.add(new Pair(3,"Red"));
        pairSetCompareName.add(new Pair(4,"Black-White"));
        pairSetCompareName.add(new Pair(5,"Blue"));

        System.out.println(pairSetCompareName);


    }
}
