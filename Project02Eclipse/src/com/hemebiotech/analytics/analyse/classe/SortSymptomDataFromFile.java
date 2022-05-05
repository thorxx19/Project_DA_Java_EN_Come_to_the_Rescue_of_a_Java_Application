package com.hemebiotech.analytics.analyse.classe;

import com.hemebiotech.analytics.analyse.ISymptomSorting;

import java.util.ArrayList;

public class SortSymptomDataFromFile implements ISymptomSorting {

    /**
     * construct
     */
    public SortSymptomDataFromFile() {
    }

    /**
     * method (sortSymptoms) sort the symptoms in alphabetical order
     *
     * @param symptoms is raw array list of symptoms
     * @return listSymptomsSort is array sort of symptoms
     */
    @Override
    public ArrayList<String> sortSymptoms(ArrayList<String> symptoms) {
        ArrayList<String> listSymptomsSort = new ArrayList<>();

        try {

            symptoms.sort(String::compareTo);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return symptoms;
    }


}
