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
 * @time 11:28:16 AM
 */
public class RemoveDirectoryCommand extends TerminalCommands {

    public RemoveDirectoryCommand(Scanner input) {
        super(input);
    }

    @Override
    public void execute(User user, String[] coreCommands) {
        if (coreCommands.length == 1) {
            System.out.println("usage: rmdir [-p] directory ...");
        } else  {
            System.out.println("Directory has been removed from : ");
            System.out.println("Users/" + user.getUserName() + "/");
        }

    }

}
