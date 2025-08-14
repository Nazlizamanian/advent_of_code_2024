package com.adventofcode

import java.io.File

/**
 * Utility class for reading files, particularly useful for Advent of Code input files.
 */
object FileUtils {
    
    /**
     * Reads a file from the resources directory and returns its contents as a list of strings (lines).
     * 
     * @param filename The name of the file in the resources directory (e.g., "day01.txt")
     * @return List of strings, where each string is a line from the file
     * @throws IllegalArgumentException if the file is not found
     */
    fun readResourceLines(filename: String): List<String> {
        return this::class.java.classLoader.getResourceAsStream(filename)?.use { inputStream ->
            inputStream.bufferedReader().readLines()
        } ?: throw IllegalArgumentException("Resource file '$filename' not found")
    }
    
    /**
     * Reads a file from the resources directory and returns its entire contents as a single string.
     * 
     * @param filename The name of the file in the resources directory (e.g., "day01.txt")
     * @return The entire file contents as a string
     * @throws IllegalArgumentException if the file is not found
     */
    fun readResourceText(filename: String): String {
        return this::class.java.classLoader.getResourceAsStream(filename)?.use { inputStream ->
            inputStream.bufferedReader().readText()
        } ?: throw IllegalArgumentException("Resource file '$filename' not found")
    }
    
    /**
     * Reads a file from the filesystem and returns its contents as a list of strings (lines).
     * 
     * @param filepath The path to the file
     * @return List of strings, where each string is a line from the file
     * @throws IllegalArgumentException if the file is not found or cannot be read
     */
    fun readFileLines(filepath: String): List<String> {
        val file = File(filepath)
        if (!file.exists()) {
            throw IllegalArgumentException("File '$filepath' not found")
        }
        return file.readLines()
    }
    
    /**
     * Reads a file from the filesystem and returns its entire contents as a single string.
     * 
     * @param filepath The path to the file
     * @return The entire file contents as a string
     * @throws IllegalArgumentException if the file is not found or cannot be read
     */
    fun readFileText(filepath: String): String {
        val file = File(filepath)
        if (!file.exists()) {
            throw IllegalArgumentException("File '$filepath' not found")
        }
        return file.readText()
    }
    
    /**
     * Convenience method to read a day's input file from resources.
     * Assumes the filename follows the pattern "day{XX}.txt" where XX is zero-padded.
     * 
     * @param day The day number (e.g., 1 for day01.txt)
     * @return List of strings, where each string is a line from the file
     */
    fun readDayInput(day: Int): List<String> {
        val filename = "day${day.toString().padStart(2, '0')}.txt"
        return readResourceLines(filename)
    }
}
