# Week 7 – Encapsulation & Access Control (Category C)

## Problem 1 – The Health Bar

**Task:** `Character` class with private health, final maxHealth. Change health only via `takeDamage` / `heal`. Clamp at 0 and max. Read-only `getHealth()`.

**Sample**
```
Character(100) → takeDamage(30) → 70
heal(50) → 100 (capped)
takeDamage(150) → 0 (floored)
```

---

## Problem 2 – The Playlist

**Task:** Private song array. `addSong`, `getSongs()` returns a **copy** (not the original), `getSongCount()`.

**Sample**
```
add "Song A", "Song B"
getSongs() → [Song A, Song B]
Modify the returned array → original playlist unchanged
```

---

## Problem 3 – The Password Checker

**Task:** Store password privately (no getter for it). `getStrength()` returns Weak (<6), Medium (6-9), Strong (10+).

**Sample**
```
"abcd"       → Weak
"abcdefghij" → Strong
```

---

## Problem 4 – The Traffic Light

**Task:** Color private, starts RED. Only change via `next()`: RED → GREEN → YELLOW → RED. Final ID. Read-only `getColor()`.

**Sample**
```
new TrafficLight("TL-9") → RED
next() → GREEN
next() → YELLOW
next() → RED
```

---

## Problem 5 – The Shopping Cart

**Task:** Private prices array, final cart ID. `addItem`, read-only `getTotal()` and `getItemCount()` (computed on request). No method returns the prices array.

**Sample**
```
add 250, 99, 151 → getTotal() = 500, getItemCount() = 3
```
