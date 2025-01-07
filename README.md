# SpringKafka

<p align="center">
  <a href="#"><img src="https://img.shields.io/badge/Spring_Boot-2.7.11-brightgreen" alt="Spring Boot"></a>
  <a href="#"><img src="https://img.shields.io/badge/Kotlin-1.6.21-blue" alt="Kotlin"></a>
  <a href="#"><img src="https://img.shields.io/badge/Kafka-Streaming-orange" alt="Kafka"></a>
</p>

📚 **SpringKafka** es un ejemplo práctico de cómo integrar **Apache Kafka** con **Spring Boot** y **Kotlin** para la producción y consumo de mensajes en sistemas distribuidos.

---

## 🛠️ Características

- **Framework:** Spring Boot 2.7.11
- **Lenguaje:** Kotlin 1.6.21
- **Streaming:** Apache Kafka
- **Base de Datos:** Sin persistencia (en este ejemplo)
- **Pruebas:** Configuración con Spring Boot Starter Test y Kafka Test

---

## 🚀 Requisitos

- **Java:** 17
- **Apache Kafka:** Instalado y corriendo localmente o en un clúster
- **Maven/Gradle:** Para construir y ejecutar el proyecto

---

## 📦 Configuración del Proyecto

1. **Clonar el repositorio:**

   ```bash
   git clone https://github.com/GeovannyCode/springkafka.git
   cd springkafka
   ```

2. **Configurar Kafka:**

Asegúrate de que Apache Kafka esté configurado y corriendo. Modifica el archivo application.properties si es necesario:

```properties
spring.kafka.bootstrap-servers=localhost:9092
spring.kafka.consumer.group-id=springkafka-demo
```

3. **Ejecutar el proyecto:**

```bash
./gradlew bootRun
```

4. **Probar la funcionalidad:**

Usa herramientas como Kafka Console Producer/Consumer o una librería HTTP para enviar y recibir mensajes.

```bash
src/
├── main/
│   ├── kotlin/com/geovannycode/springkafka
│   │   ├── config/          # Configuración de Kafka
│   │   ├── controller/      # Controladores REST
│   │   ├── producer/        # Lógica de producción de mensajes
│   │   ├── consumer/        # Lógica de consumo de mensajes
│   │   └── model/           # Clases de modelo (opcional)
└── test/                     # Pruebas unitarias e integración
```

