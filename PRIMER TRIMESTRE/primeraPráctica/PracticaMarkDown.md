# Tutorial: Cómo crear un Hola Mundo en Java

Este repositorio explica paso a paso cómo crear, compilar y ejecutar un programa básico en Java desde cero.

## 1. ¿Qué es Java?

Java es un lenguaje de programación muy utilizado debido a su portabilidad, facilidad de uso y su comunidad.
Permite ejecutar un mismo programa en distintos sistemas operativos siempre que tengan instalada la máquina virtual de Java (JVM).

## 2. Requisitos previos

Antes de empezar, es necesario tener instalado lo siguiente:

### Java Development Kit (JDK)

Se puede descargar desde la página oficial:  
https://www.oracle.com/java/technologies/downloads/

Versión recomendada: **JDK 17** o **JDK 21**.

### Editor de código o IDE

Cualquiera es válido. Por ejemplo:

- Visual Studio Code  
- IntelliJ IDEA  
- Eclipse  
- Bloc de notas (básico)

## 3. Crear el archivo del proyecto

1. Crear una carpeta llamada `HolaMundoJava`.  
2. Dentro, crear un archivo llamado:

```
HolaMundo.java
```

3. Escribir el siguiente código:

```java
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola mundo desde Java!");
    }
}
```

## 4. Compilar el programa

Abrir una terminal dentro de la carpeta del proyecto y ejecutar:

```
javac HolaMundo.java
```

Si todo va bien, se generará el archivo:

```
HolaMundo.class
```

## 5. Ejecutar el programa

En la misma terminal, ejecutar:

```
java HolaMundo
```

El resultado será:

```
Hola mundo desde Java!
```

## 6. Conclusión

Con esto ya se ha creado, compilado y ejecutado un programa básico en Java.
Es un ejemplo sencillo para entender cómo funciona el flujo básico de trabajo en este lenguaje.
