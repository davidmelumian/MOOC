/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tatiana
 */
public class Hideout<VAR> {
    private VAR hidden;
    public void putIntoHideout(VAR toHide){
        this.hidden=toHide;
    }
    public VAR takeFromHideout(){
        VAR accum = hidden;
        hidden = null;
        return  accum;
    }
    public boolean isInHideout(){
        if (hidden==null){
            return false;
        }
        return true;
    }
}