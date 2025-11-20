# activity

Contains small exercise(s).

Typical file(s)
- Guesswork.java — number guessing game (interactive).

How to compile
```
cd /home/jotave/Documentos/Curso-JavaPOO/alura
mkdir -p out
javac -d out activity/*.java
```

How to run
- If `Guesswork` is in package `activity`:
  ```
  java -cp out activity.Guesswork
  ```
- If it has no package:
  ```
  java -cp out Guesswork
  ```

Notes
- The program is interactive and uses standard input.