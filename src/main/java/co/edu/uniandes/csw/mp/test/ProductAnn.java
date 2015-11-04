package co.edu.uniandes.csw.mp.test;

import co.edu.uniandes.csw.mp.ann.MPAnnotation;

/**
 * Clase de prueba con un método anotado
 *
 * @author Wilmar Fuquen
 */
public class ProductAnn {

    @MPAnnotation
    public int countProducts() {
        int i;
        i = 0;
        i++;
        return i;
    }
}
