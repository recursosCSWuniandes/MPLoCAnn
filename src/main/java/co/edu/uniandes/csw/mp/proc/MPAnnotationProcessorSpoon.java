package co.edu.uniandes.csw.mp.proc;

import co.edu.uniandes.csw.mp.ann.MPAnnotation;
import spoon.processing.AbstractAnnotationProcessor;
import spoon.reflect.declaration.CtMethod;

/**
 * Procesador de la anotación utilizando Spoon
 *
 * @author Wilmar Fuquen y Juan David García
 */
public class MPAnnotationProcessorSpoon extends AbstractAnnotationProcessor<MPAnnotation, CtMethod<?>> {

    @Override
    public void process(MPAnnotation annotation, CtMethod<?> element) {
        System.out.println("Metodo ->" + element.getSimpleName());
        String body = element.getBody().toString();
        int j = 0;
        for (int i = 0; i < body.length(); i++) {
            if (body.charAt(i) == '\n') {
                j++;
            }
        }
        System.out.println("TOTAL DE LINEAS " + j);
    }
}
