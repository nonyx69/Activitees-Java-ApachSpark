package com.tyrostudent.intranet;

public class Security {

    public static boolean checkAccess(Boolean[] args) {

        int age = 20;
        boolean hasBadge = true;

        if (age > 18 || !hasBadge){
            return false;
        }
        else{
            return true;
        }
    }
}
