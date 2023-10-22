package com.magna.controlador;

import com.magna.imprimir.PDFCreation;
import com.magna.repository.PDFDao;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ControladorPDF {

    private PDFDao pdfDao;

    public ControladorPDF() {
        pdfDao = PDFDao.getInstancia();
    }

    public void mostrarTablasDisponibles(JComboBox comboBox) {
        pdfDao.mostrarTablasDisponibles(comboBox);
    }

    public boolean generarPDF(JComboBox comboBox) {
        String tablaSeleccionada = (String) comboBox.getSelectedItem();
        if (tablaSeleccionada.equals("categoria")) {
            PDFCreation.imprimirInformacionC(tablaSeleccionada);
            return true;
        } else if (tablaSeleccionada.equals("rol")) {
            PDFCreation.imprimirInformacionR(tablaSeleccionada);
        } else if (tablaSeleccionada.equals("libro")) {
            PDFCreation.imprimirInformacionL(tablaSeleccionada);
        } else if (tablaSeleccionada.equals("usuario")) {
            PDFCreation.imprimirInformacionU(tablaSeleccionada);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro la selección");
        }
        return false;
    }

}
