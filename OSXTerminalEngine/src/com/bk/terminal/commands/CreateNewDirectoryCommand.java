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
 * @time 11:27:03 AM
 */
public class CreateNewDirectoryCommand extends TerminalCommands {

    public CreateNewDirectoryCommand(Scanner input) {
        super(input);
    }

    @Override
    public void execute(User user, String[] coreCommands) {
        if (coreCommands.length == 1) {
            System.out.println("usage: mkdir [-pv] [-m mode] directory ...");
        } else if (!coreCommands[1].equalsIgnoreCase("-p") && coreCommands.length == 2) {
            System.out.println("Directory " + coreCommands[1] + " has been created at: ");
            System.out.println("Users/" + user.getUserName() + "/" + coreCommands[1]);
        } else if (!coreCommands[1].equalsIgnoreCase("-p")) {
            System.out.println(coreCommands.length - 1 + " directories have ben created ");
            for (int i = 1; i < coreCommands.length; i++) {
                System.out.println("Users/" + user.getUserName() + "/" + coreCommands[i]);

                //int ii = i;
            }
                    
        }else{
             
        }
            //System.out.println(ii+ "Have been created");

    }

}
