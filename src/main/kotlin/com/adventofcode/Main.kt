package com.adventofcode
import kotlin.math.abs

/**
 * Advent of Code 2024 - Main entry point
 */
fun main() {
    println("🎄 Welcome to Advent of Code 2024! 🎄")
    println("Happy coding!")
    

    try {
        val lines = FileUtils.readDayInput(1) // Reads day01.txt
        println("\nDay 1 input (${lines.size} lines):")
        val listA = lines.map { it.split("   ")[0].toInt() }.sorted()
        val listB = lines.map { it.split("   ")[1].toInt() }.sorted()
        println(listA)
        println(listB)
        var sum = 0
        for (i in 0..listA.size - 1) {
            sum += abs(listA[i] - listB[i])
        }
        println(sum)
        
    } catch (e: Exception) {
        println("Error reading file: ${e.message}")
    }
}/*
1. read input file - check 
2. parse input into a list into a list A and list B - check 
3. sort list A and sort list B - check 
4. for each tuple, calculate the difference between the two numbers
4. sum the differences
5. print the sum

 */