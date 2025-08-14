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
       
        var sum = 0
        for (i in 0..listA.size - 1) {
            sum += abs(listA[i] - listB[i])
        }
        println("Part 1 solution = ${sum} \n")
       
        // Part 2: Calculate similarity score
        var similarityScore = 0
        for (itemA in listA) {
            val countInB = listB.count { it == itemA }
            val score = itemA * countInB
            similarityScore += score
            //println("Item $itemA appears $countInB times in list B, score: $score")
        }
        println("Part 2 solution = $similarityScore")
        
    } catch (e: Exception) {
        println("Error reading file: ${e.message}")
    }
}
/*
1. read input file - check 
2. parse input into a list into a list A and list B - check 
3. sort list A and sort list B - check 
4. for each tuple, calculate the difference between the two numbers
4. sum the differences
5. print the sum

 */

 /* Part 2 
 1. read input file - check 
 2. Parse into list a and b- check 
 3. For each item in list A,how often is it in list B 
 4. Calculate a score for each item in list A

  */