# Curso-JavaPOO — Project Overview

Summary
A small collection of Java exercises and examples for object-oriented programming practice. The repository is organized into separate modules: `activity`, `challenge`, and `screenmatch`. Each module contains source files and a module-level README.

Requirements
- JDK 11 or later (OpenJDK / Oracle JDK).
- Optional: Maven or Gradle for dependency and test management.

Build (using javac)
POSIX (Linux / macOS / WSL):
```bash
# from repository root
mkdir -p out
find . -name "*.java" | xargs javac -d out
```
Windows (PowerShell):
```powershell
# from repository root
New-Item -ItemType Directory -Force -Path out
Get-ChildItem -Recurse -Filter *.java | ForEach-Object { $_.FullName } | javac -d out @-
```

Run a main class
Use the fully qualified main class name (package + class):
```bash
java -cp out fully.qualified.MainClass
# examples:
# java -cp out challenge.Main
# java -cp out screenmatch.Main
```

Clean compiled output
```bash
rm -rf out
# or remove .class files
find . -type f -name "*.class" -delete
```

Testing (recommended)
- Preferred: use Maven or Gradle to declare JUnit 5 and run tests.
  - Maven: `mvn -q -DskipTests=false test`
  - Gradle: `./gradlew test`
- Alternate (manual): download JUnit Jupiter jars and compile tests with the jars on the classpath, then run with the test runner JARs — this is error-prone and not recommended for ongoing development.

Quick Maven JUnit snippet (pom.xml dependencies)
```xml
<dependency>
  <groupId>org.junit.jupiter</groupId>
  <artifactId>junit-jupiter</artifactId>
  <version>5.9.3</version>
  <scope>test</scope>
</dependency>
```

Guidelines
- Keep domain logic (business rules) separate from console I/O for easy testing.
- Encapsulate fields (private) and provide behavior methods (e.g., `deposit`, `withdraw`, `transfer`).
- Add unit tests that exercise core logic without relying on Scanner or System.in.

# challenge

Overview
Banking exercise modeling customers and account operations. Contains examples for encapsulation and basic domain behavior.

Core classes
- `Person` — customer model (name, account type, balance). Prefer methods: `getBalance()`, `deposit(double)`, `withdraw(double)`.
- `Account` — operations and CLI menu that orchestrates actions on a `Person`.
- `Bank` — optional manager for multiple accounts.
- `Main` — program entry point.

Build and run
```bash
mkdir -p out
javac -d out challenge/*.java
java -cp out challenge.Main
```

Design & test recommendations
- Keep `balance` private; expose only controlled operations:
  - `double getBalance()`
  - `void deposit(double amount)`
  - `boolean withdraw(double amount)` (returns success/failure)
  - `boolean transferTo(Person target, double amount)`
- Place all business logic in model classes (Person/Account) and keep the CLI code in a thin runner class to make unit testing straightforward.
- Add JUnit 5 tests that validate deposit/withdraw/transfer behavior (no Scanner usage in tests).

Example testing workflow (Maven)
- Add JUnit 5 dependency to `pom.xml`.
- Create `src/test/java/...` tests and run `mvn test`.

Common commands
- Compile only challenge module: `javac -d out challenge/*.java`
- Run: `java -cp out challenge.Main`
- Clean: `rm -rf out` or `find . -name "*.class" -delete`

# screenmatch

Purpose
Simple domain example modeling movies and a small CLI/runner that demonstrates usage of the `Movie` model.

Files
- `Movie.java` — data model for movies (title, year, rating, etc.).
- `Main.java` — demo runner that creates `Movie` objects and prints results.

Build and run
```bash
mkdir -p out
javac -d out screenmatch/*.java
java -cp out screenmatch.Main
```

Testing recommendations
- Encapsulate logic in `Movie` (e.g., rating calculations, comparisons) and cover with unit tests using JUnit 5.
- Prefer immutable model objects when possible (final fields, no setters) to simplify reasoning and tests.

Notes
- Implement `toString`, `equals`, and `hashCode` if objects are compared in tests or printed in assertions.