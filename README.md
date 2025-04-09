# 🛒 E-Shopping Zone - Backend (Spring Boot Microservices)

Welcome to the **E-Shopping Zone** backend!  
This is a collaborative, microservices-based e-commerce platform backend, built with **Spring Boot**, **Spring Cloud**, and **Eureka**. It is modular, scalable, and designed to support a seamless shopping experience.

---

## 👨‍💻 Team Collaboration Guidelines

To ensure smooth collaboration and avoid conflicts or confusion, all contributors must follow the guidelines below:

### 🔀 1. Branching Rules

- **NEVER** commit directly to the `main` or `master` branch.
- Always **create a new branch** when working on a new feature, update, or bug fix.
- Branch name should clearly describe your work.  
  Example: `feature-user-registration`, `fix-notification-error`, `update-gateway-routing`

### 📝 2. Branch Description

- Inside each branch, add a brief **description** (in `README.md` or a simple `BRANCH_INFO.md`) stating:
  - What you're adding or updating
  - Why it's being added/updated

Example:
```md
## Branch: feature-user-registration
### Description:
- Added new user registration logic with JWT integration.
- Required for enabling login and authentication.
```

### ✅ 3. Commit Message Format

All commits **must follow this naming format**:
-[YourName] {Add./Update./Delete.} Your commit message


**Examples:**

- `[Kuldeep] Add. Login API in UserService`
- `[Amit] Update. Gateway routes for NotificationService`
- `[Neha] Delete. Unused configs in EurekaServer`

> 🔍 This format helps track changes clearly and keeps the commit history clean and consistent.

---

### 🐞 4. Issues and Bug Tracking

If anyone encounters an error or bug:

- ❌ **Do NOT fix it silently** in your branch.
- ✅ **Raise an issue** in the repository's **"Issues" tab** or add it to a shared `ISSUES.md` file.

Make sure to mention:
- What the issue is
- Steps to reproduce
- Logs or screenshots (if available)

**Example:**

```markdown
## Issue: NotificationService fails to send email
- Error on port 8082: `Connection refused`
- Occurs when user registers
```

### 📦 Project Structure
```markdown
E-Shopping_zone/
├── APIGetway/             --> Spring Cloud Gateway for routing requests
│   └── src/
├── EurekaServer/          --> Eureka Discovery Server
│   └── src/
├── UserService/           --> Microservice for user operations
│   └── src/
├── NotificationService/   --> Microservice for handling notifications
│   └── src/
├── README.md              --> Main project overview & collaboration rules
└── ISSUES.md              --> Optional: Raised bugs and blockers
```

## 🚀 How to Run the Project
### 📥 Clone the Repository
```bash
git clone https://github.com/your-org/e-shopping-zone.git
cd e-shopping-zone
```
### 🟢 Start Eureka Server
```bash
cd EurekaServer
./mvnw spring-boot:run
```
### 🟢 Start API Gateway
```bash
cd ../APIGetway
./mvnw spring-boot:run
```
### 🟢 Start Other Microservices
```bash
cd ../UserService
./mvnw spring-boot:run

cd ../NotificationService
./mvnw spring-boot:run
```
-Do this to run all service

### 🤝 Contributors
-Amaan
-Nishank
-Kuldeep
