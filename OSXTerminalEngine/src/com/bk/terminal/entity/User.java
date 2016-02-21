/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bk.terminal.entity;

/**
 *
 * @author bkawan
 * @date Feb 19, 2016
 */
public class User {
   
    private String userName;
    //private String compuerName;
    
    public User(){
    }
    public User(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return this.userName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
}
