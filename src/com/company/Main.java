package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //Implementati clasa Musician prin mostenirea clasei Person.Se precizeaza urmatoarele caracteristici suplimentare
    // ale muzicianului: instrument(ex: chitara, tobe), musicalType(ex: clasic,rock),status(active, inactive).
    //Pentru clasa Musician introduceti o metoda constructor care permite initializarea atributelor cu valori transmise
    // prin intermediul parametrilor metodei, o metoda constructor care apeleaza constructorul din superclasa si care
    // permite initializare atributelor cu valori citite de la tastatura , o metoda schimba atributul stare(ex din
    // inactiv in activ in cazul in care are peste 40 ani), o metoda care afiseaza starea unui element de tip Musician,
    // si metode de tip set pentru toate atributele clasei Musician.
    //Definiti in metoda principala a clasei Musician un tablou cu 3 instante ale clasei Musician (folosind amandoi
    // constructorii).Modificati starea unui musician.Afisati doar muzicienii activi.
    //Structura de implementare:
    //*implementare si mostenire Person.
    //*constructor
    //*constructor cu citire de la tastatura
    //*metoda schimbare stare
    //*metoda afisare
    //*metode set
    //*main: instantierea obiectelor, instantiere vectori, modificare stare,  afisare musicieni activi.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti numarul de persoane din grup: ");
        int numberOfPersons = scan.nextInt();
        Musician[] personGroup = new Musician[numberOfPersons];
        personGroup[0]= new Musician("Cristiana", 30, "flaut", "rock", "activ");
        personGroup[1]= new Musician("Cristi", 60, "chitara", "rock", "activ");
        personGroup[2]= new Musician("Flavia", 55, "trompeta", "rock", "inactiv");

        for (int i = 3; i < numberOfPersons; i++) {
            System.out.println("Introduceti numele persoanei " + (i + 1));
            String name = scan.next();
            System.out.println("Introduceti varsta persoanei " + (i + 1));
            int age = scan.nextInt();
            System.out.println("Introduceti instrumentul la care canta: ");
            String instrument = scan.next();
            System.out.println("Introduceti genul de muzica: ");
            String musicalType = scan.next();
            System.out.println("Introduceti statusul persoanei: activ/inactiv: ");
            String status = scan.next();

            Musician person = new Musician(name, age, instrument, musicalType, status);
            personGroup[i] = person;
                /*    if(personGroup[i].getStatus() !="active" || personGroup[i].getStatus()!="inactive"){
                System.out.println("Ati introdus un status eronat.");
                break;
            }*/
        }
        // Arrays.sort(personGroup);
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println(personGroup[i].toString());          //afisarea tuturor muzicienilor cu statusul lor real
            if(personGroup[i].getAge()>40){                         //modificarea statusului muzicienilor care depasesc 40ani
                personGroup[i].exchangeStatus();
            }



          /*  if(personGroup[i].getAge()<25)
                System.out.println(personGroup[i].toString()+" is going to the Mall.");
            if(personGroup[i].getAge()>=25&&personGroup[i].getAge()<30)
                System.out.println(personGroup[i].toString()+" is partying tonight.");
            if(personGroup[i].getAge()>=30&&personGroup[i].getAge()<=40)
                System.out.println(personGroup[i].toString()+" is going to the theatre.");
            if(personGroup[i].getAge()>40)
                System.out.println(personGroup[i].toString()+" is staying home tonight.");*/
        }
        System.out.println(" ");
        for (int i = 0; i < numberOfPersons; i++) { //vizualizarea statusului fiecarui muzician
            personGroup[i].previewStatus();
       }

        System.out.println(" ");
        System.out.println("Toti muzicienii activi sunt urmatorii: ");
        for (int i = 0; i < numberOfPersons; i++) { //vizualizarea muzicienilor activi
            personGroup[i].activeMusician();
        }

    }
}

