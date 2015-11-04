# SpAnnLoC
Anotación en Spoon para contador líneas de código de un método. Genera un reporte (.csv) que permite discriminar las líneas de código de un requerimiento para diferentes niveles de la aplicación.

### Descripción
SpAnnLoc se desarrolló en el contexto del curso Gestión de Proyectos de Software de la Universidad de los Andes (Colombia). El objetivo de la anotación es poder cuantificar las líneas de código de un requerimiento para diferentes niveles de una aplicación (Ej. Backend y Servicios). Utiliza Spoon como procesador de anotaciones con lo cual es posible contar fácilmente las líneas de código del método anotado.

### Instrucciones de Uso
**Nota**: Las instrucciones que se presentan a continuación se realizaron tomando como base los proyectos de Marketplace utilizados en el curso.

1. Maven
Inicialmente se debe configurar las dependencia de maven en el archivo pom.xml del proyecto:
Liberia: <a href="http://spoon.gforge.inria.fr/">Spoon</a>
Versión: 4.3.0
Se agrega en propiedades la version de la libreria de spoon:
<pre class="pre">
  <spoon.version>4.3.0</spoon.version>        
</pre>
Se agrega la dependencia:
<dependency>
  <groupId>fr.inria.gforge.spoon</groupId>
  <artifactId>spoon-core</artifactId>
  <version>${spoon.version}</version>
</dependency>   
2. 

### Desarrolladores
* Juan David García
* Mauricio Amaya
* Wilmar Fuquen
