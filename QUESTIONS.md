# Week 5 – Java Arrays and Methods (Category C)

## PROBLEM 1 · Easy – Fantasy Team Score Multiplier

**Task:** Modify the original score array in place. Captain gets 2×, Vice-Captain gets 1.5×. Return nothing.

**Method:** `static void applyMultipliers(double[] playerScores, int captainIndex, int viceCaptainIndex)`

**Sample**
```
scores = {40, 55, 30, 62}; applyMultipliers(scores, 1, 3);
→ [40.0, 110.0, 30.0, 93.0]
```

---

## PROBLEM 2 · Easy – Duplicate Player Pick Checker

**Task:** Nested loops only (no Collections). Report first duplicate name or "No Duplicates Found".

**Method:** `static String findDuplicatePick(String[] playerNames)`

**Sample**
```
{"Kohli", "Bumrah", "Kohli", "Rohit"} → "Duplicate Found: Kohli"
{"Kohli", "Bumrah", "Rohit"}          → "No Duplicates Found"
```

---

## PROBLEM 3 · Intermediate – Top Performer Tracker

**Task:** Single-pass min & max (no sorting). Report min, max, and spread (max − min).

**Method:** `static String findMinMaxSpread(int[] scores)`

**Sample**
```
{45, 82, 79, 90, 33, 90, 61} → "Min: 33 | Max: 90 | Spread: 57"
```

---

## PROBLEM 4 · Intermediate – Match Day Grid Analyzer

**Task:** 2D array of runs. Helper `rowAverage` + classify each match as Power Surge (≥ threshold) or Normal.

**Methods:**
- `static double rowAverage(int[] row)`
- `static String classifyMatches(int[][] runsPerOver, int threshold)`

**Sample**
```
{{4,6,8}, {10,12,14}, {2,3,1}}, threshold=8
→ "Match 0: Normal | Match 1: Power Surge | Match 2: Normal"
```

---

## PROBLEM 5 · Advanced – Fantasy League Auto-Draft Ranking Engine

**Task:**
- Overloaded `isDraftable` (experience-only vs matches+fitness).
- `Player` implements `Comparable` so `Arrays.sort` ranks by fantasy points descending.
- Return ranked draftable list as a string.

**Methods:**
- `Player(String name, int matchesPlayed, double battingAverage, boolean injured)`
- `static boolean isDraftable(int matchesPlayed)`
- `static boolean isDraftable(int matchesPlayed, boolean injured)`
- `int compareTo(Player other)`
- `static String draftAndRank(Player[] players)`

**Sample**
```
Virat(15, 48.0, false), Rahul(7, 55.0, false), Sameer(3, 60.0, false), Dev(12, 20.0, true)
→ "1. Rahul | 2. Virat | 3. Dev"
```
