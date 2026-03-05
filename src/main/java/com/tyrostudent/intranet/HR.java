package com.tyrostudent.intranet;

public class HR {

    public static void loginCountdown(String[] args){

        for (int i = 3; i > 0; i--) {
            System.out.println("Connexion dans " + i );
        }
    }
    public static void displayTeam(String[] teamMembre) {

        for(String employe : teamMembre){
            System.out.println("Employé : " + employe);
        }
    }
}
