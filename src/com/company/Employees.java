package com.company;

class Employees{
    String Name;
    int Lohn;
    int Anzahl_Stunden_Pro_Woche;

    public Employees(String name, int lohn, int anzahl_Stunden_Pro_Woche) {
        Name = name;
        Lohn = lohn;
        Anzahl_Stunden_Pro_Woche = anzahl_Stunden_Pro_Woche;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getLohn() {
        return Lohn;
    }

    public void setLohn(int lohn) {
        Lohn = lohn;
    }

    public int getAnzahl_Stunden_Pro_Woche() {
        return Anzahl_Stunden_Pro_Woche;
    }

    public void setAnzahl_Stunden_Pro_Woche(int anzahl_Stunden_Pro_Woche) {
        Anzahl_Stunden_Pro_Woche = anzahl_Stunden_Pro_Woche;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "Name='" + Name + '\'' +
                ", Lohn=" + Lohn +
                ", Anzahl_Stunden_Pro_Woche=" + Anzahl_Stunden_Pro_Woche +
                '}';
    }
}
