# Record store 📀 - Spring boot edition

## Development

### Prerequisites

Download Chinook database:

```bash
curl -L https://github.com/lerocha/chinook-database/releases/download/v1.4.5/Chinook_MySql_AutoIncrementPKs.sql | grep -v Chinook_AutoIncrement > ./.docker/mysql/init/Chinook_MySql_AutoIncrementPKs.sql 

docker compose up -d mysql

# If mysql was started before:
docker compose rm --stop mysql
```

### Docker

Run:

```bash
docker compose build
docker compose up -d
```

Test:

```bash
docker compose exec app bash -c './gradlew clean test --info'
```

### Native

#### Run

To enable _hot reload_, run in one terminal:

```bash
./gradlew build --continuous --parallel --build-cache --configuration-cache
```

And in another:

```bash
./gradlew bootRun
```

#### Execute tests

Run with `gradle`:

```bash
./gradlew clean test --info
```

Read more [in this article](https://www.baeldung.com/spring-boot-testing).
