package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    private Date expirationDate;

    //CONSTRUCTOR Mercancia fresca con sus datos
    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf,
                            int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    //getSpecificData
    @Override
    public String getSpecificData() {
        //Formatear fecha de caducidad
        String formattedDate = getFormattedDate(expirationDate);

        //Construir String con caduciad y localización
        StringBuilder specificData = new StringBuilder();
        specificData.append("Localizacion: ").append(getLocation()).append("\n");
        specificData.append("Caducidad: ").append(formattedDate);

        return specificData.toString();
    }

    //Imprime por pantalla "getSpecificData"
    public void printSpecificData() {
        System.out.println(getSpecificData());
    }

    //Formatea fecha
    public String getFormattedDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(date);
    }

    //Getter y Setter
    public Date getExpirationDate() {
        return expirationDate;
    }

    public  void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

}
