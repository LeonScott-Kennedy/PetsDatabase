package com.example.pets.Data;

import android.provider.BaseColumns;

public final class PetContract {

    // Private constructor of the outer class
    private PetContract(){};

    // Inner custom class that implements the Interface Basecolumns
    public static class InnerPet implements BaseColumns{
        public static String TABLE_NAME = "Pets";

        public static String CONSTANT_ID = BaseColumns._ID;
        public static String CONSTANT_NAME = "Name";
        public static String CONSTANT_BREED = "Breed";
        public static String CONSTANT_GENDER = "Gender";
        public static String CONSTANT_WEIGHT = "Weight";

        public static int CONSTANT_GENDER_UNKNOWN = 0;
        public static int CONSTANT_GENDER_MALE = 1;
        public static int CONSTANT_GENDER_FEMALE = 2;
    }
}
