package org.example;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConeccionMBD {
    private JTextField nombre;
    private JTextField pasatiempo;
    private JTextField descrip;
    private JButton accederboton;
    JPanel VentanaPrincipal;
    private Document documento;

    public ConeccionMBD() {
        accederboton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "mongodb+srv://esfot:esfot2024@cluster0.xzffuex.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
                String cbdmongo = "Mongobase";
                String coleccion = "collection";
                MongoClient cliente = MongoClients.create(url);


                documento = new Document();
                documento.append("Nombre", nombre.getText());
                documento.append("Pasatiempo", pasatiempo.getText());
                documento.append("Descripcion", descrip.getText());
                // Obtiene la referencia a la base de datos
                MongoDatabase database = cliente.getDatabase(cbdmongo);
                // Obtiene la referencia a la colección
                MongoCollection<Document> collection = database.getCollection(coleccion);
                // Inserta el documento en la colección
                collection.insertOne(documento);
                JOptionPane.showMessageDialog(null, "Documento insertado");
                cliente.close();
            }
        });
    }
}
