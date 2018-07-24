/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import static Datos.Conexion.nombreBaseDatos;
import static Datos.Conexion.nombreColeccion;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author DAVID
 */
public class Datos {
    public static String nombreBaseDatos = "repl0";
    public static String nombreColeccion = "Vuelo";
    public static List<ServerAddress> miembros = new ArrayList<ServerAddress>();
    
    private MongoClient mongo ;
    
    public static void inicializarMiembros(){
        miembros.add(new ServerAddress("192.168.1.10",27017));
        miembros.add(new ServerAddress("192.168.1.11",27017));
        miembros.add(new ServerAddress("192.168.1.12",27017));
        miembros.add(new ServerAddress("192.168.1.13",27017));
    }
    
    public static ArrayList<ArrayList<String>> getDocumentos(){
      
        inicializarMiembros();
        Conexion conexion = new Conexion(miembros);
        
        DBCursor doc = conexion.extraerDocumentos(nombreBaseDatos, nombreColeccion);
        Set set = conexion.extraerCabezerasDocumentos(nombreBaseDatos, nombreColeccion);
        
        ArrayList<ArrayList<String>> registros = new ArrayList();
        int h = 0;
        for (Iterator iterator = doc.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            //{ "_id" : { "$oid" : "5b3eb6a4a2df1a2c389998ce" }, "cedula" : "0111111111", "nombre" : "Daniel", "apellido" : "Gomez", "telefono" : "1234567" }
            
            ArrayList<String> atributosFila = new ArrayList();
            String fila[] = next.toString().split(",");
            for(int i=1; i<fila.length; i++){
                String subfila[] = fila[i].split(":");
                String atributo = subfila[1].replaceAll("\\\"", "").replace("}", "");
                atributosFila.add(atributo);
            }
            registros.add(atributosFila);
        }
        
        return registros;
        
    }
    
    public static void insertarRegistro(String cedula, String nombre, String apellido, String telefono){
       
        inicializarMiembros();
        Conexion conexion = new Conexion(miembros);

	BasicDBObject documentDetail = new BasicDBObject();
	documentDetail.put("cedula", cedula);
        documentDetail.put("_id", cedula);
        
	documentDetail.put("nombre", nombre);
	documentDetail.put("apellido", apellido);
        documentDetail.put("telefono", telefono);

        conexion.insertarRegistro("bdRegistro", documentDetail);
	
    }
    
    public static ArrayList<String> buscarRegistro(String cedula){
       
        inicializarMiembros();
        Conexion conexion = new Conexion(miembros);

	BasicDBObject documentDetail = new BasicDBObject();
        documentDetail.put("_id", cedula);
        documentDetail.put("cedula", cedula);
        documentDetail.put("nombre", "");
        documentDetail.put("apellido", "");
        documentDetail.put("telefono", "");

        DBObject resultado = conexion.buscarRegistro(nombreBaseDatos,nombreColeccion, documentDetail);
        
        ArrayList<String> listado = new ArrayList();
        listado.add(resultado.get("cedula").toString());
        listado.add(resultado.get("nombre").toString());
        listado.add(resultado.get("apellido").toString());
        listado.add(resultado.get("telefono").toString());
        
        return listado;
	
    }
    
    public static String consultarRetrasoArribo(String anio, String mes, String origen, String destino){
       
        inicializarMiembros();
        Conexion conexion = new Conexion(miembros);
        
        String nombreColecc = "Vuelo_A";

	BasicDBObject documentDetail = new BasicDBObject();
        documentDetail.put("_id.Year", anio);
        documentDetail.put("_id.Month", mes);
        documentDetail.put("_id.Origin", mes);
        documentDetail.put("_id.Dest", mes);

        DBObject resultado = conexion.buscarRegistro(nombreBaseDatos,nombreColecc, documentDetail);
        return resultado.get("Atrasos").toString();
    }
    
    public static String consultarRetrasoSalida(String anio, String mes, String origen, String destino){
       
        inicializarMiembros();
        Conexion conexion = new Conexion(miembros);
        
        String nombreColecc = "Vuelo_S";

	BasicDBObject documentDetail = new BasicDBObject();
        documentDetail.put("_id.Year", anio);
        documentDetail.put("_id.Month", mes);
        documentDetail.put("_id.Origin", mes);
        documentDetail.put("_id.Dest", mes);

        DBObject resultado = conexion.buscarRegistro(nombreBaseDatos,nombreColecc, documentDetail);
        return resultado.get("Atrasos").toString();
    }

    public static void main(String[] args) {
        System.out.println(buscarRegistro("06"));
    }
}
