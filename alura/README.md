# Curso-JavaPOO (Alura exercises)

Small collection of Java exercises and examples used in the Curso Java POO.

Structure
- activity/ — small exercises (e.g. Guesswork).
- challenge/ — small banking challenge with `Account`, `Bank`, `Person`, `Main`.
- screenmatch/ — simple movie model and example.

Requirements
- Java 11+ (or compatible JDK)

How to compile
1. From project root:
   ```
   mkdir -p out
   javac -d out $(find . -name "*.java")
   ```

How to run
- challenge example:
  ```
  java -cp out challenge.Main
  ```
- screenmatch example:
  ```
  java -cp out screenmatch.Main
  ```
- activity examples:
  If the class is in package `activity`:
  ```
  java -cp out activity.Guesswork
  ```
  If the class has no package, run:
  ```
  java -cp out Guesswork
  ```

Clean compiled classes
```
find . -type f -name "*.class" -delete
```