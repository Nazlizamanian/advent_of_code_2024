package com.adventofcode

/**
 * Advent of Code 2024 - Day 2: Red-Nosed Reports
 */
/*
Part 1:
1. read input file - check
2. parse into list of reports (each report is a list of numbers) - check
3. for each report, check if it's safe:
   - all increasing OR all decreasing  
   - adjacent differences between 1 and 3
4. count safe reports - check

*/

/* Part 2:
1. read input file - check
2. parse into list of reports - check  
3. for each report, check if it's safe OR can be made safe by removing one level
4. try removing each level one by one and test if resulting report is safe
5. count safe reports (including those safe after removing one level) - check

*/
class Day02 {
    
    fun solve() {
        println("=== Day 2: Red-Nosed Reports ===")
        
        try {
            val lines = FileUtils.readDayInput(2)
            println("Input loaded: ${lines.size} lines")
            
            val reports = parseInput(lines)
            
            val part1Result = solvePart1(reports)
            println("Part 1 solution: $part1Result")
            
            val part2Result = solvePart2(reports)
            println("Part 2 solution: $part2Result")
            
        } catch (e: Exception) {
            println("Error solving Day 2: ${e.message}")
        }
    }
    
    private fun parseInput(lines: List<String>): List<List<Int>> {
        return lines.map { line ->
            line.split(" ").map { it.toInt() }
        }
    }
    
    private fun solvePart1(reports: List<List<Int>>): Int {
        return reports.count { isSafe(it) }
    }
    
    private fun isSafe(report: List<Int>): Boolean {
        if (report.size < 2) return true
        
        val differences = report.zipWithNext { a, b -> b - a }
        val allInRange = differences.all { it in 1..3 || it in -3..-1 }
        val allIncreasing = differences.all { it > 0 }
        val allDecreasing = differences.all { it < 0 }
        
        return allInRange && (allIncreasing || allDecreasing)
    }
    
    private fun solvePart2(reports: List<List<Int>>): Int {
        return reports.count { isSafeWithDampener(it) }
    }
    
    private fun isSafeWithDampener(report: List<Int>): Boolean {
       
        if (isSafe(report)) return true
        
        for (i in report.indices) {
            val modifiedReport = report.toMutableList().apply { removeAt(i) }
            if (isSafe(modifiedReport)) {
                return true
            }
        }
        
        return false
    }
}
