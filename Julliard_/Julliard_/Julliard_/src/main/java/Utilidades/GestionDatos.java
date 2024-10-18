/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import javax.swing.JOptionPane;
import java.awt.Component;

/**
 *
 * @author karyj
 */
public class GestionDatos {

    private List<Usuario> usuarios;

    public GestionDatos() {
        usuarios = new ArrayList<>();  // Inicialización

    }

    // Método para leer el archivo CSV
    public List<Usuario> leerCSV(String rutaArchivo) {
        
        usuarios = new ArrayList<Usuario>();
        String linea;
        try (BufferedReader br = new BufferedReader(new FileReader("RegistroUsuario.csv"))) {
            br.readLine();
            while ((linea = br.readLine()) != null) {
                
                // Separar por punto y coma
                String[] valores = linea.split(";", -1);
                
                String numDocumento = valores[0];
                String nombre = valores[1];
                int edad = Integer.parseInt(valores[2]);
                String tipoDocumento = (String)valores[3];
                String email = valores[4];
                String celular = valores[5];
                boolean estado = Boolean.parseBoolean(valores[6]);
                String curso = valores[7];
                String evento = valores[8];

                Usuario usuario = new Usuario(nombre, edad, tipoDocumento, numDocumento, email, celular, estado, curso, evento);
                // Agregar el usuario a la lista
                usuarios.add(usuario);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return usuarios;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public Usuario buscarID(String numDocumento) {
        for (Usuario usuario : usuarios) {

            if (usuario.getNumeroDocumento().equals(numDocumento)) {
                return usuario;  // Usuario encontrado
            }
        }
        return null;  // Usuario no encontrado
    }
        
    public boolean actualizarUsuario(String numDocumento, Usuario nuevosDatos) {
        
        boolean actualizado = false;
        
        for (Usuario usuario : usuarios) {
            if (usuario.getNumeroDocumento().equals(numDocumento)) {
                // Actualizar los atributos del usuario
                usuario.setNombre(nuevosDatos.getNombre());
                usuario.setEdad(nuevosDatos.getEdad());
                usuario.setTipoDocumento(nuevosDatos.getTipoDocumento());
                usuario.setEmail(nuevosDatos.getEmail());
                usuario.setCelular(nuevosDatos.getCelular());
                usuario.setEstado(nuevosDatos.isEstado());
               
                
                actualizado = true;  // Usuario actualizado
            }
        }
        return actualizado;  // Usuario no encontrado
    }
    
    public void guardarEnCSV(String rutaArchivo) {
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
            // Escribir encabezado (si es necesario)
            bw.write("Identificacion;Nombre;Edad;Tipo_ID;Email;Celular;Estado;Curso;Evento\n");

            // Escribir los datos de cada usuario
            for (Usuario usuario : usuarios) {
                bw.write(String.join(";", 
                    usuario.getNumeroDocumento(),
                    usuario.getNombre(),
                    String.valueOf(usuario.getEdad()),
                    usuario.getTipoDocumento(),
                    usuario.getEmail(),
                    usuario.getCelular(),
                    String.valueOf(usuario.isEstado()),
                    usuario.getCurso(),
                    usuario.getEvento()) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Usuario buscarParaEliminar(String numDocumento, String curso) {
        
        
        for (Usuario usuario : usuarios) {
            if(usuario.getNumeroDocumento().equals(numDocumento)){
                if(usuario.getCurso().equals(curso)){
                    //Usuario usuarioAEliminar = usuario;
                    return usuario;  // Usuario encontrado
                }
            }
        }return null;  // Usuario no encontrado
    }
    
    public Usuario buscarConEvento(String numDocumento, String evento) {
  
        for (Usuario usuario : usuarios) {
            if(usuario.getNumeroDocumento().equals(numDocumento)){
                if(usuario.getEvento().equals(evento)){                
                    return usuario;  // Usuario encontrado
                }
            }
        }return null;  // Usuario no encontrado
    }
    
    public Usuario buscarConCurso(String numDocumento, String curso) {

        for (Usuario usuario : usuarios) {
            if(usuario.getNumeroDocumento().equals(numDocumento)){
                if(usuario.getCurso().equals(curso)){
                    return usuario;  // Usuario encontrado
                }
            }
        }return null;  // Usuario no encontrado
    }
    
    public void eliminarUsuario(String numDocumento, String curso) {
       
        Usuario usuarioAEliminar = buscarConCurso(numDocumento, curso); // Buscar al usuario

        if (usuarioAEliminar != null) {
            usuarios.remove(usuarioAEliminar); // Eliminar el usuario encontrado

            guardarEnCSV("RegistroUsuario.csv"); // Guardar cambios en el archivo CSV
        }
    }
    
    public boolean estaRegistradoEnCurso(String numDocumento, String curso) {
        Usuario usuario = buscarID(numDocumento);

        // Verificar si el usuario o su curso son null.
        if (usuario == null || usuario.getCurso() == null || curso == null) {
            return false;  // No está registrado o falta algún dato.
        }

        // Realizar la comparación segura.
        return usuario.getCurso().equalsIgnoreCase(curso);
    }

    public boolean estaRegistradoEnEvento(String numDocumento, String evento) {
        Usuario usuario = buscarID(numDocumento);

        // Verificar si el usuario o su evento son null.
        if (usuario == null || usuario.getEvento() == null || evento == null) {
            return false;  // No está registrado o falta algún dato.
        }

        // Realizar la comparación segura.
        return usuario.getEvento().equalsIgnoreCase(evento);
    }


    public void crearPdfConstanciaCurso(Component parentComponent,String nombre, String tipoId, String id, String curso) { 
    // parentComponent permite obtener el index sobre cual se trabaja para manejar las ventanas emergentes de las excepciones desde el metodo
        Document doc = new Document(); //instanciamos un documento
        try {
            File archivoPDF = new File("ConstanciaCurso.pdf");
            if (archivoPDF.exists() && !archivoPDF.renameTo(archivoPDF)) {
                throw new IOException("El archivo ya está siendo utilizado por otro proceso.");
            }            
            
            Font tipo1 = FontFactory.getFont(BaseFont.TIMES_ROMAN, 20, BaseColor.BLACK);
            Font tipo2 = FontFactory.getFont(BaseFont.TIMES_ROMAN, 17, BaseColor.BLACK);
            Font tipo3 = FontFactory.getFont(BaseFont.TIMES_ROMAN, 15, BaseColor.BLACK);
            
            PdfWriter.getInstance(doc, new FileOutputStream("Constancia.pdf")); //generamos el documento
            doc.open();

            Paragraph titulo = new Paragraph("CONSTANCIA DE MATRÍCULA", tipo1);
            titulo.setAlignment(Element.ALIGN_CENTER); // metodo para centrar el parrafo
            titulo.setSpacingAfter(25f);  // metodo para espaciar entre parrafos
            doc.add(titulo);
            
            Paragraph subtitulo = new Paragraph("LA ACADEMIA JUILLIARD DE LA CIUDAD DE MEDELLÍN", tipo2);
            subtitulo.setAlignment(Element.ALIGN_CENTER);
            subtitulo.setSpacingAfter(15f);  
            doc.add(subtitulo);
            
            Paragraph subtitulo2 = new Paragraph("CERTIFICA:", tipo2);
            subtitulo2.setAlignment(Element.ALIGN_CENTER);
            subtitulo2.setSpacingAfter(15f);  
            doc.add(subtitulo2);
            
            Paragraph cuerpo = new Paragraph("Que "+nombre+" identificado con "+tipoId+" "+id+" está matriculado en el curso "+curso+", programado para el semestre 2024/2.", tipo3);
            cuerpo.setAlignment(Element.ALIGN_CENTER);  
            doc.add(cuerpo);

            doc.addAuthor("ConstanciaCurso");
            JOptionPane.showMessageDialog(parentComponent, "Constancia de matrícula descargada con éxito", "Constancia de matrícula", JOptionPane.INFORMATION_MESSAGE);
        } catch (DocumentException e) {
            //manejo de error con la creación del documento
            JOptionPane.showMessageDialog(parentComponent, "Error al crear el documento PDF: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } catch (IOException e) {
            //manejo de excepcion de archivo en uso
            JOptionPane.showMessageDialog(parentComponent, "Debes cerrar el PDF en tus otras aplicaciones para poder descargar uno nuevo.\nVuelve a presionar el botón de descargar cuando hayas cerrado el archivo PDF.", "Archivo en uso", JOptionPane.WARNING_MESSAGE);
            e.printStackTrace();
        } finally {
            if (doc.isOpen()) {
                doc.close();
            }
        }
    }
    
    public void crearPdfConstanciaEvento(Component parentComponent,String nombre, String tipoId, String id, String evento) {
        Document doc = new Document();
        try {
            File archivoPDF = new File("ConstanciaEvento.pdf");
            if (archivoPDF.exists() && !archivoPDF.renameTo(archivoPDF)) {
                throw new IOException("El archivo ya está siendo utilizado por otro proceso.");
            }            
            
            Font tipo1 = FontFactory.getFont(BaseFont.TIMES_ROMAN, 20, BaseColor.BLACK);
            Font tipo2 = FontFactory.getFont(BaseFont.TIMES_ROMAN, 17, BaseColor.BLACK);
            Font tipo3 = FontFactory.getFont(BaseFont.TIMES_ROMAN, 15, BaseColor.BLACK);
            
            PdfWriter.getInstance(doc, new FileOutputStream("Constancia.pdf")); //generamos el documento
            doc.open();

            Paragraph titulo = new Paragraph("CONSTANCIA DE INSCRIPCIÓN", tipo1);
            titulo.setAlignment(Element.ALIGN_CENTER); // metodo para centrar el parrafo
            titulo.setSpacingAfter(25f);  // metodo para espaciar entre parrafos
            doc.add(titulo);
            
            Paragraph subtitulo = new Paragraph("LA ACADEMIA JUILLIARD DE LA CIUDAD DE MEDELLÍN", tipo2);
            subtitulo.setAlignment(Element.ALIGN_CENTER);
            subtitulo.setSpacingAfter(15f);  
            doc.add(subtitulo);
            
            Paragraph subtitulo2 = new Paragraph("CERTIFICA:", tipo2);
            subtitulo2.setAlignment(Element.ALIGN_CENTER);
            subtitulo2.setSpacingAfter(15f);  
            doc.add(subtitulo2);
            
            Paragraph cuerpo = new Paragraph("Que "+nombre+" identificado con "+tipoId+" "+id+" está inscrito al evento "+evento+", el cual tendrá lugar en el Teatro Metropolitano de la ciudad de Medellín.", tipo3);
            cuerpo.setAlignment(Element.ALIGN_CENTER);  
            doc.add(cuerpo);

            doc.addAuthor("ConstanciaEvento");
            JOptionPane.showMessageDialog(parentComponent, "Constancia de inscripción descargada con éxito", "Constancia de inscripción", JOptionPane.INFORMATION_MESSAGE);
        } catch (DocumentException e) {
            //manejo de error con la creación del documento
            JOptionPane.showMessageDialog(parentComponent, "Error al crear el documento PDF: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } catch (IOException e) {
            //manejo de excepcion de archivo en uso
            JOptionPane.showMessageDialog(parentComponent, "Debes cerrar el PDF en tus otras aplicaciones para poder descargar uno nuevo.\nVuelve a presionar el botón de descargar cuando hayas cerrado el archivo PFD.", "Archivo en uso", JOptionPane.WARNING_MESSAGE);
            e.printStackTrace();
        } finally {
            if (doc.isOpen()) {
                doc.close();
            }
        }
    }    
}
    
