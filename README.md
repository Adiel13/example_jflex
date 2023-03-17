# example_jflex

Ejemplo de la solución mínima del primer examen:
Hecho con Java 17 y Maven 3.9

El archivo para las expresiones regulares:
example_jflex/jflex/src/main/jflex/simple.flex

Definición del token:
example_jflex/jflex/src/main/java/udv/compiladores/app/token.java

Clase donde se ejecuta:
example_jflex/jflex/src/main/java/udv/compiladores/app/App.java

#PUNTOS IMPORTANTES

* Falta una GUI pero eso puede ser generado con cualquier herramienta de GUI
* El proyecto fue hecho en el IDE eclipse, maven y jflex no depende del IDE
* para recorrer los tokens se pude hacer con next_token, no es necesario utilizar CUP
