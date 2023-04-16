package com.example.pets.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class PetDBHelper extends SQLiteOpenHelper {
    public String sqlcreate = "CREATE TABLE " + PetContract.InnerPet.TABLE_NAME + " (" +
            PetContract.InnerPet.CONSTANT_ID + " INTEGER PRIMARY KEY, " + PetContract.InnerPet.CONSTANT_NAME + " TEXT, " +
            PetContract.InnerPet.CONSTANT_BREED + " TEXT, " + PetContract.InnerPet.CONSTANT_GENDER + " TEXT, " +
            PetContract.InnerPet.CONSTANT_WEIGHT + " TEXT" + ")";

    public String deletesql = "DROP TABLE IF EXISTS" + PetContract.InnerPet.TABLE_NAME;

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Pets.db";

    public PetDBHelper(Context context)  {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase SQLDBobj) {
        SQLDBobj.execSQL(sqlcreate);
    }

    @Override
    public void onUpgrade(SQLiteDatabase SQLDBobj, int oldversion, int newversion) {
        SQLDBobj.execSQL(sqlcreate);
        onCreate(SQLDBobj);
    }

    public void onDowngrade(SQLiteDatabase SQLDBobj, int oldversion, int newversion) {
        onUpgrade(SQLDBobj, oldversion, newversion);
    }
}
