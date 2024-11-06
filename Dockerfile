# Dockerfile
FROM cepgbaseacr.azurecr.io/docker.io/openjdk:17-slim

WORKDIR /app

# 프로젝트 파일 복사 및 빌드
COPY . /app
RUN ./gradlew build

# 애플리케이션 실행
CMD ["java", "-jar", "build/libs/<YourAppName>.jar"]
