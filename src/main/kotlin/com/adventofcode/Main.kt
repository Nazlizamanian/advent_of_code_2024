package com.adventofcode

/**
 * Advent of Code 2024 - Main entry point
 */
fun main() {
    println("🎄 Welcome to Advent of Code 2024! 🎄")
    println("Happy coding!")
    
    // Example: Uncomment to run a specific day's solution
    // Day01().solve()
}

/**
 * Base class for daily challenges
 */
abstract class Day(private val dayNumber: Int) {
    
    abstract fun part1(input: List<String>): String
    abstract fun part2(input: List<String>): String
    
    fun solve() {
        println("=== Day $dayNumber ===")
        
        val input = readInput()
        
        println("Part 1: ${part1(input)}")
        println("Part 2: ${part2(input)}")
    }
    
    private fun readInput(): List<String> {
        val resourceName = "day${dayNumber.toString().padStart(2, '0')}.txt"
        return this::class.java.classLoader.getResourceAsStream(resourceName)
            ?.bufferedReader()?.readLines() 
            ?: emptyList()
    }
}

/**
 * Example implementation for Day 1
 */
class Day01 : Day(1) {
    override fun part1(input: List<String>): String {
        // TODO: Implement part 1 solution
        return "Not implemented yet"
    }
    
    override fun part2(input: List<String>): String {
        // TODO: Implement part 2 solution  
        return "Not implemented yet"
    }
}
