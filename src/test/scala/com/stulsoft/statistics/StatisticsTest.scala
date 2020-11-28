/*
 * Copyright (c) 2020. StulSoft
 */

package com.stulsoft.statistics

import org.scalatest.funsuite.AnyFunSuite

/**
 * @author Yuriy Stul
 */
class StatisticsTest extends AnyFunSuite {

  test("constructor") {
    val s = new StatisticsInt()
    assert(s != null)
  }

  test("int") {
    val s = new StatisticsInt()
    s.addSample(1)
    s += 2 += 3
    assertResult(1)(s.min())
    assertResult(3)(s.max())
    assertResult(2.0)(s.average())
    println(s.summary())
  }

  test("double") {
    val s = new StatisticsDouble()
    s.addSample(1.0)
    s += 2.0 += 3.0
    assertResult(1.0)(s.min())
    assertResult(3.0)(s.max())
    assertResult(2.0)(s.average())
    println(s.summary())
  }
}
