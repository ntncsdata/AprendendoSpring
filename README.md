# 🌱 Aprendendo Spring Boot — API REST com Segurança JWT

API REST desenvolvida durante o aprendizado de Spring Boot, com autenticação e autorização usando JWT e Spring Security.

---

## 🚀 Funcionalidades

- Cadastro de usuário com senha criptografada
- Login com geração de token JWT
- Busca de usuário por e-mail
- Exclusão de usuário por e-mail
- Validação de e-mail duplicado
- Proteção de rotas com Spring Security

---

## 🛠️ Tecnologias

- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- JWT (JSON Web Token)
- Lombok
- PostgreSQL / MySQL
- IntelliJ IDEA

---

## 📁 Estrutura do Projeto

```
aprendendo_spring/
├── business/
│   └── UsuarioService.java        # Regras de negócio
├── controller/
│   ├── dtos/
│   │   └── UsuarioDTO.java        # Objeto de transferência de dados
│   └── UsuarioController.java     # Endpoints da API
├── infrastructure/
│   ├── entity/
│   │   ├── Usuario.java           # Entidade principal
│   │   ├── Endereco.java          # Entidade endereço
│   │   └── Telefone.java          # Entidade telefone
│   ├── exceptions/
│   │   ├── ConflictExceptions.java
│   │   └── ResourceNotFoundException.java
│   ├── repository/
│   │   ├── UsuarioRepository.java
│   │   ├── EnderecoRepository.java
│   │   └── TelefoneRepository.java
│   └── security/
│       ├── JwtUtil.java           # Geração e validação do token
│       ├── JwtRequestFilter.java  # Filtro de autenticação
│       ├── SecurityConfig.java    # Configuração do Spring Security
│       └── UserDetailsServiceImpl.java
└── AprendendoSpringApplication.java
```

---

## 📡 Endpoints

| Método | Rota | Descrição | Autenticação |
|---|---|---|---|
| `POST` | `/usuario` | Cadastra novo usuário | ❌ |
| `POST` | `/usuario/login` | Realiza login e retorna token JWT | ❌ |
| `GET` | `/usuario?email=` | Busca usuário por e-mail | ✅ |
| `DELETE` | `/usuario/{email}` | Deleta usuário por e-mail | ✅ |

---

## 🔒 Autenticação

O projeto usa JWT para proteger as rotas. Após o login, o token é retornado no formato:

```
Bearer eyJhbGciOiJIUzI1NiJ9...
```

Para acessar rotas protegidas, envie o token no header:

```
Authorization: Bearer {token}
```

---

## ▶️ Como executar

1. Clone o repositório
```bash
git clone https://github.com/seu-usuario/aprendendo-spring.git
```

2. Configure o banco de dados no `application.properties`

3. Execute o projeto pelo IntelliJ IDEA ou via terminal:
```bash
./mvnw spring-boot:run
```

---

## 👨‍💻 Autor

Projeto desenvolvido durante o aprendizado de Spring Boot com foco em APIs REST e segurança com JWT.
