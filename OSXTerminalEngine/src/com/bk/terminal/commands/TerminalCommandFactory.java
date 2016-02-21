/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bk.terminal.commands;

import java.util.Scanner;

/**
 *
 * @author bkawan
 * @date Feb 19, 2016
 * @time 11:41:57 AM
 *
 * this class put all the terminal commands
 */
public class TerminalCommandFactory {

    public String coreCommandss[] = {"mkdir"};

    /**
     *
     * @param coreCommands
     * @param params
     * @return terminal command
     */
    public static TerminalCommands getCommand(String[] coreCommands, Scanner input) {
        if (coreCommands[0].equalsIgnoreCase("mkdir")) {
            return new CreateNewDirectoryCommand(input);

        } else if (coreCommands[0].equalsIgnoreCase("mkdir") && coreCommands[1].equalsIgnoreCase("-p")) {
            return new CreateNestedDirectory(input);
        } else if (coreCommands[0].equalsIgnoreCase(
                "rmdir")) {
            return new RemoveDirectoryCommand(input);
        }else if (coreCommands[0].equalsIgnoreCase("cd")){
            return new ChangeDirectoryCommand(input);
        }
        else if (coreCommands[0].equalsIgnoreCase(
                "Exit")) {
            return new ExitCommand(input);
        }

        return new NotFoundCommand(input);

    }

}
