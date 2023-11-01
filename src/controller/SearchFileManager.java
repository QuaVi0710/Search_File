/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Library;
import common.Validate;
import view.Menu;

/**
 *
 * @author QuaVi
 */
public class SearchFileManager extends Menu<String> {
    
    static String[] mc = {"Count Word In File", "Find File By Word","Exit"};
    
    
    public SearchFileManager() {
        super("\n\tWord Program ", mc);
    }
    
    
    @Override
    public void execute(int n) {
        switch(n) {
            case 1:
                   System.out.print("Enter path   ");
                   String path = Validate.checkInput();
                   System.out.print("Enter word    ");
                   String name = Validate.checkInput();
                   int count =  Library.countWordInFile(path, name);   
                   System.out.print("COUNT : " + count); 
                   break;
            case 2:
                    System.out.print("Enter Path   ");//D:\Java code\Search_File\text.txt
                    String path1 = Validate.checkInput();
                    System.out.print("Enter Word     ");
                    String word = Validate.checkInput();
                    Library.findFilesWithWordInDirectory(path1, word);
                    break;
            case 3: System.exit(0);
        }
    }
    
     
    
}
