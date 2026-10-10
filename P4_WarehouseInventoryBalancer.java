/**
 * Week 1 - Problem 4: The Warehouse Inventory Balancer
 * Concepts: Arrays, loops, sum accumulation, tracking maximum with index
 */
public class P4_WarehouseInventoryBalancer {

    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0;
        int totalB = 0;

        // Compute totals
        for (int qty : sectionA) {
            totalA += qty;
        }
        for (int qty : sectionB) {
            totalB += qty;
        }

        // Balance status
        String status = (totalA == totalB) ? "Balanced" : "Not Balanced";

        // Find highest quantity across both sections
        int highestQty = Integer.MIN_VALUE;
        String highestSection = "";
        int highestItemIndex = -1; // 1-based for display

        for (int i = 0; i < sectionA.length; i++) {
            if (sectionA[i] > highestQty) {
                highestQty = sectionA[i];
                highestSection = "Section A";
                highestItemIndex = i + 1;
            }
        }
        for (int i = 0; i < sectionB.length; i++) {
            if (sectionB[i] > highestQty) {
                highestQty = sectionB[i];
                highestSection = "Section B";
                highestItemIndex = i + 1;
            }
        }

        System.out.println("Section A Total: " + totalA
                + " | Section B Total: " + totalB
                + " | Status: " + status
                + " | Highest Quantity: " + highestQty
                + " (" + highestSection + ", Item " + highestItemIndex + ")");
    }

    public static void main(String[] args) {
        // Sample
        int[] sectionA = {20, 15, 30};
        int[] sectionB = {25, 10, 30};
        analyzeInventory(sectionA, sectionB);
    }
}
