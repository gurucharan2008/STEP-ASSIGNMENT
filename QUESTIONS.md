# Week 1 Assignment — 5 Problems

## 1. The Exam Hall Seat Duplication Checker

**Task**
- Accept an array of seat numbers (integers).
- Compare every seat number against every other using nested loops only (no Collections).
- Print duplicated seat number(s) or "No Duplicate Seats Found".

**Method:** `void checkDuplicateSeats(int[] seatNumbers)`

**Sample**
```
{101, 102, 103, 102, 105}  →  Duplicate Seat Number Found: 102
{101, 102, 103, 104, 105}  →  No Duplicate Seats Found
```

---

## 2. The Typing Speed Test Accuracy Checker

**Task**
- Accept two equal-length strings: original and typed.
- Compare character by character.
- Calculate accuracy % and report first mismatch position.

**Method:** `void checkTypingAccuracy(String original, String typed)`

**Sample**
```
original="hello world", typed="hello worlt"
→ Matched: 10/11 | Accuracy: 90.91% | First Mismatch at position 11 ('d' vs 't')

original="coding", typed="coding"
→ Matched: 6/6 | Accuracy: 100.00% | No Mismatches
```

---

## 3. The Traffic Signal Streak Analyzer

**Task**
- Accept a string of signal colors (R/Y/G).
- Find the longest continuous streak of the same color.

**Method:** `void findLongestStreak(String signalLog)`

**Sample**
```
"RRGGGYRR"  →  Longest Streak: 'G' repeated 3 times
"RRRRYYGG"  →  Longest Streak: 'R' repeated 4 times
```

---

## 4. The Warehouse Inventory Balancer

**Task**
- Accept two equal-length int arrays (Section A & B).
- Compute totals, check Balanced / Not Balanced.
- Find the single highest quantity and report section + item index.

**Method:** `void analyzeInventory(int[] sectionA, int[] sectionB)`

**Sample**
```
sectionA={20,15,30}, sectionB={25,10,30}
→ Section A Total: 65 | Section B Total: 65 | Status: Balanced | Highest Quantity: 30 (Section A, Item 3)
```

---

## 5. The Movie Review Word Length Profiler

**Task**
- Accept a review string, split into words.
- Classify: Short (1–4), Medium (5–8), Long (9+).
- Print counts.

**Method:** `void classifyWordLengths(String review)`

**Sample**
```
"This movie was absolutely fantastic and thrilling"
→ Short: 3 | Medium: 1 | Long: 3
```
