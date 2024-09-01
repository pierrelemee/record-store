FROM openjdk:21-bookworm

COPY . /app

WORKDIR /app

RUN --mount=type=cache,target=/root/.gradle ./gradlew build --build-cache --configuration-cache

CMD bash -c '(./gradlew build --continuous --parallel --build-cache --configuration-cache) & (./gradlew bootRun)'