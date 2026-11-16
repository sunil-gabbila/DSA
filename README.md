# DSA - Java Practice

This repository contains Java-based data structure and algorithm practice programs, organized by topic and by Java package structure. It includes beginner-level Java exercises, array/string challenges, frequency problems, sorting/searching practice, prefix sum patterns, sliding window problems, and interview-oriented coding tasks.

## Repository Structure

```text
DSA/
├── 01-Java-Basics/
├── 02-Arrays-Strings/
│   ├── Arrays/
│   └── Strings/
├── 03-HashMap-HashSet/
│   └── hashmap/
├── 04-Freaquency-Problems/
│   └── frequency/
├── 05-PrefixSum-RunningSum/
│   ├── prefixsum/
│   └── runningsum/
├── 06-Searching-Sorting/
├── 07-Sliding-Window-Pattern/
├── 08-Interview-Practice/
│   ├── Arrays/
│   └── Strings/
├── DSA/
│   └── src/
│       ├── KodNest/
│       │   └── TwoPointers/
│       │       ├── ProductFinding.java
│       │       └── SumFinding.java
│       └── com/
│           ├── Strings/
│           │   ├── ReverseString.java
│           │   ├── SpacePositionSame.java
│           │   ├── SpacePositionSame2.java
│           │   └── StringWords.java
│           └── kodnest/
│               ├── Arrays/
│               │   ├── ArrayProgram1.java
│               │   ├── ArrayReverse.java
│               │   ├── BinarySearch.java
│               │   ├── BubbleSorting.java
│               │   ├── FrequencyCount.java
│               │   ├── InsertionSort.java
│               │   ├── LinearSearch.java
│               │   ├── Rotate2Anticlock.java
│               │   ├── RotateArray.java
│               │   ├── RotatePortionArray.java
│               │   ├── SelectionSort.java
│               │   └── Sorting.java
│               └── Freaquency/
│                   └── CountTargetElement.java
├── CONSOLIDATED-SOURCES.md
├── README.md
└── LICENSE (if present)
```

## Java Package Organization

The Java source files under `DSA/src` are grouped by package names, which helps organize related programs logically.

### 1. `com.Strings`
This package contains string manipulation programs such as:
- `ReverseString`
- `SpacePositionSame`
- `SpacePositionSame2`
- `StringWords`

These programs focus on reversing strings, handling spaces, and word/string processing.

### 2. `com.kodnest.Arrays`
This subpackage contains array fundamentals and sorting/searching exercises, including:
- `ArrayProgram1`
- `ArrayReverse`
- `BinarySearch`
- `BubbleSorting`
- `InsertionSort`
- `LinearSearch`
- `RotateArray`
- `RotatePortionArray`
- `SelectionSort`
- `Sorting`

This is the main array-practice package in the project.

### 3. `com.kodnest.Freaquency`
This package is used for frequency-based counting problems and includes:
- `CountTargetElement`

These programs calculate or verify how often a value appears in an array.

### 4. `KodNest.TwoPointers`
This package contains two-pointer algorithm exercises such as:
- `ProductFinding`
- `SumFinding`

These are useful for problems involving paired traversal, fast/slow pointers, and pointer-based optimization.

## Topic Folders

The repository also organizes code by DSA topic to make learning progression easier.

| Topic | Folder | Purpose |
|---|---|---|
| Java Basics | `01-Java-Basics/` | Core Java fundamentals |
| Arrays and Strings | `02-Arrays-Strings/` | Arrays and string operations |
| HashMap and HashSet | `03-HashMap-HashSet/` | Map/set-based problem solving |
| Frequency Problems | `04-Freaquency-Problems/` | Counting and repetitive element problems |
| Prefix Sum | `05-PrefixSum-RunningSum/` | Prefix and running sum patterns |
| Searching and Sorting | `06-Searching-Sorting/` | Binary search and sorting techniques |
| Sliding Window | `07-Sliding-Window-Pattern/` | Window-based optimization problems |
| Interview Practice | `08-Interview-Practice/` | Mixed practice problems |

## How to Run Java Programs

From the root of the repository, compile and run Java files using the package path.

Example:

```bash
javac DSA/src/com/kodnest/Arrays/ArrayProgram1.java
java -cp DSA/src com.kodnest.Arrays.ArrayProgram1
```

If a class is in a package like `com.Strings`, use the package path accordingly.

## Practice Workflow

1. Understand the problem statement and constraints.
2. Write a working solution first.
3. Check edge cases such as empty arrays, duplicates, and null inputs.
4. Optimize for time and space complexity.
5. Compare different approaches and explain the reasoning clearly.

## Conclusion

This repository combines topic-based learning with Java package-based code organization. It is designed for incremental DSA practice, code discipline, and interview preparation.

Feel free to explore each package and topic folder to practice solving problems progressively.
