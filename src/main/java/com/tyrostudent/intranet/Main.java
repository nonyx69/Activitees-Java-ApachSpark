package com.tyrostudent.intranet;

public class Main {

    public static void main(String[] args){
        int age = 20;
        boolean hasBadge = true;
        String[] membres = {"Maxime", "Arnaud", "Esteban"};

        HR.loginCooldown();
        boolean isGranted = Security.CheckAccess(age, hasBadge);

        if(isGranted){
            System.out.println("Bienvenue sur l'intranet");

            HR.displayTeam(membres);
        }else{
            System.out.println("Alerte intrusion");
        }
    }
}