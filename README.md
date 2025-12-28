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

<img width="556" height="250" alt="image" src="https://github.com/user-attachments/assets/1e9bd093-8af7-4fb3-902b-422a94ba19ca" />

<img width="1669" height="695" alt="image" src="https://github.com/user-attachments/assets/da01be1f-9055-4732-9709-321563e7872f" />


<img width="1680" height="556" alt="image" src="https://github.com/user-attachments/assets/18092b5e-5715-4b37-8d64-df7f12120057" />


Desde NetBeans o consola:

```bash
mvn clean compile exec:java








