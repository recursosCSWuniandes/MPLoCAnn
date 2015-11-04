package co.edu.uniandes.csw.mp.ann;

/**
 * Clase de prueba con un método anotado
 *
 * @author Wilmar Fuquen y Juan David García
 */
public class ProductAnn {

    @MPAnnotation(tier = "Backend", reqId = "Req01")
    public int countProductsBackend() {
        int i;
        i = 0;
        i++;
        return i;
    }

    @MPAnnotation(tier = "Service", reqId = "Req01")
    public int countProductsService() {
        // Test doc line
        int i;
        i = 0;
        i++;
        i++;
        // Second test doc line
        return i;
    }
}
