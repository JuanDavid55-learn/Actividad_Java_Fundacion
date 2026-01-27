# 📘 Sistema de Registro – Fundación de Ayudas Comunitarias

## 📌 Descripción del proyecto

Este proyecto corresponde a un sistema de registro desarrollado en **Java**, cuyo objetivo es optimizar el proceso de gestión de personas dentro de una fundación de ayudas comunitarias.

El programa permite registrar y visualizar distintos tipos de personas, facilitando la administración de la información y reduciendo el tiempo invertido en procesos manuales.

---

## 🎯 Objetivo

Automatizar el registro de:

- Empleados  
- Colaboradores  
- Beneficiarios  

Aplicando los principios de la **Programación Orientada a Objetos (POO)**.

---

## 🧠 Funcionamiento general

El sistema se ejecuta desde consola y presenta un **menú principal interactivo**, el cual permite:

1. Registrar personas  
2. Ver personas registradas  
3. Salir del sistema  

Todas las opciones cuentan con validaciones para evitar errores en el ingreso de datos.

---

## 👥 Tipos de personas

El sistema parte de una clase base llamada `personas`, de la cual heredan los siguientes tipos:

### 🔹 Empleado
Datos adicionales:
- Salario
- Cargo
- Horario laboral:
  - 8:00 a.m. – 5:00 p.m.
  - 2:00 p.m. – 11:00 p.m.

### 🔹 Colaborador
Características:
- Horas voluntarias mensuales (máximo 25)
- Bonificación según horas cumplidas

### 🔹 Beneficiario
Características:
- Cantidad de ayudas recibidas al mes (máximo 5)

---

## 🏗️ Estructura del proyecto

El sistema está organizado bajo el patrón **MVC (Modelo – Vista – Controlador)**.

### 📁 MODELO
Contiene las clases:

- `personas` (clase base)
- `empleados`
- `colaboradores`
- `beneficiario`

Cada clase implementa el método:

- `presentarse()`

Este método permite mostrar la información específica de cada tipo de persona mediante **polimorfismo**.

---

### 📁 CONTROLADOR
Incluye la clase:

- `funciones`

Responsabilidades principales:

- Mostrar el menú principal
- Validar los datos ingresados
- Registrar personas según su tipo
- Almacenar los registros en una lista
- Mostrar la información registrada

Además, hereda de una **clase abstracta**, garantizando la implementación de métodos comunes.

---

### 📁 VISTA
Contiene la clase principal:

- `ActividadFundacion`

Desde esta clase se ejecuta el programa y se inicia el menú principal.

---

## 🔒 Validaciones implementadas

El sistema cuenta con validaciones que permiten:

- Evitar valores fuera del rango permitido
- Controlar errores de entrada (por ejemplo, letras en campos numéricos)
- Garantizar estabilidad durante la ejecución

---

## ▶️ Ejecución del programa

1. Ejecutar la clase `ActividadFundacion`
2. Interactuar con el menú desde la consola
3. Registrar o visualizar personas según la opción seleccionada

---

## 🧩 Conceptos aplicados

- Programación Orientada a Objetos (POO)
- Herencia
- Polimorfismo
- Clases abstractas
- Encapsulamiento
- Uso de `ArrayList`
- Manejo de excepciones
- Validación de datos
- Arquitectura MVC

---

## 🚀 Posibles mejoras futuras

- Implementar persistencia de datos (archivos o base de datos)
- Crear una interfaz gráfica
- Mejorar el manejo de excepciones
- Implementar reportes
- Separar validaciones en una clase independiente

---

## 👨‍💻 Autor

**Juan David Barrera Torres**  
Proyecto académico desarrollado en Java.
