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

2. Descargar los archivos <b>MPAnnotation.java</b> y <b>MPAnnotationProcessorSpoon.java</b> que deben ser agregados al src del proyecto en un paquete <b>co.edu.uniandes.csw.mp.ann</b>. Estos archivos hacen referencia a la anotación con la que se va a trabajar y al procesor con el que se contaran las lineads de los metodos.
3. Crear directorio data en la raiz del proyecto para que alli se generen los reportes (.csv) con la información del conteo.

### Desarrolladores
* Juan David García
* Mauricio Amaya
* Wilmar Fuquen
