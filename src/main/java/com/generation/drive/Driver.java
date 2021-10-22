package com.generation.drive;

public class Driver {
    //Atributos de clase
    //Se agrega final para que una vez definido no se pueda cambiar
    private final String name;
    private final String id;
    private final double fee;
    private double balance;
    private boolean isAvailable = false;


    //Constructor
    public Driver( String name, String id, double fee ){
        this.name = name;
        this.id = id;
        this.fee = fee;
    }

    public void startTrip(){
        isAvailable = false;
    }

    public void endTrip(){
        isAvailable = true;
        balance += balance;
    }

    //Métodos get y set
    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }

    public double getFee(){
        return fee;
    }

    public double getBalance(){
        return balance;
    }

    public boolean isAvailable(){
        return isAvailable;
    }
}
