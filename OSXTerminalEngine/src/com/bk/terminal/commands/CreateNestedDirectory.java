/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bk.terminal.commands;

import com.bk.terminal.entity.User;
import java.util.Scanner;

/**
 *
 * @author bkawan
 * @date Feb 19, 2016
 * @time 5:38:54 PM
 */
public class CreateNestedDirectory extends TerminalCommands {

    public CreateNestedDirectory(Scanner input) {
        super(input);
    }

    @Override
    public void execute(User user, String[] coreCommands) {

        if (coreCommands.length == 2) {
            System.out.println("usage: mkdir [-pv] [-m mode] directory ...");
        } else if(coreCommands.length > 2) {
                            System.out.println("Nested folders have been created");

            for(int i = 2; i<coreCommands.length; i++){
                System.out.println("Users/" + user.getUserName() + "/" + coreCommands[i]);
            }
            
//            for (int i = 0; i < nestedCommands.length(); i++) {
//                String nested = nestedFolders[i];
//                System.out.println("I am here : " + nested);
//                
////String[] nestedFolders = nestedFolder.split("/");
//            }

            //System.out.println(" Nested directories have been created as: ");

           // System.out.println("Users/" + user.getUserName() + "/" + nestedFolders[0] + "/" + nestedFolders[1]);

//
//        if(coreCommands.length ==3)
//            for(int i=3; i<coreCommands.length; i++){
//                System.out.println(coreCommands[i]);
//            }
//        System.out.println( coreCommands[1] + " Nested directories have been created asmk: ");
//               System.out.println("Users/" + user.getUserName() +"/"+ coreCommands[1]);
        }
    }
}
