# Week 10.1 – Busiest Bus Row

## Problem 10: Busiest Bus Row

**Task**
A college bus records how many students sit in each seat as a 2D grid (each row = one row of seats).
Implement `busiestRow(grid)` that returns the **index** of the row with the largest total **and** that total.
If two rows tie, return the one with the **smaller index**.

**Constraints**
- `1 <= rows, columns <= 10`
- `0 <= grid[i][j] <= 3`

**Example**
```
grid = [[2, 0, 1],
        [3, 3, 1],
        [1, 1, 1]]

Expected Output: Row 1, Total 7
```

**Complexity**
- Time:  O(r × c)
- Extra space: O(1)

**Hint**
Outer loop for rows, inner loop to sum seats; update the best row only when a total is **strictly larger**.
