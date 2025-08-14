# Advent of Code 2024 - Kotlin Solutions

This project contains Kotlin solutions for [Advent of Code 2024](https://adventofcode.com/2024).

## Project Structure

```
src/
├── main/
│   ├── kotlin/com/adventofcode/
│   │   └── Main.kt                 # Main entry point and base classes
│   └── resources/
│       └── day01.txt              # Input files (add as needed)
└── test/                          # Test files (create as needed)
```

## Getting Started

### Prerequisites
- JDK 17 or higher
- Gradle (or use the wrapper)

### Running Solutions

1. **Add your input file**: Place your puzzle input in `src/main/resources/dayXX.txt`
2. **Implement your solution**: Create a new class extending `Day` in `Main.kt`
3. **Run the solution**:
   ```bash
   ./gradlew run
   ```

### Example: Day 1

```kotlin
class Day01 : Day(1) {
    override fun part1(input: List<String>): String {
        // Your solution for part 1
        return "answer"
    }
    
    override fun part2(input: List<String>): String {
        // Your solution for part 2
        return "answer"
    }
}
```

Then uncomment the line in `main()`:
```kotlin
Day01().solve()
```

## Building and Testing

```bash
# Build the project
./gradlew build

# Run tests
./gradlew test

# Run the application
./gradlew run
```

## Tips for Advent of Code

- Read input files using the provided `readInput()` method in the `Day` base class
- Each day's input should be named `dayXX.txt` (e.g., `day01.txt`, `day02.txt`)
- The base `Day` class handles file reading and provides a consistent structure
- Test your solutions with the provided examples before submitting

Happy coding! 🎄
