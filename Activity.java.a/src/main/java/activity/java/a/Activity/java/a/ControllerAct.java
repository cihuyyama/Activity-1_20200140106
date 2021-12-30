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
        Double price = Double.valueOf(data.getParameter("var_price"));
        Double amount = Double.valueOf(data.getParameter("var_amount"));
        
        proses obj = new proses();
        
        n.addAttribute("namefruit",name);
        n.addAttribute("pricefruit",price);
        n.addAttribute("amountkilo",amount);
        n.addAttribute("beforeprice",obj.broto(price, amount));
        n.addAttribute("discnumber",obj.disc(obj.broto(price, amount)));
        n.addAttribute("discamount",obj.discount(price, amount));
        n.addAttribute("afterprice",obj.netto(price, amount));
        
        return "MuhammadIqbal";
    }
}
