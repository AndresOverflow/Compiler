/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Symbols;

/**
 *
 * @author Jaime
 */
public class SymbolSkipLabel extends SymbolBase{
    
    public String idLabel;
    
    public SymbolSkipLabel(String idLabel) {
        super("SymbolSkipLabel", 0);
        this.idLabel = idLabel;
    }
       
    public SymbolSkipLabel() {
        super("SymbolSkipLabel", 0);
        this.idLabel = "";
    }
}
