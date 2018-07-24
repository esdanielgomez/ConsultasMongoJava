/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAVID
 */
public class Conexion {
    
    private MongoClient mongo ;
    public static String nombreBaseDatos = "repl0";
    public static String nombreColeccion = "bdRegistro";

    public Conexion() {
    }

    
    public Conexion(String ip, int puerto) {
         mongo = new MongoClient(ip, puerto);
    }
    public Conexion(List<ServerAddress> miembrosCluster) {
         mongo = new MongoClient(miembrosCluster);
    }

    public List<String> obtenerListaBD() {

        return mongo.getDatabaseNames();
    }

    public Set<String> obtenerListaBD(String dbName) {

        return mongo.getDB(dbName).getCollectionNames();
    }

    public boolean insertarRegistros(String nombreDB, String coleccion, String path) {
        try {
            DB db = mongo.getDB(nombreDB);
            DBCollection items = db.getCollection(coleccion);
            int cont = 0;
            BufferedReader rd = null;

            rd = new BufferedReader(new FileReader(path));
            String linea;
            linea = rd.readLine();
            String cabezera[] = linea.split(",");
            String[] auxLinea;
            while (linea != null) {
                linea = rd.readLine();
                if (linea != null) {
                    BasicDBObject doc = new BasicDBObject();

                    auxLinea = linea.split(",");
                    for (int i = 0; i < auxLinea.length; i++) {
                        doc.put(cabezera[i], auxLinea[i]);
                    }
                    items.insert(doc);
                    //System.out.println(auxLinea[1]);
                }
                cont++;

            }
            System.out.println(cont);

            rd.close();

            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public void insertarRegistro(String coleccion, BasicDBObject documentDetail){
        
        DB db = mongo.getDB(nombreBaseDatos);
        DBCollection collection = db.getCollection(coleccion);
	collection.insert(documentDetail);
    
    }


    public DBCursor extraerDocumentos(String nombreDB, String coleccion) {
        DB db = mongo.getDB(nombreDB);
        DBCollection items = db.getCollection(coleccion);

        DBCursor doc = items.find();
        
        return doc;
        
        // System.out.println("--- "+items.find().);
    }
     public Set<String> extraerCabezerasDocumentos(String nombreDB, String coleccion) {
        
        DB db = mongo.getDB(nombreDB);
        DBCollection items = db.getCollection(coleccion);

        DBObject doc =  items.findOne();
        return doc.keySet();
        
    }
     
     
     
     
     public void eliminarColeccion(String nombreDB, String coleccion) {
        DB db = mongo.getDB(nombreDB);
        DBCollection items = db.getCollection(coleccion);
        items.drop();
        
        
    }
     
     public DBObject buscarRegistro(String nombreBD, String coleccion, BasicDBObject documentDetail){
        
        //MongoDatabase db = mongo.getDatabase(nombreBD);
        //MongoCollection collection = db.getCollection(coleccion);
        
		DB db = mongo.getDB(nombreBD);
		DBCollection coll = db.getCollection(coleccion);

		// creates new db object
		BasicDBObject b1 = new BasicDBObject();

		// criteria to display only name and color fields in the resultant
		// document
		

		// method that retrieves the documents by accepting fields and object
		// criteria
		return coll.findOne(b1, documentDetail);

    
    }
     
     
      
    
}
