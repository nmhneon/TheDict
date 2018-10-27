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
public class Dictionary {
    static HashMap<String,String> dict=new HashMap();
    static HashMap<String,String> demo=new HashMap();
    static Vector<String> recent=new Vector<>();
    static int count=0;
    static int countDemo=0;
    
    static void addWord(Word word)
    {
        Dictionary.dict.put(word.getWordTarget(),word.getWordExplain());
        Dictionary.count++;
    }
    
    static void addDemoWord(Word word)
    {
        Dictionary.demo.put(word.getWordTarget(),word.getWordExplain());
        Dictionary.countDemo++;
    }
    
}
