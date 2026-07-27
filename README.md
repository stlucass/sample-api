# Sample API

> DevOps sample project for testing CI/CD workflows.

## Quick Start

### Local Development

```bash
git clone https://github.com/LizardsDBA/sample-api.git
cd sample-api
mvn clean package
java -jar target/sample-api-1.0.0.jar
```

### With Codespaces

1. Click **Code** → **Codespaces** → **Create codespace on main**
2. Wait for environment to load
3. Run: `mvn clean verify`
4. API runs on http://localhost:8080

## API Endpoints

| Endpoint | Método | Descrição |
|----------|--------|-----------|
| `GET /api/health` | GET | Health check da aplicação |
| `GET /actuator/health` | GET | Health check do Actuator |
| `GET /actuator/info` | GET | Informações da aplicação |
| `GET /actuator/metrics` | GET | Métricas da aplicação |

## CI/CD

- **CI**: Roda a cada push em `main` / `develop` e em PRs (matrix Java 17 e 21)
- **CD**: Deploy automático em push na `main`, release criada em tags `v*`

## Testing

```bash
mvn test        # Roda os testes unitários
mvn verify      # Verificação completa
```

## Docker

```bash
# Build da imagem
mvn clean package -DskipTests
docker build -f docker/Dockerfile -t sample-api:latest .

# Rodar o container
docker run -p 8080:8080 sample-api:latest
```

## Estrutura do Projeto

```
sample-api/
├── .github/
│   ├── workflows/
│   │   ├── ci.yml        # Pipeline de CI
│   │   └── cd.yml        # Pipeline de CD
│   ├── CODEOWNERS
│   └── ISSUE_TEMPLATE/
├── .devcontainer/        # Configuração do Codespaces
├── src/
│   ├── main/java/com/lizardsdba/api/
│   │   ├── Application.java
│   │   ├── controller/HealthController.java
│   │   └── service/GreetingService.java
│   └── test/
├── docker/Dockerfile
└── pom.xml
```

## Contributing

Veja [CONTRIBUTING.md](CONTRIBUTING.md)

## License

MIT
