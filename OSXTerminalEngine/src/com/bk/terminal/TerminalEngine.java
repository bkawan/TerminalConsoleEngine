/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bk.terminal;

import com.bk.terminal.commands.TerminalCommandFactory;
import com.bk.terminal.commands.TerminalCommands;
import com.bk.terminal.entity.User;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author bkawan
 * @date Feb 19, 2016
 */
public class TerminalEngine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Please Enter Username : ");
        Date date = new Date();

        Scanner input = new Scanner(System.in);
        User user = new User();

        user.setUserName(input.nextLine());

        System.out.println("Curret Login : " + date.toString());
        System.out.println("Welcome to MacBook Terminal Console Engine!!");
        while (true) {
            String cd = "~";
            System.out.print(user.getUserName().toUpperCase() + "'S" + "-MacBook-Pro:" + cd + " " + user.getUserName() + "$ ");

            String command = input.nextLine();
            String[] commands = command.split(" ");

            // String command = input.nextLine();
            //String[] commands = command.split(" ");
            // String commands[] = inputCommands.n;
            TerminalCommands cmd = TerminalCommandFactory.getCommand(commands, input);
            // System.out.println("Iamd herer " + commands[0] +" from terminal engine");

            //pass user object from above  and commands like mkdir 
            if (commands[0].equalsIgnoreCase("cd")) {
                cd = commands[0];
            }

            cmd.execute(user, commands);

        }
    }

}
