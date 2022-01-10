package com.company;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Office{
    String Ort;
    List<Employees> Liste_von_Employees;

    public Office(String ort, List<Employees> liste_von_Employees) {
        Ort = ort;
        Liste_von_Employees = liste_von_Employees;
    }

    public String getOrt() {
        return Ort;
    }

    public void setOrt(String ort) {
        Ort = ort;
    }

    public List<Employees> getListe_von_Employees() {
        return Liste_von_Employees;
    }

    public void setListe_von_Employees(List<Employees> liste_von_Employees) {
        Liste_von_Employees = liste_von_Employees;
    }

    @Override
    public String toString() {
        return "Office{" +
                "Ort='" + Ort + '\'' +
                ", Liste_von_Employees=" + Liste_von_Employees +
                '}';
    }
}

