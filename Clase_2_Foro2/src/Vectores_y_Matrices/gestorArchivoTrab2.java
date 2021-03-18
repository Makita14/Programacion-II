package Vectores_y_Matrices;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class gestorArchivoTrab2 {
	
	static BufferedReader entradaArchivo = null;
    static BufferedWriter salidaArchivo = null;

    public static void guardar(String nombreTrab, String nombreArch){

        try {
            salidaArchivo = new BufferedWriter(new FileWriter(
                    "C:/MisFicheros/"+nombreTrab));

            salidaArchivo.write(nombreArch);

        } catch (IOException ex) {
            Logger.getLogger(gestorArchivoTrab2.class.getName()).log(
                    Level.SEVERE, null, ex);
        }finally{
            if(salidaArchivo!=null){
                try {
                    salidaArchivo.close();
                } catch (IOException ex) {
                    Logger.getLogger(gestorArchivoTrab2.class.getName()).log(
                            Level.SEVERE, null, ex);
                }
            }
        }
    }

   public static String cargar(String nombre){

        String linRetorno = "";
        try {
            entradaArchivo = new BufferedReader(new FileReader(
                    "C:/MisFicheros/"+nombre));
            linRetorno = entradaArchivo.readLine();
        } catch (IOException ex) {
            Logger.getLogger(gestorArchivoTrab2.class.getName()).log(
                    Level.SEVERE, null, ex);
        }finally{
            if(entradaArchivo != null)
                try {
                    entradaArchivo.close();
                } catch (IOException ex) {
                    Logger.getLogger(gestorArchivoTrab2.class.getName()).log(
                            Level.SEVERE, null, ex);
                }
        }
        return linRetorno;
    }

    static String empaquetador(ArrayList<String> empa, String separador){

        String paquete = "";
        for(int i = 0 ; i<empa.size()-1;i++){
            paquete = paquete+empa.get(i)+separador;
        }
        paquete = paquete+empa.get(empa.size()-1);
        return paquete;
    }

    static ArrayList<String> desempaquetador(
            String paquete, String separador){

        ArrayList<String> miAList2 = new ArrayList<>();
        String [] mivector = paquete.split(separador);

        for(int i = 0; i<mivector.length;i++){
            miAList2.add(mivector[i]);
        }
        return miAList2;
    }

    /**Este m�todo guarda un ArrayList en disco.
     * @param miArray: El ArrayList que ser� guardado.
     * @param nombreArchivo: El nombre de archivo con el que ser� guardado en C:/MisFicheros. Si la carpeta no est� debe crearla.
     */
    public static void guardarArray(ArrayList miArray,String nombreArchivo){
        
        /** Recibe como argumentos un objeto ArrayList y un String para
         * el nombre del archivo.
         * El archivo ser� guardado en la ruta: C:MisFicheros
         *  si no tiene esa carpeta debe crearla y darle los atributos adecuados
         */
        String empaquetado = empaquetador(miArray,"#");
        guardar(nombreArchivo, empaquetado);
    }

    /**Este m�todo recupera del disco un ArrayList.
     * @param nombreArchivo:  Es el el nombre del archivo que ser� leido desde el dicos.  Debe estar almacenado en la ruta C:MisFichechos.
     * @return Devolver� un objeto de la clase ArrayList.
     */
    public static ArrayList cargarArray(String nombreArchivo){
       String leido = cargar(nombreArchivo);
       ArrayList<String> retorno = desempaquetador(leido,"#");
       return retorno;
    }
}