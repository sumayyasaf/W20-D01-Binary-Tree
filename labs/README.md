# Lab: Binary Tree Problems

## Problem 1: Check if a Binary Tree is Height-Balanced

### **Description**
Given a binary tree, determine if it is height-balanced.

A binary tree is height-balanced if the depth of the two subtrees of every node never differs by more than one.

### **Example 1:**
#### **Input:**
```
root = [3,9,20,null,null,15,7]
```
#### **Output:**
```
true
```

### **Example 2:**
#### **Input:**
```
root = [1,2,2,3,3,null,null,4,4]
```
#### **Output:**
```
false
```

### **Example 3:**
#### **Input:**
```
root = []
```
#### **Output:**
```
true
```

### **Constraints:**
- The number of nodes in the tree is in the range `[0, 5000]`.
- `-10^4 <= Node.val <= 10^4`

---

## Problem 2: Diameter of a Binary Tree

### **Description**
Given the root of a binary tree, return the length of the **diameter** of the tree.

The **diameter** of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

The **length of a path** between two nodes is represented by the number of edges between them.

### **Example 1:**
#### **Input:**
```
root = [1,2,3,4,5]
```
#### **Output:**
```
3
```
#### **Explanation:**
The longest path is `[4,2,1,3]` or `[5,2,1,3]`, which has a length of `3`.

### **Example 2:**
#### **Input:**
```
root = [1,2]
```
#### **Output:**
```
1
```

### **Constraints:**
- The number of nodes in the tree is in the range `[0, 5000]`.
- `-10^4 <= Node.val <= 10^4`

---

## Problem 3: Check if Two Binary Trees are the Same

### **Description**
Given the roots of two binary trees `p` and `q`, write a function to check if they are the same or not.

Two binary trees are considered **the same** if they are **structurally identical**, and the nodes have the **same value**.

### **Example 1:**
#### **Input:**
```
p = [1,2,3], q = [1,2,3]
```
#### **Output:**
```
true
```

### **Example 2:**
#### **Input:**
```
p = [1,2], q = [1,null,2]
```
#### **Output:**
```
false
```

### **Example 3:**
#### **Input:**
```
p = [1,2,1], q = [1,1,2]
```
#### **Output:**
```
false
```

### **Constraints:**
- The number of nodes in both trees is in the range `[0, 100]`.
- `-10^4 <= Node.val <= 10^4`

---

## **Testing Your Solution**
After implementing your solution, test your code using the following problems on LeetCode:
- [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/description/)
- [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/description/)
- [Same Tree](https://leetcode.com/problems/same-tree/description/)

**Good luck, and happy coding!** 🚀

