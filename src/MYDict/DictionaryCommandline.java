/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MYDict;

import java.util.*;

/**
 *
 * @author Administrator
 */
public class DictionaryCommandline {

    /**
     *Print all words of Dictionary.dict
     */
    public static void showAllWord()
    {
        int i=0;
	System.out.println("No\t|English\t|Vietnamese");
	for (Map.Entry<String, String> entry : Dictionary.demo.entrySet()) {
        System.out.println(++i+"\t"+entry.getKey()+"\t"+entry.getValue());
}

    }
    
    
    
}
