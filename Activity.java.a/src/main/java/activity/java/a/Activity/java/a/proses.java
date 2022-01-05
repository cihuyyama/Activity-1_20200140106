/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity.java.a.Activity.java.a;
/**
 *
 * @author iqbal al habib
 */
public class proses {
    public Double broto(Double price,Double amount){
        return price*amount;
    }
    
    public Double netto(Double price, Double amount){
        return broto(price,amount)-discount(price,amount);
    }
    
    public Integer disc(Double broto){
        if (broto>25000){
            return 15;
        }
        else if(broto>16000){
            return 10;
        }
        else{
            return 0;
        }
    }
    
    public Double tunai(Double tn,Double netto){
        return tn-netto;
    }
    
    public Double discount(Double price,Double amount){
        return broto(price,amount)*disc(price*amount)/100;
    }
}
