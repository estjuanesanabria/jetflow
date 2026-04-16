# JetFlow - Sistema de Gestion de Aeropuerto

## Descripcion
JetFlow es una aplicacion en consola desarrollada en Java que permite gestionar vuelos y pasajeros dentro de un aeropuerto. El sistema incluye funcionalidades como registro de vuelos, registro de pasajeros, asignacion de pasajeros a vuelos y control del proceso de abordaje mediante estructuras de datos.

## Problematica
En los aeropuertos es necesario gestionar de manera eficiente la informacion de vuelos y pasajeros, asi como organizar el proceso de abordaje. Sin un sistema adecuado, esta gestion puede volverse desordenada, generando errores en la asignacion de pasajeros y en el control de embarque.

JetFlow busca solucionar este problema mediante un sistema en consola que permite registrar vuelos, asignar pasajeros y controlar el abordaje utilizando estructuras de datos que garantizan el orden correcto.

## Objetivo
Desarrollar un sistema que permita administrar vuelos y pasajeros aplicando conceptos de programacion orientada a objetos y estructuras de datos como listas enlazadas y colas.

## Estructura del proyecto

JetFlow/
│
├── Aereopuerto.java   // Clase principal (menu e interaccion)
├── Vuelo.java         // Gestion de vuelos y abordaje
├── Pasajero.java      // Informacion de pasajeros
├── Avion.java         // Informacion del avion

## Como ejecutar
1. Abrir el proyecto en NetBeans
2. Ejecutar la clase Aereopuerto.java (clic derecho sobre la clase aereopuerto y luego run file)

## NOTA IMPORTANTE
REVISAR EN LA CARPETA DEPENDENCE QUE ESTÉ CORRECTAMENTE INSTALADA LA LIBRERÍA "mi-libreria-1.0.0.jar" 
En caso de que el proyecto no ejecute, instalar la librería manuelmente dando clic derecho,  manually install artifact y finalmente seleccionar la libreria correspondiente previamente descargada en el equipo-
## Temas aplicados
- Programacion orientada a objetos: uso de clases como Vuelo, Pasajero y Avion
- Encapsulamiento: atributos privados en todas las clases
- Estructuras de datos:
  - Lista enlazada para gestionar pasajeros
  - Cola para el proceso de abordaje (FIFO)
- Control de flujo: uso de menu interactivo con switch

## Integrantes
-Juan Esteban Sanabria Adame, Katherine Mariana Ortega Contreras
