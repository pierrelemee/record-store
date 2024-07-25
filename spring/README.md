# Record store 📀 - Spring boot edition

## Development

### Run

To enable _hot reload_, run in one terminal:

```bash
./gradlew build --continuous --parallel --build-cache --configuration-cache
```

And in another:

```bash
./gradlew bootRun
```

### Execute tests

Run with `gradle`:

```bash
./gradlew clean test --info
```

Read more [in this article](https://www.baeldung.com/spring-boot-testing).
