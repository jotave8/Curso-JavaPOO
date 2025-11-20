# challenge

Small banking challenge. Main classes:
- Person.java — model for a customer (name, balance, account type). Add `getBalance()` / `setBalance()` or deposit/withdraw methods.
- Account.java — UI/operations wrapper that uses `Person` (composition). Provides menu, checkBalance, receiveValue, transferValue.
- Bank.java — (utility or manager class, if present).
- Main.java — entry point that ties Person and Account together.

How to compile
```
cd /home/jotave/Documentos/Curso-JavaPOO/alura
mkdir -p out
javac -d out challenge/*.java
```

How to run
```
java -cp out challenge.Main
```

Notes & tips
- Keep `balance` private in `Person` and expose controlled methods (`getBalance()`, `setBalance(double)` or `deposit(double)` / `withdraw(double)`).
- Use `Scanner` carefully (close it once, avoid closing System.in if other code needs it).