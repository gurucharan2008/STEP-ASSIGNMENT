# Week 9 – Abstraction, Interface, Class vs Interface (Category C)

## Problem 1: Movie Ticket Counter

**Rules**
- REGULAR 150 + 20 fee, PREMIUM 250 + 20, RECLINER 400 + 20
- Convenience fee written in **one place only** (abstract class)

**Sample**
```
REGULAR 3  → 510.00
PREMIUM 2  → 540.00
RECLINER 1 → 420.00
Total: 1470.00
```

---

## Problem 2: Parcel Shipping Desk

**Rules**
- STANDARD: 40 + 10/kg (no insurance)
- EXPRESS: 80 + 15/kg + 2% insurance
- FRAGILE: standard charge + 50 handling + 2% insurance

**Sample**
```
STANDARD 3 500 → Charge=70.00 Insurance=0.00 Total=70.00
EXPRESS 2 1000 → Charge=110.00 Insurance=20.00 Total=130.00
FRAGILE 4 2000 → Charge=130.00 Insurance=40.00 Total=170.00
Grand Total: 370.00
```

---

## Problem 3: College Fee Counter

**Rules**
- DAY_SCHOLAR: tuition 40000 + bus 12000
- HOSTELLER: tuition 40000 + hostel 60000 (no bus)
- SCHOLAR: tuition 20000 + bus 12000

**Sample**
```
Asha → 52000.00
Ravi → 100000.00
Neha → 32000.00
Total Collected: 184000.00
```

---

## Problem 4: City Cab Fare Meter

**Rules**
- MINI 10/km, SEDAN 14/km, SUV 18/km; min fare 100
- Night (+20%) only for Sedan & SUV; Mini night → rejected

**Sample**
```
MINI 8 DAY    → 100.00
SEDAN 10 NIGHT → 168.00
SUV 20 DAY    → 360.00
MINI 5 NIGHT  → night service not available
Total: 628.00
```

---

## Problem 5: Home Appliance Energy Report

**Rules**
- Power: Fridge 150W, AC 1500W, TV 100W, Washer 500W
- Units = power × hours / 1000; saver mode → −25%
- Cost = units × 8; saver only on AC & Washer

**Sample**
```
FRIDGE 24       → Units=3.60 Cost=28.80
AC 8 SAVER      → Units=9.00 Cost=72.00
TV 5            → Units=0.50 Cost=4.00
WASHER 2 SAVER  → Units=0.75 Cost=6.00
Total Cost: 110.80
```
