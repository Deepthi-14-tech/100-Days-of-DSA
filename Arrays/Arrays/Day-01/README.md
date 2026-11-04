# 🚀 100 Days of DSA Challenge

## 📅 Day 01 – Arrays | Java


Welcome to Day 1 of my **100 Days of Data Structures and Algorithms Challenge!**

Today, I solved five array-based problems using Java. My goal is to improve problem-solving skills, understand DSA concepts, and prepare for technical interviews.

---

## 📊 Day 1 Progress

 Topic    ------  Arrays 
 Language ------  Java 
 Problems Solved ---- 5 
 Difficulty ------  Easy 
 Status ------- Completed ✅ 

---
🧩 Problems Solved

1️⃣ Running Sum of 1D Array

**LeetCode:** [#1480](https://leetcode.com/problems/running-sum-of-1d-array/)

**Concepts:** Array Traversal, Prefix Sum, In-place Updates.

**Problem:** Calculate the cumulative sum of elements up to each index.

**Example:**
```text
Input:  [1, 2, 3, 4]
Output: [1, 3, 6, 10]
```

**Approach:**
1. Initialize `sum = 0`.
2. Traverse the array using a for loop.
3. Add the current element to sum.
4. Update the current array element.
5. Return the modified array.

**Java Solution:**
```java
class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }

        return nums;
    }
}
```

**Complexity:**
- Time: O(n)
- Auxiliary Space: O(1)

**What I learned:** How to use a single loop to calculate cumulative sums and understand the Prefix Sum technique.

---

## 2️⃣ Largest Number At Least Twice of Others

**LeetCode:** [#747](https://leetcode.com/problems/largest-number-at-least-twice-of-others/)

**Concepts:** Array Traversal, Maximum Element, Index Tracking, Comparison.

**Problem:** Find whether the largest element is at least twice every other element. Return its index or -1.

**Example:**
```text
Input:  [3, 6, 1, 0]
Output: 1
```

**Approach:**
1. Find the largest element and its index.
2. Traverse the array again.
3. Check whether the maximum is at least twice every other element.
4. Return the maximum element's index if the condition is satisfied; otherwise return -1.

**Java Solution:**
```java
class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int maxIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && max < 2 * nums[i]) {
                return -1;
            }
        }

        return maxIndex;
    }
}
```

**Complexity:**
- Time: O(n)
- Auxiliary Space: O(1)

**What I learned:** How to find a maximum element, track its index, and validate a condition using array traversal.

---

## 3️⃣ Find Numbers with Even Number of Digits

**LeetCode:** [#1295](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/)

**Concepts:** Arrays, While Loop, Digit Counting, Modulo Operator.

**Problem:** Count how many numbers in an array contain an even number of digits.

**Example:**
```text
Input:  [12, 345, 2, 6, 7896]
Output: 2
```

**Approach:**
1. Traverse each number in the array.
2. Initialize a digit counter.
3. Divide the number by 10 repeatedly to count its digits.
4. Check whether the digit count is even using `count % 2 == 0`.
5. Increment the result when the condition is true.

**Java Solution:**
```java
class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int count = 0;

            while (n > 0) {
                n = n / 10;
                count++;
            }

            if (count % 2 == 0) {
                result++;
            }
        }

        return result;
    }
}
```

**Complexity:**
- Time: O(n × d), where d is the maximum number of digits in a number.
- Auxiliary Space: O(1)

**What I learned:** How to count digits using division, use a while loop, and check even numbers using the modulo operator.

---

## 4️⃣ Build Array from Permutation

**LeetCode:** [#1920](https://leetcode.com/problems/build-array-from-permutation/)

**Concepts:** Arrays, Indexing, Nested Array Access, New Array Creation.

**Problem:** Create an array where `ans[i] = nums[nums[i]]`.

**Example:**
```text
Input:  [0, 2, 1, 5, 3, 4]
Output: [0, 1, 2, 4, 5, 3]
```

**Approach:**
1. Create a new array with the same size as the input array.
2. Traverse the input array.
3. Use the given formula to calculate each element.
4. Return the new array.

**Java Solution:**
```java
class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
```

**Complexity:**
- Time: O(n)
- Auxiliary Space: O(n)

**What I learned:** How to access array elements using another array value and create a new array dynamically.

---

## 5️⃣ Richest Customer Wealth

**LeetCode:** [#1672](https://leetcode.com/problems/richest-customer-wealth/)

**Concepts:** 2D Arrays, Nested Loops, Array Traversal, Maximum Sum.

**Problem:** Find the maximum total wealth among all customers. Each row represents one customer's bank account balances.

**Example:**
```text
Input:
[[2, 8, 7],
 [7, 1, 3],
 [1, 9, 5]]

Output: 17
```

**Approach:**
1. Initialize `maxWealth = 0`.
2. Use an outer loop to visit each customer.
3. Initialize `sum = 0` for each customer.
4. Use an inner loop to add all account balances.
5. Update the maximum wealth if the current total is greater.
6. Return the maximum wealth.

**Java Solution:**
```java
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }

        return maxWealth;
    }
}
```

**Complexity:**
- Time: O(m × n)
- Auxiliary Space: O(1)

**What I learned:** How to work with 2D arrays, use nested loops, calculate row sums, and find the maximum value.

---

# 📚 Overall Concepts Covered

| Concept | What I practiced |
|---|---|
| Arrays | Declaration, indexing and traversal |
| Prefix Sum | Cumulative sum calculation |
| Maximum Element | Finding maximum and tracking index |
| Loops | For loop and while loop |
| Modulo Operator | Checking even digit counts |
| 2D Arrays | Accessing rows and columns |
| Nested Loops | Processing multiple dimensions |
| Complexity | Time and auxiliary space analysis |

---

# 🎯 Day 1 Learning Outcome

- Solved five LeetCode problems using Java.
- Practiced array traversal and indexing.
- Understood Prefix Sum and digit counting.
- Practiced 2D arrays and nested loops.
- Improved logical thinking and problem-solving skills.

**All five problems were submitted and accepted on LeetCode.** ✅

---

## 🚀 Next Goal

**Day 02 – Arrays: Maximum, Minimum and Sum**

Continuing my journey of learning DSA, one problem at a time!

#100DaysOfDSA #Java #DSA #LeetCode #ProblemSolving #CodingJourney
