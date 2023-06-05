/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nghincjava3.ass.Heler;

import java.text.SimpleDateFormat;
import java.util.Date;



/**
 *
 * @author ASUS
 */
public class clock implements Runnable{

    @Override
   public void run() {
        while(true){
            try{
                Date now = new Date();
                SimpleDateFormat hh = new SimpleDateFormat();
               // hh.applyPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
                hh.applyPattern("HH:mm:ss.aa /'day':dd-'month:'MM-'year':yyyy");
               // hh.applyPattern("hh:mm:ss aa");

                String time = hh.format(now);
              //  start.setText(time);
                Thread.sleep(1000);
                        
            }catch(Exception ex){
                break;
        }
    }}
    
}
