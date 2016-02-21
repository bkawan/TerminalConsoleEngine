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
 * @time 12:48:52 PM
 */
public class NotFoundCommand extends TerminalCommands
{

    public NotFoundCommand(Scanner input) {
        super(input);
    }

    @Override
    public void execute(User user, String[] coreCommands) {
        System.out.println("-bash: "+ coreCommands[0]+": command not found");
    }

}