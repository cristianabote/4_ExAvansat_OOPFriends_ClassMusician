package com.company;

public class Musician extends Person {
    //Implementati clasa Musician prin mostenirea clasei Person.Se precizeaza urmatoarele caracteristici suplimentare
    // ale muzicianului: instrument(ex: chitara, tobe), musicalType(ex: clasic,rock),status(active, inactive).
    //Pentru clasa Musician introduceti o metoda constructor care permite initializarea atributelor cu valori transmise
    // prin intermediul parametrilor metodei, o metoda constructor care apeleaza constructorul din superclasa si care
    // permite initializare atributelor cu valori citite de la tastatura , o metoda schimba atributul stare(ex din
    // inactiv in activ, o metoda care afiseaza starea unui element de tip Musician, si metode de tip set pentru toate
    // atributele clasei Musician.
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


    private String instrument;
    private String musicalType;
    private String status;

    public Musician(String name, int age, String instrument, String musicalType, String status) {
        super(name, age);
        this.instrument = instrument;
        this.musicalType = musicalType;
        this.status = status;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public void setMusicalType(String musicalType) {
        this.musicalType = musicalType;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInstrument() {
        return this.instrument;
    }

    public String getMusicalType() {
        return this.musicalType;
    }

    public String getStatus() {
        return this.status;
    }

    public String toString() {
        return "Numele muzicianului este: " + super.getName() + " are " + super.getAge() + " ani si canta la " + this.instrument + " genul de muzica: " + this.musicalType + " fiind " + this.status;

    }

    public void exchangeStatus() {
        if (this.getStatus().equals("activ")) {
            setStatus("inactiv");
        } else {
            if (this.getStatus().equals("inactiv")) {
                setStatus("activ");
            }
        }
    }

    public void previewStatus() {
        System.out.println("Statusul persoanei " + this.getName() + " este: " + this.status);
    }

    public void activeMusician() {
        if (this.status.equals("activ")) {
            System.out.println( "Muzicianul " + super.getName() + " are statusul de: " + this.status);
        }
    }
}

