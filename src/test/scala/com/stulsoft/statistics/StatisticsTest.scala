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

  test("int"){
    val s = new StatisticsInt()
    s.addValue(1)
    s.addValue(2)
    s.addValue(3)
    assertResult(1)(s.min())
    assertResult(3)(s.max())
    assertResult(2.0)(s.average())
  }

  test("double"){
    val s = new StatisticsDouble()
    s.addValue(1)
    s.addValue(2)
    s.addValue(3)
    assertResult(1.0)(s.min())
    assertResult(3.0)(s.max())
    assertResult(2.0)(s.average())
  }
}
