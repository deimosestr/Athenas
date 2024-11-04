package com.login;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.login.DatabaseConnection;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class PDFExporter {

    public static void exportDataToPDF() {
        Connection con = null;
        try {
            // Obtenemos la conexión de la clase DatabaseConnection
            con = DatabaseConnection.getConnection();

            // Realizamos la consulta
            String query = "SELECT * FROM public.users";  // Modifica esta consulta según tu necesidad
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Crear un archivo PDF utilizando FileOutputStream
            String dest = "datos_exportados.pdf";
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(dest));

            // Abrimos el documento
            document.open();

            // Iterar sobre los resultados de la consulta y escribirlos en el PDF
            while (rs.next()) {
                // Extraer todas las columnas de la tabla users
                String id = rs.getString(1);
                String username = rs.getString(2);
                String password = rs.getString(3);
                String email = rs.getString(4);

                // Formatear los datos para que se impriman en el PDF
                String datos = "ID: " + id + ", Usuario: " + username + ", Contraseña: " + password + ", Email: " + email;

                // Añadir los datos como un nuevo párrafo en el documento PDF
                document.add(new Paragraph(datos));
            }

            // Cerramos el documento
            document.close();

            JOptionPane.showMessageDialog(null, "Datos exportados a PDF exitosamente.");

        } catch (FileNotFoundException | DocumentException e) {
            JOptionPane.showMessageDialog(null, "Error al exportar los datos: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al exportar los datos: " + e.getMessage());
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + ex.getMessage());
            }
        }
    }
}
