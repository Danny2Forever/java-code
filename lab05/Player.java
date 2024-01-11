/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author User
 */
public class Player {
    private String name, team;
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setTeam(String n){
        team = n;
    }
    public String getTeam(String n){
        return team;
    }
    public boolean isSameTeam(Player p){
        if(p.team == team){
            return true;
        }else{
            return false;
        }
    }
}
