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
 * @date Feb 21, 2016
 * @time 9:34:03 AM
 */
public class ChangeDirectoryCommand extends TerminalCommands {

    public ChangeDirectoryCommand(Scanner input) {
        super(input);
    }

    @Override
    public void execute(User user, String[] coreCommands) {
         System.out.println(user.getUserName().toUpperCase() + "'S" + "-MacBook-Pro:" + coreCommands[1]+ " "  + user.getUserName() + "$ ");
        
    }

}
