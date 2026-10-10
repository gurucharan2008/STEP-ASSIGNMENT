# Week 10.2 – Class Attendance Tracker

## Problem 6: Class Attendance Tracker

**Task**
Attendance is an array of 1s (present) and 0s (absent).
Implement `attendanceSummary(days)` that returns:
- number of present days
- length of the longest unbroken run of present days

**Constraints**
- `1 <= length of days <= 100`
- Each value is 0 or 1

**Examples**
```
days = [1, 1, 0, 1, 1, 1, 0, 1]
→ Present: 6, Longest streak: 3

days = [0, 0, 0]
→ Present: 0, Longest streak: 0
```

**Complexity**
- Time: O(n) — single pass
- Extra space: O(1)
- Both answers found in one pass: **Yes**

**Hint**
Keep a running count that grows on every 1 and resets to 0 on every 0; remember the largest value it reaches.
