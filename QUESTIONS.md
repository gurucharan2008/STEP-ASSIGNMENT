# Week 2 Assignment — 5 Problems

## 1. ATM PIN Length Validator

**Task**
- Accept a PIN string.
- Use `length()` — if not exactly 4, print "Invalid PIN — must be exactly 4 digits."
- Otherwise print "PIN length OK."

**Method:** `void checkPinLength(String pin)`

**Sample**
```
"482"   → Invalid PIN — must be exactly 4 digits.
"4820"  → PIN length OK.
```

---

## 2. Word Reversal Encoder

**Task**
- Accept a sentence (words separated by single spaces).
- Split into words, reverse each word with StringBuilder, join back with spaces.

**Method:** `String reverseEachWord(String sentence)`

**Sample**
```
"hello club"  →  olleh bulc
```

---

## 3. Product Inventory CSV Parser

**Task**
- Accept CSV line "ProductName,SKU,Quantity".
- Split by comma; if not exactly 3 fields → "Invalid Record".
- Else print: Product: ... | SKU: ... | Qty: ...

**Method:** `void parseInventoryRecord(String csvLine)`

**Sample**
```
"Wireless Mouse,WM-2201,150"  →  Product: Wireless Mouse | SKU: WM-2201 | Qty: 150
"Wireless Mouse,150"          →  Invalid Record
```

---

## 4. Library ISBN Normalizer & Validator

**Task**
- Accept raw code (may have spaces / mixed case).
- Normalize: `trim()`, uppercase first 3 chars.
- Validate: exactly 13 chars, first 3 letters, remaining 10 digits (no regex).
- If valid → `[PUB] YEAR: 20XX | CATALOG: 123456`
- If invalid → specific reason.

**Methods:** `String normalizeCode(String raw)` + `String validateAndFormat(String code)`

**Sample**
```
" pen2026004251 "  →  [PEN] YEAR: 2026 | CATALOG: 004251
"12N2026004251"    →  Invalid: publisher code must be 3 letters
```

---

## 5. Stop-Word-Filtered Word Frequency Report

**Task**
- Accept feedback paragraph.
- Stop words: {"the","was","and","a","is","of","in"}.
- Lowercase, strip `.` and `,`, split on whitespace.
- Skip stop words, count remaining unique words (HashMap ok).
- Print sorted by count descending.

**Method:** `void printFilteredWordFrequency(String feedback)`

**Sample**
```
"The mentor was great, the session was great and clear."
→
great: 2
mentor: 1
session: 1
clear: 1
```
