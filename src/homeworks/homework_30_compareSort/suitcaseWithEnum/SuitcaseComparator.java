package homeworks.homework_30_compareSort.suitcaseWithEnum;

import java.util.Comparator;

public class SuitcaseComparator implements Comparator<Suitcase> {

    @Override
    public int compare(Suitcase suitcase, Suitcase otherSuitcase) {

        int sizeCompare = suitcase.getSize().compareTo(otherSuitcase.getSize());
        if (sizeCompare != 0) return sizeCompare;

        int materialCompare = suitcase.getMaterial().compareTo(otherSuitcase.getMaterial());
        if (materialCompare != 0) return materialCompare;

        return suitcase.getColor().compareToIgnoreCase(otherSuitcase.getColor());
    }

}
