package com.company;

import java.util.Comparator;

class OfficeComparator implements Comparator<Office> {

    @Override
    public int compare(Office o1, Office o2) {
        int sum1 = o1.getListe_von_Employees().stream().mapToInt(Employees::getLohn).sum();
        int sum2 = o2.getListe_von_Employees().stream().mapToInt(Employees::getLohn).sum();
        return Integer.compare(sum1,sum2);
    }
}
