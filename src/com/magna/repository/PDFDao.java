package com.magna.repository;

import com.magna.interfaces.PDFDaoInterface;
import com.magna.superfunciones.SuperFuncionPDF;
import javax.swing.JComboBox;

public class PDFDao implements PDFDaoInterface{
    
    public static PDFDao INSTANCIA;
    SuperFuncionPDF superFuncionPDF = new SuperFuncionPDF();
    
    private PDFDao(){
    }
    
    public static PDFDao getInstancia(){
        if(INSTANCIA==null){
            INSTANCIA = new PDFDao();
        }
        return INSTANCIA;
    }
    
    @Override
    public void mostrarTablasDisponibles(JComboBox<String> comboBox){
        superFuncionPDF.mostrarTablasDisponibles(comboBox);
    }
            
}
