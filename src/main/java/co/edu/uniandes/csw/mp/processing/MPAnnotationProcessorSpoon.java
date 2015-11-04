/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.mp.processing;

import co.edu.uniandes.csw.mp.annotation.MPAnnotation;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import spoon.processing.AbstractAnnotationProcessor;
import spoon.reflect.declaration.CtMethod;

/**
 *
 * @author USUARIO
 */
public class MPAnnotationProcessorSpoon extends AbstractAnnotationProcessor<MPAnnotation, CtMethod<?>> {
    public void process(MPAnnotation annotation, CtMethod<?> element) {                

        System.out.println("Metodo ->"+element.getSimpleName());
        String body=element.getBody().toString();
        int j=0;
        for(int i=0;i<body.length();i++)
             if(body.charAt(i)=='\n')
                  j++;
        System.out.println("TOTAL DE LINEAS "+j);        
    }
}
