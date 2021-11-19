package com.example.Tarea2_4_Aplicacion_Firma_Digital.ConectorBD;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.Tarea2_4_Aplicacion_Firma_Digital.transacciones.Transacciones;


public class SQLiteConexion extends SQLiteOpenHelper{

    public SQLiteConexion(Context context, String dbname, SQLiteDatabase.CursorFactory factory, int version){
        super(context,dbname,factory,version);


    }

    @Override
    public void onCreate(SQLiteDatabase db) {
            db.execSQL(Transacciones.CreateTablePersonas);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL(Transacciones.DropTablePersonas);
            onCreate(db);
    }


}
