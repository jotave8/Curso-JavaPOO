# activity

Purpose
Collection of small, interactive Java exercises intended to practice basic control flow, input/output, and simple algorithms.

Files
- Guesswork.java — number guessing game (interactive). Confirm package declaration at top of file before running.

Requirements
- JDK 11+.

Build and run (javac)
From repository root:
```
mkdir -p out
javac -d out activity/*.java
java -cp out activity.Guesswork
```
If `Guesswork.java` has no package declaration, run:
```
javac -d out activity/Guesswork.java
java -cp out Guesswork
```

Testing
- Add unit tests (JUnit 5) for non-interactive logic extracted from interactive code.
- For interactive programs, refactor logic into testable classes/methods and use dependency injection for input streams.

Notes
- Avoid closing `System.in` inside small exercises to keep environment stable in multi-run sessions.
- Keep user prompts and I/O clearly separated from logic for easier testing.# activity

Purpose
Collection of small, interactive Java exercises intended to practice basic control flow, input/output, and simple algorithms.

Files
- Guesswork.java — number guessing game (interactive). Confirm package declaration at top of file before running.

Requirements
- JDK 11+.

Build and run (javac)
From repository root:
```
mkdir -p out
javac -d out activity/*.java
java -cp out activity.Guesswork
```
If `Guesswork.java` has no package declaration, run:
```
javac -d out activity/Guesswork.java
java -cp out Guesswork
```

Testing
- Add unit tests (JUnit 5) for non-interactive logic extracted from interactive code.
- For interactive programs, refactor logic into testable classes/methods and use dependency injection for input streams.

Notes
- Avoid closing `System.in` inside small exercises to keep environment stable in multi-run sessions.
- Keep user prompts and I/O clearly separated from logic for easier testing.