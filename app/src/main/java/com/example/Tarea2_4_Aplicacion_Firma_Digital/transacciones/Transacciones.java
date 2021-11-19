package com.example.Tarea2_4_Aplicacion_Firma_Digital.transacciones;

public class Transacciones {

    /* tablas */
    public static final String tablaimagenes = "imagenes";
    /* Campos */
    public static final String id = "id";
    public static final String imagen = "imagen";
    public static final String descripcion = "descripcion";

    /* tablas - CREATE , DROP */
    // INTEGER
    public static final String CreateTablePersonas = "CREATE TABLE imagenes( id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, imagen BLOB, descripcion TEXT)";
//ruta TEXT
    public static final String DropTablePersonas = "DROP TABLE IF EXISTS imagenes";

    /* Creacion del nombre de la base de datos */
    public static final String NameDataBase = "DBCurso.db";

}
