/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author karyj
 */
public class Registro {

    
    public void registrarUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
    // Método para leer los datos y guardarlos en un archivo CSV
    public void registrarUsuario(String nombre, int edad, String tipoDocumento, String numDocumento, String email, String celular, boolean estado, String curso, String evento) throws Exception {
         
        
        // Crear el archivo CSV
        try (FileWriter csvWriter = new FileWriter("RegistroUsuario.csv", true)) {
            csvWriter.append(numDocumento);
            csvWriter.append(";");
            csvWriter.append(nombre);
            csvWriter.append(";");
            csvWriter.append(String.valueOf(edad));
            csvWriter.append(";");
            csvWriter.append(tipoDocumento);
            csvWriter.append(";");
            csvWriter.append(email);
            csvWriter.append(";");
            csvWriter.append(celular);
            csvWriter.append(";");
            csvWriter.append(String.valueOf(estado));
            csvWriter.append(";");
            csvWriter.append(curso);
            csvWriter.append(";");
            csvWriter.append(evento);
            csvWriter.append("\n");
            csvWriter.flush();
        } catch (IOException ex) {
            throw new Exception("Error al registrar el usuario.", ex);
        }
    }

    
    
    
}
