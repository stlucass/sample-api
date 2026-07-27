# Contributing

Obrigado por contribuir com o **Sample API**! 🎉

## Setup

### Codespaces (Recomendado)
1. Code → Codespaces → Create

### Local
1. Instale Java 21+
2. Instale Maven 3.8+
3. `mvn clean verify`

## Workflow

1. Crie uma branch: `git checkout -b feat/minha-feature`
2. Faça as alterações
3. Rode os testes: `mvn clean test`
4. Commit: `git commit -m "feat: descrição"`
5. Push: `git push origin feat/minha-feature`
6. Crie um Pull Request

## Commit Message Format

```
feat(scope): descrição
fix(scope): descrição
chore: descrição
docs: descrição
test: descrição
refactor: descrição
```

## Code Standards

- Java 21+
- Siga o Google Java Style Guide
- Escreva testes unitários para toda lógica nova
- Todos os testes devem passar antes do merge

## Testing

```bash
mvn clean test        # Testes unitários
mvn verify            # Verificação completa
```

## Branch Strategy

- `main` → Produção
- `develop` → Staging / desenvolvimento ativo
- `feat/*` → Novas features
- `fix/*` → Correção de bugs
- `chore/*` → Manutenção
