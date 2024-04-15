# 1. Proyecto Base
En este proyecto mostraremos los diferentes conceptos a tener en cuenta para poder crear un proyecto SOAP, es este caso 
crearemos una API que me permita determinar si un usuario es mayor de edad o no. Como hemos dicho, lo importante de este 
proyecto no es la complegidad del negocio si no los conceptos y configuraciones a tener en cuenta para poder crear un 
proyecto SOAP.

En primera instancia creamos un proyecto base con las dependencia bases necesarias para iniciar. Proximamente estaremos 
agregando otras dependencias que nos permitirian realizar diferentes tareas de configuracion en el proyecto.

# 2. XSD FILE
En pirmera instancia es necesario conocer algunas diferencias entre conceptos.

- XML (eXtensible Markup Language): Es un lenguaje de representacion de informacion. se basa en una serie de etiquetas para representar la estructura de la informacion.
- XSD (XML Scheme Description): Es un archivo XML que describe la metadata de los servicios que se van a utilizar, es decir, describe los campos necesarios, los tipos de 
datos que se utilizan.
- WSDL (Web Services Description Lenguage): es un archivo XML que describe la informacion de los servicios que se pueden utilizar, asi mismo como sus datos y tipos de datos 
de solicitudes y respuestas. Se debe aclarar que todo WSDL tiene relacionado uno o varios XSD ya que estos que tienen la informacion de la metadata.

Aclarando estos conceptos, es necesario crear el archivos XSD, ya que por medio de este se crean automaticamente las clases que representan la metadata. Tener en cuenta que 
este archivo debe crearse en la carpeta de resource para que sea identificada automaticamente.

Una vez creado el archivo XSD es necesario realizar una configuracion en build.gradle para crear una tarea que permita esta creacion automatica. Cuando se realice la configuracion 
mostrada en el archivo build.gradle solo queda ejecutar el siguiente comando " ./gradlew generateSourcesXsd" donde generateSourceXsd es nombre de la tarea que se registro para la 
creacion automatica del codigo a partir del archivo XSD.

Datos a tener en cuenta:
- Notar que el archivo XSD tiene unos datos del namespace, notar que este name space se conforma a partir del nombre de los paquetes donde se desea crear las clases automaticamente.
- Notar que el name space y la configuracion realizada en el build.gradle tambien deben concordar para poder que hagar match.
- Existen diversas formas de programar las tareas de generacion de codigo automatico del build.gradle