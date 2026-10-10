# Week 10.3 – Duty Roster Rotation

## Problem 8: Duty Roster Rotation

**Task**
Rotate the cleaning duty roster **to the right** by `k` places (names that go past the end wrap to the front).
`k` may be larger than the number of names.

**Constraints**
- `1 <= length of names <= 100`
- `0 <= k <= 10^9`

**Examples**
```
names = [A, B, C, D, E], k = 2
→ [D, E, A, B, C]

names = [A, B, C, D, E], k = 7
→ [D, E, A, B, C]   // 7 % 5 = 2
```

**Complexity**
- Time: O(n)
- Extra space: O(n)
- Rotating one place at a time k times would be O(n·k) — too slow when k is up to 10⁹.
  Using `k % n` reduces the problem to a single O(n) pass.

**Hint**
Use `k % n` to remove full turns. Each name at index `i` moves to index `(i + k) % n`.
