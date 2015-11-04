package co.edu.uniandes.csw.mp.proc;

import co.edu.uniandes.csw.mp.ann.MPAnnotation;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        // Cuenta el número de líneas
        String body = element.getBody().toString();
        int numLineas = 0;
        for (int i = 0; i < body.length(); i++) {
            if (body.charAt(i) == '\n') {
                numLineas++;
            }
        }
        // Genera .csv con la información
        try {
            Date fecha = Calendar.getInstance().getTime();
            String ruta = "./data/LoC_Report_" + fecha.getMonth() + fecha.getDay() + "_" + fecha.getHours() + fecha.getMinutes() + ".csv";
            boolean existe = false;

            File f = new File(ruta);
            // Verifica si ya existe para imprimir el encabezado;
            if (f.exists()) {
                existe = true;
            }

            FileWriter fw = new FileWriter(ruta, true);
            PrintWriter pw = new PrintWriter(fw);

            if (!existe) {
                pw.println("Requerimiento;Nivel;Method;LoC");
            }
            pw.println(annotation.reqId() + ";" + annotation.tier() + ";" + element.getSimpleName() + ";" + numLineas);

            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(MPAnnotationProcessorSpoon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
