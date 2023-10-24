package com.magna.imprimir;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.magna.modelo.Categoria;
import com.magna.modelo.Libro;
import com.magna.modelo.Prestamo;
import com.magna.modelo.Rol;
import com.magna.modelo.Usuario;
import com.magna.superfunciones.SuperFuncionPDF;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.JOptionPane;

public class PDFCreation {
    
    public static void imprimirInformacionU(String nombreTabla){
        Document documento = new Document();
        try{
            String nombreArchivo = "C:\\Users\\Santiago Alzate\\Desktop\\libros.pdf";
            PdfWriter.getInstance(documento, new FileOutputStream(nombreArchivo));
            documento.open();
            PdfPTable tabla = new PdfPTable(7);
            tabla.addCell("Nombre Usuario");
            tabla.addCell("Edad Usuario");
            tabla.addCell("Cedula Usuario");
            tabla.addCell("Dirección Usuario");
            tabla.addCell("Usuario");
            tabla.addCell("Contraseña");
            tabla.addCell("Codigo Rol");
            List <Usuario> usuarios = SuperFuncionPDF.obtenerTodosLosUsuarios();
            for(Usuario usuario: usuarios){
                tabla.addCell(usuario.getNom_persona());
                tabla.addCell(String.valueOf(usuario.getEd_persona()));
                tabla.addCell(usuario.getCed_persona());
                tabla.addCell(usuario.getDir_persona());
                tabla.addCell(usuario.getUser_u());
                tabla.addCell(usuario.getPass_u());
                tabla.addCell(usuario.getCod_rol());
            }
            documento.add(tabla);
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado.");
        }catch (DocumentException | HeadlessException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public static void imprimirInformacionP(String nombreTabla){
        Document documento = new Document();
        try{
            String nombreArchivo = "C:\\Users\\Santiago Alzate\\Desktop\\prestamos.pdf";
            PdfWriter.getInstance(documento, new FileOutputStream(nombreArchivo));
            documento.open();
            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell("Código Prestamo");
            tabla.addCell("Fecha Inicio Prestamo");
            tabla.addCell("Fecha Finaliza Prestamo");
            tabla.addCell("Código Usuario");
            tabla.addCell("Código Libro");
            List <Prestamo> prestamos = SuperFuncionPDF.obtenerTodosLosPrestamos();
            for(Prestamo prestamo: prestamos){
                tabla.addCell(prestamo.getId_prestamo());
                tabla.addCell(prestamo.getDateS_prestamo());
                tabla.addCell(prestamo.getDateF_prestamo());
                tabla.addCell(prestamo.getCod_user());
                tabla.addCell(prestamo.getCod_libro());
            }
            documento.add(tabla);
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado.");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public static void imprimirInformacionL(String nombreTabla) {
        Document documento = new Document();
        try{
            String nombreArchivo = "C:\\Users\\Santiago Alzate\\Desktop\\libros.pdf";
            PdfWriter.getInstance(documento, new FileOutputStream(nombreArchivo));
            documento.open();
            PdfPTable tabla = new PdfPTable(6);
            tabla.addCell("Código Libro");
            tabla.addCell("Titulo Libro");
            tabla.addCell("Autor Libro");
            tabla.addCell("Año Publicación");
            tabla.addCell("Cantidad Stock");
            tabla.addCell("Código Categoria");
            List <Libro> libros = SuperFuncionPDF.obtenerTodosLosLibros();
            for(Libro libro: libros){
                tabla.addCell(libro.getId_libro());
                tabla.addCell(libro.getTit_libro());
                tabla.addCell(libro.getAut_libro());
                tabla.addCell(libro.getAno_public());
                tabla.addCell(String.valueOf(libro.getCan_stock()));
                tabla.addCell(libro.getCod_categoria());
            }
            documento.add(tabla);
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado.");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public static void imprimirInformacionC(String nombreTabla) {
        Document documento = new Document();
        try {
            String nombreArchivo = "C:\\Users\\Santiago Alzate\\Desktop\\categorias.pdf";
            PdfWriter.getInstance(documento, new FileOutputStream(nombreArchivo));
            documento.open();
            PdfPTable tabla = new PdfPTable(2);
            tabla.addCell("Código Categoría");
            tabla.addCell("Nombre Categoría");
            List <Categoria> categorias = SuperFuncionPDF.obtenerTodasLasCategorias();
            for(Categoria categoria: categorias){
                tabla.addCell(categoria.getId_categoria());
                tabla.addCell(categoria.getNom_categoria());
            }
            documento.add(tabla); 
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado.");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public static void imprimirInformacionR(String nombreTabla){
        System.out.println("Iniciando generación del PDF...");
        Document documento = new Document();
        try{
            String nombreArchivo = "C:\\Users\\Santiago Alzate\\Desktop\\roles.pdf";
            PdfWriter.getInstance(documento, new FileOutputStream(nombreArchivo));
            documento.open();
            PdfPTable tabla = new PdfPTable(2);
            tabla.addCell("Codigo Rol");
            tabla.addCell("Nombre Rol");
            List<Rol> roles = SuperFuncionPDF.obtenerTodosLosRoles();
            for(Rol rol: roles){
                tabla.addCell(rol.getId_rol());
                tabla.addCell(rol.getNom_rol());
            }
            documento.add(tabla);
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado.");
        }catch (DocumentException | HeadlessException | FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Finalizada generación del PDF.");
    }
}
