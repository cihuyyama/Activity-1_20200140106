/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity.java.a.Activity.java.a;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author iqbal al habib
 */
@Controller
public class ControllerAct {
    
    @RequestMapping("/getbill")
    public String belanja(HttpServletRequest data, Model n){
        String name = data.getParameter("var_name");
        
        String p = data.getParameter("var_price");
        Double price = Double.valueOf(p);
        
        String a = data.getParameter("var_amount");
        Double amount = Double.valueOf(a);
        
        Double broto = price * amount;
        Double netto, discount;
        Integer disc;
        
        if (broto>25000){
            disc = 15;
        }
        else if(broto>16000){
            disc = 10;
        }
        else{
            disc = 0;
        }
        
        discount = broto*disc/100;
        netto = broto - discount;
        
        n.addAttribute("namefruit",name);
        n.addAttribute("pricefruit",price);
        n.addAttribute("amountkilo",amount);
        n.addAttribute("discamount",discount);
        n.addAttribute("discnumber",disc);
        n.addAttribute("beforeprice",broto);
        n.addAttribute("afterprice",netto);
        
        return "MuhammadIqbal";
    }
}
