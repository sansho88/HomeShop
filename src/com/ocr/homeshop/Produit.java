package com.ocr.homeshop;

public class Produit {
    private String nom;
    private String description;
    private double prix;

    /**
     * Affiche une description complète du produit
     */
    public void regarder(){
        System.out.println(String.format(nom + ": " + "%n" + description));
    }

    /**
     * Ajoute le produit à une facture.
     * @param facture = la facture concernée
     * @param quantite = la quantité de produits à ajouter
     */
    public void acheter(Facture facture, Integer quantite){

    }

    public String getNom(){
        return nom;
    }

    public String getDescription(){
        return description;
    }

    public Double getPrix(){
        return prix;
    }

    public void setPrix(double prix){
        this.prix = prix;
    }




}