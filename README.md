# Neovest coding interview problems

This project contains Java and C++ skeleton solutions for the two problems described below. 

Candidates are asked to implement a solution to one of the problems and add additional unit tests.

## Contents

* src/main - Java stubs for the solution, each in a separate package
* src/test/java - junit unit tests
* src/test/groovy - Spock unit tests
* cpp (cpp branch only) - C++ project skeleton

## Problems

### Least common multiple

Given two numbers, find the least common multiple that both numbers share

Example:

lcm(5, 7) -> 35

  5, 10, 15, 20, 25, 30, 35
  7, 14, 21, 28, 35

lcm(2, 4) -> 4

  2, 4
  4

lcm(4, 6) -> 12

  4, 8, 12
  6, 12

### Average price per share

Given a list of trades, compute the average price per share.  Each trade has a price and a number of shares.

The average price per share is the weighted average of the prices in each trade. The number of shares is multiplied
by the price for each trade and then added together for all the trades. The sum is then divided by the total number
of shares across all trades.

### Example

Trade 1: 20 shares at $5.00 / share

Trade 2: 40 shares at $6.00 / share

Average Price per share = (20 * 5.0 + 40 * 6.0)  / 60 = 5.67


