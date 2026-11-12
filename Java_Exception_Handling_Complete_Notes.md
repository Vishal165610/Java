## Main Class

```java
public class Main {

    public static void main(String[] args) {

        BankAccount account =
                new BankAccount();

        try {

            account.withdraw(5000);

        }

        catch(InsufficientBalanceException e) {

            System.out.println(
                    e.getMessage());

        }

        finally {

            System.out.println(
                    "Transaction Completed");
        }
    }
}
```

Output:

```text
Insufficient Balance
Transaction Completed
```

---

# Summary

Master these topics:

✅ try

✅ catch

✅ finally

✅ throw

✅ throws

✅ Checked Exceptions

✅ Unchecked Exceptions

✅ Custom Exceptions

✅ Multi-Catch

✅ Try-With-Resources

✅ Exception Propagation

✅ Best Practices

✅ Interview Questions

✅ Real-World Project

After mastering these concepts, you will be comfortable handling exceptions in Java applications, Spring Boot projects, enterprise systems, and technical interviews.