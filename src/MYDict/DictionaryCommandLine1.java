/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MYDict;

import java.io.IOException;
import java.util.*;

/**
 *
 * @author Administrator
 */
public class DictionaryCommandLine1 {

    /**
     *Required by Request
     * @throws IOException
     */
    public static void dictionaryBasic() throws IOException
    {
         //DictionaryManagement.insertFromCommandline();
         DictionaryManagement.insertFromFile();
         DictionaryCommandline.showAllWord();
         
         
         
    }

    /**
     *Required by Request
     * @throws IOException
     */
    public static void dictionaryAdvanced() throws IOException
    {
        DictionaryManagement.insertFromFile();
        //DictionaryCommandline.showAllWord();
        DictionaryManagement.dictionaryLookup1();
        //DictionaryManagement.dictionaryEdit();
        //DictionaryManagement.dictionaryRemove();
        //DictionaryManagement.dictionaryExportToFile();
    }
    
    /**
     *Required by Request
     * @param word
     * @return
     */
    public static Vector dictionarySearcher(String word)
    {
        Vector<String> table=new Vector<>();
        Set<String> keySet=Dictionary.dict.keySet();
        Iterator<String> it=keySet.iterator();
        while(it.hasNext())
        {
            String key=it.next();
            if(key.indexOf(word)==0) table.add(key);
        }
        return table;
    }    
    
}
