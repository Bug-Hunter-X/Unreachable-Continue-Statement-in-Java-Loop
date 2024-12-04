# Unreachable Continue Statement in Java

This repository demonstrates a subtle bug in Java where a `continue` statement is placed after a `break` statement within a `while` loop.  The `continue` statement will never execute because the `break` statement terminates the loop prematurely.

## Bug Description
The code contains a `while` loop that iterates as long as `i` is less than 10. Inside the loop, if `i` equals 5, the `break` statement exits the loop. However, there's another `if` statement checking for `i == 7` with a `continue` statement. This `continue` statement is unreachable because the loop terminates at `i == 5`. This illustrates a scenario where the placement of control flow statements can lead to unexpected behavior or hidden errors.