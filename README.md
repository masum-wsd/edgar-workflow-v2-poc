
# EDGAR V2 Workflow POC

Trying to make this project as starter point for one of the microservice of EDGAR v2 project.


## Tech Stack

**Framework:** Java Spring Boot

**Server:** Apache Tomcat

**Tools:** Intellij IDEA, Docker Desktop, pgAdmin4

## Badges

| ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) | ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) | ![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white) |
|------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------|
| ![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white) | ![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white) | ![Swagger](https://img.shields.io/badge/-Swagger-%23Clojure?style=for-the-badge&logo=swagger&logoColor=white) |
| ![Apache Tomcat](https://img.shields.io/badge/apache%20tomcat-%23F8DC75.svg?style=for-the-badge&logo=apache-tomcat&logoColor=black) | ![Sentry](https://img.shields.io/badge/sentry-%23362D59.svg?style=for-the-badge&logo=sentry&logoColor=white) | ![Dependabot](https://img.shields.io/badge/dependabot-025E8C?style=for-the-badge&logo=dependabot&logoColor=white) |
| ![GitHub Actions](https://img.shields.io/badge/github%20actions-%232671E5.svg?style=for-the-badge&logo=githubactions&logoColor=white) | ![MariaDB](https://img.shields.io/badge/MariaDB-003545?style=for-the-badge&logo=mariadb&logoColor=white) | ![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white) |
| ![Snyk](https://img.shields.io/badge/Snyk-4C4A73?style=for-the-badge&logo=snyk&logoColor=white) | ![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=Spring-Security&logoColor=white) | ![JWT](https://img.shields.io/badge/JWT-black?style=for-the-badge&logo=JSON%20web%20tokens) |
| ![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white) | ![Prometheus](https://img.shields.io/badge/Prometheus-000000?style=for-the-badge&logo=prometheus&labelColor=000000) | ![Kibana](https://img.shields.io/badge/Kibana-005571?style=for-the-badge&logo=Kibana&logoColor=white) |

## To Run Locally

Clone the project

```bash
  git clone https://github.com/wsd-team-dev/edgar-workflow-v2-poc.git
```

Go to the project directory

```bash
cd edgar-workflow-v2-poc
```

Install dependencies

```bash
mvn clean install
```

Start the server

```bash
mvn spring-boot:run
```


## Features

- Spring Data JPA used
- DB migration tool liquibase integrated
- ELK with filebeat integrated
- Hierarchy supported role based authorization with Keycloak integrated


## Related

To see the complete dependency tree of this project:

```bash
mvn dependency:tree -Dverbose
```

To fetch all git history:

```bash
git reflog
```
## Screenshots

![App Screenshot](https://via.placeholder.com/468x300?text=App+Screenshot+Here)


## Demo

Insert gif or link to demo


## Documentation

[Documentation](https://linktodocumentation)

