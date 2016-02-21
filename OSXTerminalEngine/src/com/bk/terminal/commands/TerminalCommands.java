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
 * @time 11:23:29 AM
 */
public abstract class TerminalCommands {

    // input will be only use in the exitTerminal command to give confirmation for user
    // none of the class will implement it so usless for other class
    public Scanner input;
    // param is after main commands
    public String param;
    public User user;
    public TerminalCommands(Scanner input){
        this.input = input;
    }
    
    // to method to execute all the terminal commands
    /**
     * 
     * @param coreCommands list of all the core commands from the user input
     * @param user 
     */
    public abstract void execute(User user, String[] coreCommands);
}
