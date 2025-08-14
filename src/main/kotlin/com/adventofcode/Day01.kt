package com.adventofcode

import kotlin.math.abs

/**
 * Advent of Code 2024 - Day 1: Historian Hysteria
 */
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
class Day01 {
    
    fun solve() {
        println("=== Day 1: Historian Hysteria ===")
        
        try {
            val lines = FileUtils.readDayInput(1)
            println("Input loaded: ${lines.size} lines")
            
            val (listA, listB) = parseInput(lines)
            
            val part1Result = solvePart1(listA, listB)
            println("Part 1 solution: $part1Result")
            
            val part2Result = solvePart2(listA, listB)
            println("Part 2 solution: $part2Result")
            
        } catch (e: Exception) {
            println("Error solving Day 1: ${e.message}")
        }
    }
    
    private fun parseInput(lines: List<String>): Pair<List<Int>, List<Int>> {
        val listA = lines.map { it.split("   ")[0].toInt() }.sorted()
        val listB = lines.map { it.split("   ")[1].toInt() }.sorted()
        return Pair(listA, listB)
    }
    
    private fun solvePart1(listA: List<Int>, listB: List<Int>): Int {
        var sum = 0
        for (i in listA.indices) {
            sum += abs(listA[i] - listB[i])
        }
        return sum
    }
    
    private fun solvePart2(listA: List<Int>, listB: List<Int>): Int {
        var similarityScore = 0
        for (itemA in listA) {
            val countInB = listB.count { it == itemA }
            val score = itemA * countInB
            similarityScore += score
        }
        return similarityScore
    }
}
