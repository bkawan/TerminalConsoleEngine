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
 * @time 3:14:35 PM
 */
public class ExitCommand extends TerminalCommands {

    public ExitCommand(Scanner input) {
        super(input);
    }

    @Override
    public void execute(User user, String[] coreCommands) {
       // if (input.next().equalsIgnoreCase("exit")) {
            System.out.println("logout\n"
                    + "Saving session...\n"
                    + "...copying shared history...\n"
                    + "...saving history...truncating history files...\n"
                    + "...completed.\n"
                    + "\n"
                    + "[Process completed]");
        //}
        System.exit(0);
    }
}
