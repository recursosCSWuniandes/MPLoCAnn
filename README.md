# SpAnnLoC
Anotación en Spoon para contador líneas de código de un método. Genera un reporte (.csv) que permite discriminar las líneas de código de un requerimiento para diferentes niveles de la aplicación.

### Descripción
SpAnnLoc se desarrolló en el contexto del curso Gestión de Proyectos de Software de la Universidad de los Andes (Colombia). El objetivo de la anotación es poder cuantificar las líneas de código de un requerimiento para diferentes niveles de una aplicación (Ej. Backend y Servicios). Utiliza Spoon como procesador de anotaciones con lo cual es posible contar fácilmente las líneas de código del método anotado.

### Instrucciones de Uso
**Nota**: Las instrucciones que se presentan a continuación se realizaron tomando como base los proyectos de Marketplace utilizados en el curso.

1. Dependencia Maven:

  Agregar la dependencia de Spoon (actualmente 4.3.0) al archivo pom.xml de Maven que se encuentra en la carpeta `Project Files` del proyecto. **Esto lo debe hacer para ambos proyectos (logic y web)**.

  ```xml
    <dependency>
      <groupId>fr.inria.gforge.spoon</groupId>
      <artifactId>spoon-core</artifactId>
      <version>4.3.0</version>
    </dependency> 
  ```
  **Nota**: Debe asegurarse que también se haya agregado la dependencia de JUnit (en cualquier versión) al pom.xml de ambos proyectos.

2. Anotación y Procesador:

  Descargar los archivos <b>MPAnnotation.java</b> y <b>MPAnnotationProcessorSpoon.java</b> que deben ser agregados a la carpeta `Source Packages` del proyecto logic en el paquete <b>co.edu.uniandes.csw.mp.ann</b> (debe crear el paquete). Estos archivos hacen referencia a la anotación con la que se va a trabajar y al procesador de Spoon con el que se contarán las lineas de los métodos.
  
  <a href="https://www.dropbox.com/s/t76k6ykxmyy0unc/MPAnnotation.java?dl=0">MPAnnotation.java</a>
  
  <a href="https://www.dropbox.com/s/2vm6svhgpdz8c4l/MPAnnotationProcessorSpoon.java?dl=0">MPAnnotationProcessorSpoon.java</a>
  
3. Launcher:
  
  Descargar el archivo <b>MPAnnotationTest.java </b> que debe ser agregado en la carpeta `Test Packages` de los proyectos **logic y web** en un paquete <b>co.edu.uniandes.csw.mp.ann.test</b> (debe crear el paquete). Este archivo es necesario pues contiene el Launcher que permite ejecutar el procesador de Spoon al momento de hacer build.

  <a href="https://www.dropbox.com/s/bqha5p3aknmjg7k/MPAnnotationTest.java?dl=0">MPAnnotation.java</a>

4. Output:

  Crear la carpeta `data` en el proyecto logic y web para que allí se guarden los reportes (.csv) con la información del conteo. Si se desea guardar los reportes en una ubicación diferente se deberá modificar la ruta en la linea `35` de la clase <b>MPAnnotationProcessorSpoon.java</b>.

5. Uso:

  Finalmente se debe agregar la anotación a los métodos que queremos sean contados de la siguiente manera:

  ```java
    @MPAnnotation(tier="<nombre_nivel>", reqId="<id_requerimiento>")
  ```
  
  Ejemplo:

  ```java
    @MPAnnotation(tier="Backend", reqId="C4-R5")
  ```

### Desarrolladores
* Juan David García
* Mauricio Amaya Rios
* Wilmar Fuquen
