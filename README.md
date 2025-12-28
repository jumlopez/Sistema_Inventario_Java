Sistema de Inventario – Java + Oracle Autonomous

Proyecto de consola desarrollado en **Java** que implementa un **CRUD completo**
(Create, Read, Update, Delete) conectado a una **Oracle Autonomous Database**.

Este proyecto fue creado como práctica académica para reforzar el uso de:
- JDBC
- DAO
- Bases de datos en la nube
- Buenas prácticas básicas en Java

---

Funcionalidades

 Listar productos  
 Agregar productos  
 Actualizar precio y stock  
 Eliminar productos  
 Conexión segura a Oracle Autonomous usando Wallet  

---

Tecnologías utilizadas

- **Java 24**
- **Maven**
- **Oracle Autonomous Database**
- **JDBC**
- **SQL Developer**
- **NetBeans**

---

Estructura del proyecto

SistemaInventario
│
├── src/main/java
│ ├── cl.juan.sistemainventario
│ │ └── SistemaInventario.java
│ │
│ ├── dao
│ │ └── ProductDAO.java
│ │
│ ├── model
│ │ └── Product.java
│ │
│ └── db
│ └── DBConnection.java
│
├── pom.xml
└── README.md


---

Arquitectura utilizada

El proyecto utiliza el patrón **DAO (Data Access Object)** para separar:
- Lógica de negocio
- Acceso a datos
- Modelo de datos

Esto facilita el mantenimiento y escalabilidad del sistema.

---

Configuración de la base de datos

La conexión se realiza mediante:
- Oracle Autonomous Database
- Wallet (TNS_ADMIN)
- Driver JDBC de Oracle

La cadena de conexión utiliza un servicio definido en el archivo `tnsnames.ora`.

Por seguridad, las credenciales y el Wallet **no están incluidos** en este repositorio.

---

Ejecución del proyecto

Desde NetBeans o consola:

```bash
mvn clean compile exec:java


