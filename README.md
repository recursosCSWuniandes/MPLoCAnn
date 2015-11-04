# SpAnnLoC
Anotación en Spoon para contador líneas de código de un método. Genera un reporte (.csv) que permite discriminar las líneas de código de un requerimiento para diferentes niveles de la aplicación.

### Descripción
SpAnnLoc se desarrolló en el contexto del curso Gestión de Proyectos de Software de la Universidad de los Andes (Colombia). El objetivo de la anotación es poder cuantificar las líneas de código de un requerimiento para diferentes niveles de una aplicación (Ej. Backend y Servicios). Utiliza Spoon como procesador de anotaciones con lo cual es posible contar fácilmente las líneas de código del método anotado.

### Instrucciones de Uso
**Nota**: Las instrucciones que se presentan a continuación se realizaron tomando como base los proyectos de Marketplace utilizados en el curso.

1. Maven

  Inicialmente se debe configurar las dependencia de maven en el archivo pom.xml del back-end y el front-end del proyecto:

  Liberia: <a href="http://spoon.gforge.inria.fr/">Spoon</a>

  Versión: 4.3.0
  
  Maven: http://mvnrepository.com/artifact/fr.inria.gforge.spoon/spoon-core/4.3.0

2. Descargar los archivos <b>MPAnnotation.java</b> y <b>MPAnnotationProcessorSpoon.java</b> que deben ser agregados al source del back-end y el front-end en un paquete <b>co.edu.uniandes.csw.mp.ann</b>. Estos archivos hacen referencia a la anotación con la que se va a trabajar y al procesor con el que se contarán las lineas de los metodos.
 

  Los archivos estan disponibles en dropbox en los siguientes vínculos:
  
  <a href="https://www.dropbox.com/s/t76k6ykxmyy0unc/MPAnnotation.java?dl=0">MPAnnotation.java</a>
  
  <a href="https://www.dropbox.com/s/2vm6svhgpdz8c4l/MPAnnotationProcessorSpoon.java?dl=0">MPAnnotationProcessorSpoon.java</a>
  
3. Descargar el archivo <b>MPAnnotationTest.java </b> que debe ser agregado al directorio de pruebas en un paquete <b>co.edu.uniandes.csw.mp.ann.test</b>, este clase sera ejecutada al hacer Built del proyecto y ejecutará el processor que contará las lineas de los método con la anotacion.


  El archivo también esta disponible en dropbox en el siguiente vínculo:
  
  <a href="https://www.dropbox.com/s/bqha5p3aknmjg7k/MPAnnotationTest.java?dl=0">MPAnnotation.java</a>

4. Crear directorio 'data' en la raíz del proyecto para que allí se generen los reportes (.csv) con la información del conteo. Si se desea guardar los reportes en una ubicación diferente se debera modificar la ruta en la linea 35 de la clase <b>MPAnnotationProcessorSpoon.java</b>

### Desarrolladores
* Juan David García
* Mauricio Amaya Rios
* Wilmar Fuquen
