/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Calendar;
import java.util.TimeZone;

/**
 *
 * @author Dell
 */
public class Calandar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here     
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
     Date d= Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(sdf.format(d));
        
        
        //acresentando 4 horas  amais da minha data
        Calendar cal = Calendar.getInstance();
        
        //pegando minha data
        cal.setTime(d);
        
        //acresentando mais 4 horas nesse meu dia
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d =cal.getTime();
        System.out.println(sdf.format(d));
       
        int  minutes = cal.get(Calendar.MINUTE);
        //preciso colocar o 1+cale...pois para o Calend..o mes começa em 0 janeiro
        int month = 1+cal.get(Calendar.MONTH);
        
        System.out.println("Minutos "+minutes);
        System.out.println("Mês "+month);
    }

}
