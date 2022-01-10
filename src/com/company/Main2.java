package com.company;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main2 {

    static List<Employees> repoTotalEmployees=new ArrayList<>();
    static List<Office> repoTotalOffices=new ArrayList<>();
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        String op="y";
        while(!op.equals("q")){
            showCommands();
            op= scanner.next();
            //System.out.println(op);
            switch (op) {
                case "1" -> deleteEmployee();
                case "2" -> createEmployee();
                case "3" -> updateEmployee();
                case "4" -> showEmployee();
                case "5" -> deleteOffice();
                case "6" -> createOffice();
                case "7" -> updateOffice();
                case "8" -> showOffice();
                case "9" -> filterEmployeesAfterName();
                case "0" -> sortAfterTotal();
            }

        }
    }

    private static void sortAfterTotal() {
        repoTotalOffices.sort(new OfficeComparator());
        System.out.println(repoTotalOffices);
    }

    private static void showOffice() {
        System.out.println("Enter ort of office that gets showed\n");
        String name=scanner.next();
        for(Office e:repoTotalOffices)
            if(Objects.equals(e.getOrt(), name)){
                System.out.println(e);
            }
    }

    private static void updateOffice() {
        System.out.println("Enter ort of office that gets updated\n");
        String name=scanner.next();
        System.out.println("Enter names of employee list separated by only , (ex. Name1,Name2)(adds only existing employees)\n");
        String names=scanner.next();
        List<String> employees= Arrays.asList(names.split(","));
        List<Employees> employees1=new ArrayList<>();
        for(String nameE:employees){
            for(Employees e:repoTotalEmployees){
                if(Objects.equals(e.getName(), nameE))
                    employees1.add(e);
            }
        }
        for(Office office:repoTotalOffices)
            if(Objects.equals(office.getOrt(), name))
                office.setListe_von_Employees(employees1);
    }

    private static void createOffice() {
        System.out.println("Enter ort of office that gets created\n");
        String name=scanner.next();
        System.out.println("Enter names of employee list separated by only , (ex. Name1,Name2)(adds only existing employees)\n");
        String names=scanner.next();
        String[] employees= names.split(",");
        List<Employees> employees1=new ArrayList<>();
        for(String nameE:employees){
            for(Employees e:repoTotalEmployees){
                if(Objects.equals(e.getName(), nameE))
                    employees1.add(e);
            }
        }
        repoTotalOffices.add(new Office(name,employees1));
    }

    private static void deleteOffice() {
        System.out.println("Enter ort of office that gets deleted\n");
        String name=scanner.next();
        repoTotalOffices=repoTotalOffices.stream().filter((a)-> !Objects.equals(a.getOrt(), name)).collect(Collectors.toList());
    }

    private static void filterEmployeesAfterName(){
        //repoTotalEmployees.sort(Comparator.comparing(Employees::getName));
        //System.out.println(repoTotalEmployees);
        System.out.println("Enter name of eemployee that gets showed\n");
        String name=scanner.next();
        for(Employees e:repoTotalEmployees)
            if(Objects.equals(e.getName(), name)){
                System.out.println(e);
            }
    }

    private static void showEmployee() {
        System.out.println("Enter name of eemployee that gets showed\n");
        String name=scanner.next();
        for(Employees e:repoTotalEmployees)
            if(Objects.equals(e.getName(), name)){
                System.out.println(e);
            }
    }

    private static void updateEmployee() {
        System.out.println("Enter name of employee that gets updated\n");
        String name=scanner.next();
        System.out.println("new lohn of eemployee that gets updated\n");
        int lohn=scanner.nextInt();
        System.out.println("new anzahl stunden pro woche of eemployee that gets updated\n");
        int anzahl=scanner.nextInt();
        for(Employees e:repoTotalEmployees)
            if(Objects.equals(e.getName(), name)){
                e.setLohn(lohn);
                e.setAnzahl_Stunden_Pro_Woche(anzahl);
            }
    }

    private static void createEmployee() {
        System.out.println("Enter name of eemployee that gets created\n");
        String name=scanner.next();
        System.out.println("Enter lohn of eemployee that gets created\n");
        int lohn=scanner.nextInt();
        System.out.println("Enter anzahl stunden pro woche of eemployee that gets created\n");
        int anzahl=scanner.nextInt();
        repoTotalEmployees.add(new Employees(name,lohn,anzahl));
    }

    private static void deleteEmployee() {
        System.out.println("Enter name of employee that gets deleted\n");
        String name=scanner.next();
        repoTotalEmployees=repoTotalEmployees.stream().filter((a)-> !Objects.equals(a.getName(), name)).collect(Collectors.toList());
    }

    private static void showCommands() {
        // name/ort sind identifiers
        System.out.println("1 - delete employee\n" +
                "2 - create employee\n" +
                "3 - update employee\n" +
                "4 - show employee\n" +
                "5 - delete office\n" +
                "6 - create office\n" +
                "7 - update office\n" +
                "8 - show office\n" +
                "9 - sort employees after name\n" +
                "0 - sort office nach total lohn");
    }
}
