package com.np.kd.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.np.kd.spring.album.BhedaKoUnJsto;
import com.np.kd.spring.album.CompactDisc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CompactDiscConfiguration.class);
        CompactDisc bhedaKoUnJsto = context.getBean("bhedaKoUnJsto",BhedaKoUnJsto.class);
        bhedaKoUnJsto.play();
        context.close();
    }
}
