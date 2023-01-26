package org.example.util;

import org.example.contragent.Contragent;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;

public class DataWriter {

    public void writeFileStudent (List<Contragent> contragents){
        try(FileWriter writer = new FileWriter("Contragent.txt"))
        {
            for(Contragent contragent : contragents){
                writer.append(contragent.toString());
            }
            writer.close();
        }
        catch(Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));;
        }
    }
}
