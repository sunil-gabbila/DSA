# Java DSA Practice

A Java-focused collection of Data Structures and Algorithms problems for learning, practice, and coding interview preparation. Problems are grouped by topic so related techniques can be studied together.

## Topics

| Topic | What it covers | Directory |
|---|---|---|
| Java basics | Core Java syntax and programming fundamentals | [`01-Java-Basics/`](01-Java-Basics/) |
| Arrays and strings | Traversal, transformations, and common array/string problems | [`02-Arrays-Strings/`](02-Arrays-Strings/) |
| HashMap and HashSet | Lookups, mappings, duplicates, anagrams, and pair/frequency patterns | [`03-HashMap-HashSet/`](03-HashMap-HashSet/) |
| Frequency problems | Counting occurrences, unique/repeated elements, and most/least frequent values | [`04-Freaquency-Problems/`](04-Freaquency-Problems/) |
| Prefix sum and running sum | Cumulative sums, range queries, equilibrium indices, and subarray-sum problems | [`05-PrefixSum-RunningSum/`](05-PrefixSum-RunningSum/) |
| Searching and sorting | Search and sort techniques | [`06-Searching-Sorting/`](06-Searching-Sorting/) |
| Sliding window | Contiguous array and string problems | [`07-Sliding-Window-Pattern/`](07-Sliding-Window-Pattern/) |
| Interview practice | Mixed problems applying multiple techniques | [`08-Interview-Practice/`](08-Interview-Practice/) |

## Consolidated topic collections

The following repositories contain Java exercises for the topics above and are part of the learning plan for this repository:

- [DSA-HashMap](https://github.com/sunil-gabbila/DSA-HashMap) — HashMap mappings, anagrams, character counts, majority elements, and frequency-based problems.
- [DSA-Frequency](https://github.com/sunil-gabbila/DSA-Frequency) — occurrence counts, duplicates, unique values, and frequent elements.
- [DSA-PrefixSum](https://github.com/sunil-gabbila/DSA-PrefixSum) — prefix-sum and HashMap/HashSet subarray problems.
- [DSA-RunningSum](https://github.com/sunil-gabbila/DSA-RunningSum) — running sums, range sums, equilibrium sums, and left/right sum calculations.
- This repository, [DSA](https://github.com/sunil-gabbila/DSA), contains additional array and DSA practice problems.

Use the topic directories above as the organization scheme when adding or moving solutions into this repository. Keep individual practice solutions independently runnable and group them by the technique they demonstrate.

## How to practice

1. Read the problem statement and identify its input, output, and constraints.
2. Try a straightforward solution before optimizing it.
3. Choose a data structure or pattern and explain why it fits.
4. Test normal cases, edge cases, and larger inputs.
5. Review time and space complexity, then revisit the problem later.

## Requirements and running a solution

Install a JDK and confirm Java and the compiler are available:

```bash
java -version
javac -version
```

Compile and run a standalone solution from the directory containing its `.java` file. Replace `Solution` with the class declared in that file:

```bash
javac Solution.java
java Solution
```

Check the source file for its expected input format and entry-point class. Some exercises use package declarations; compile and run those from the appropriate source root with the package-qualified class name.

## Repository notes

- Solutions are written in Java.
- Directories are grouped by problem topic and learning progression.
- These examples are for study and interview preparation; focus on understanding and explaining the approach rather than copying a solution.
- When adding a problem, use a clear filename and place it in the most relevant topic directory.
