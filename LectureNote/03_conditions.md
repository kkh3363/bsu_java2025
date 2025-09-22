## Java Conditions and If Statements
- Conditions and if statements let you control the flow of your program - deciding which code runs, and which code is skipped.
- Think of it like real life: If it rains, take an umbrella. Otherwise, do nothing.
- Every if statement needs a condition that results in true or false.
- This means if statements work hand-in-hand with boolean values:
```
public class Main {
  public static void main(String[] args) {
    boolean isRaining = true;
  
    if (isRaining) {
      System.out.println("Bring an umbrella!");
    }
  }
}
```
- Most often, conditions are created using comparison operators, like the ones below:
  - Less than: a < b
  - Less than or equal to: a <= b
  - Greater than: a > b
  - Greater than or equal to: a >= b
  - Equal to: a == b
  - Not equal to: a != b
