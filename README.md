# 🏥 Patients App

Une application de gestion de patients développée avec **Spring Boot**, **Spring Data JPA**, et **MySQL**. Elle permet de créer, consulter, rechercher, modifier et supprimer des patients dans une base de données.

---

## 📦 Technologies utilisées

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL (ou H2 pour test rapide)
- Maven
- IntelliJ IDEA

---

## ⚙️ Configuration de la base de données

### MySQL (défaut)

```properties
server.port=8085
spring.application.name=patients-app
spring.datasource.url=jdbc:mysql://localhost:3307/patients-db?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MariaDBDialect
spring.jpa.hibernate.ddl-auto=update
```

> 📝 Assurez-vous que MySQL tourne sur le port `3307` et que l'utilisateur `root` a les permissions nécessaires.

### H2 (alternative)

Pour utiliser une base H2 en mémoire (utile pour les tests), remplace le contenu du `application.properties` par :

```properties
server.port=8085
spring.application.name=patients-app
spring.datasource.url=jdbc:h2:mem:patients-db
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=update
```

Accès à la console H2 : `http://localhost:8085/h2-console`

---

## 🏗️ Structure du projet

- `entities/Patient.java` : Classe JPA représentant un patient.
- `repository/PatientRepository.java` : Interface JPA Repository pour les opérations CRUD.
- `PatientsAppApplication.java` : Classe principale avec `CommandLineRunner` pour insérer des données de test et effectuer des opérations.

---

## 📋 Fonctionnalités

- 🔍 Rechercher les patients par nom (`findByNomContains`)
- 🔍 Rechercher avec requête JPQL personnalisée (`@Query`)
- ➕ Ajouter un patient
- ✏️ Modifier un patient
- 🗑️ Supprimer un patient
- 📄 Afficher tous les patients

---

## ▶️ Lancer le projet

1. Cloner le dépôt :

```bash
git clone https://github.com/OsmBHC/patients-app.git
cd patients-app
```

2. Ouvrir dans IntelliJ IDEA (ou ton IDE préféré)

3. Lancer le projet :
   - Via `mvn spring-boot:run`
   - Ou avec le bouton **Run** dans IntelliJ

---

## 🧪 Exemple de données insérées

```java
patientRepository.save(new Patient(null, "Mohammed", new Date(), false, 134));
patientRepository.save(new Patient(null, "Hanane", new Date(), false, 432));
patientRepository.save(new Patient(null, "Imane", new Date(), true, 156));
```

---

## 📜 Licence

Ce projet est open-source et libre d’utilisation pour les besoins pédagogiques.
