/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MYDict;

import java.io.*;
import java.util.*;

/**
 *
 * @author Administrator
 */
public class DictionaryManagement {

    /**
     *Required by Request
     */
    public static void insertFromCommandline()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so luong tu; ");
	int numOfWord;
	numOfWord=Integer.parseInt(sc.nextLine());
	for(int i=0;i<numOfWord;i++)
	{
            Word newWord=new Word();
            System.out.println("Nhap tu: ");
            newWord.setWordTarget(sc.nextLine());
            System.out.println("Nhap nghia: ");
            newWord.setWordExplain(sc.nextLine());
            Dictionary.addDemoWord(newWord);
            
	}
        sc.close();
    }

    /**
     *import data for Dictionary.dict(main dictionary)
     * @throws IOException
     */
    public static void insertFromFile() throws IOException
    {
        FileInputStream file=new FileInputStream("E:\\Desktops\\Dictionary\\bin\\edict1.txt");
        Scanner sc=new Scanner(file);
        
        while(sc.hasNextLine())
        {
            
            {String s[]= sc.nextLine().split("\t");
            Word newWord=new Word();
            newWord.setWordTarget(s[1]);
            newWord.setWordExplain(s[2]);
            Dictionary.addWord(newWord);}
        }
        sc.close();
        file.close();
    }
    
    /**
     *import data for Dictionary.demo(the dictionary for testing add,edit,remove button)
     * @throws IOException
     */
    public static void insertFromDemoFile() throws IOException
    {
        FileInputStream file=new FileInputStream("E:\\Desktops\\Dictionary\\bin\\Dictionary.txt");
        Scanner sc=new Scanner(file);
        
        while(sc.hasNextLine())
        {
            
            {String s[]= sc.nextLine().split("\t");
            Word newWord=new Word();
            newWord.setWordTarget(s[0]);
            newWord.setWordExplain(s[1]);
            Dictionary.addDemoWord(newWord);}
        }
        sc.close();
        file.close();
    }
    
    /**
     *export data from Dictionary.dict(main dictionary) to file
     * @throws IOException
     */
    public static void dictionaryExportToFile()throws IOException
    {
        FileOutputStream file=new FileOutputStream("E:\\Desktops\\Dictionary\\bin\\edict1.txt");
        PrintWriter output=new PrintWriter(file);
	for (Map.Entry<String, String> entry : Dictionary.dict.entrySet()) 
        {
        output.println(entry.getKey()+"\t"+entry.getValue());
        }
        output.close();
        file.close();
    }
    
    /**
     *export data from Dictionary.demo(the dictionary for testing add,edit,remove button) to file
     */
    public static void dictionaryExportToDemoFile()
    {
        try {
            FileOutputStream file=new FileOutputStream("E:\\Desktops\\Dictionary\\bin\\Dictionary.txt");
            PrintWriter output=new PrintWriter(file);
            for (Map.Entry<String, String> entry : Dictionary.demo.entrySet()) 
            {
            output.println(entry.getKey()+"\t"+entry.getValue());
            }
            output.close();
            file.close();
        }
        catch (IOException e) {
            System.err.println("IO Exception");
        }
        
    }
    
    /**
     *import data for recent word
     * @throws IOException
     */
    public static void recentImportFromFile() throws IOException
    {
        FileInputStream file=new FileInputStream("E:\\Desktops\\Dictionary\\bin\\recent.txt");
        Scanner sc=new Scanner(file);
        
        while(sc.hasNextLine())
        {
            Dictionary.recent.add(sc.nextLine());
        }
        sc.close();
        file.close();
    }
    
    /**
     *export data for recent word
     */
    public static void recentExportToFile()
    {
        try {
            FileOutputStream file=new FileOutputStream("E:\\Desktops\\Dictionary\\bin\\recent.txt");
            PrintWriter output=new PrintWriter(file);
	for (int i=0;i<Dictionary.recent.size();i++) 
        {
            output.println(Dictionary.recent.elementAt(i));
        }
        output.close();
        file.close();
        }
        catch (IOException e) {
            System.err.println("IO Exception");
        }
        
    }

    /**
     *Required by Request
     */
    public static void dictionaryLookup()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap tu can tra: ");
        String demandedWord=sc.nextLine();
        String meaning=Dictionary.dict.get(demandedWord);
        if(meaning==null) System.out.println("Khong tim thay tu.");
        else{
            System.out.println(demandedWord+" "+meaning);
            FreeTTS freeTTS = new FreeTTS(demandedWord);
            freeTTS.speak1();}
    }
    
    /**
     *Required by Request
     */
    public static void dictionaryLookup1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap tu can tra: ");
        String demandedWord=sc.nextLine();
        Vector<String> a=DictionaryCommandLine1.dictionarySearcher(demandedWord);
        System.out.println(a);
    }
    
    /**
     *Required by Request
     */
    public static void dictionaryEdit()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap tu can sua: ");
        String demandedWord=sc.nextLine();
        if(!Dictionary.dict.containsKey(demandedWord)) System.out.println("Khong tim thay tu.");
        else
        {
            System.out.println("Nghia ban dau: ");
            System.out.println(Dictionary.dict.get(demandedWord));
            System.out.println("Nhap nghia moi: ");
            String newMeaning=sc.nextLine();
            if(Dictionary.dict.replace(demandedWord,Dictionary.dict.get(demandedWord),newMeaning))
                System.out.println("Thay doi thanh cong ");
            else System.out.println("Thay doi that bai ");
        }
        sc.close();
    }

    /**
     *Required by Request
     */
    public static void dictionaryRemove()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap tu can xoa: ");
        String demandedWord=sc.nextLine();
        String meaning=Dictionary.dict.get(demandedWord);
        if(meaning==null) System.out.println("Khong tim thay tu.");
        else
        {
            System.out.println("Tu can xoa: ");
            System.out.println(demandedWord+"\t"+meaning);
            Dictionary.dict.remove(demandedWord);
            System.out.println("Da xoa tu");
        }
        sc.close();
    }
    }
