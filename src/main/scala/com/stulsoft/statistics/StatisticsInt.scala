/*
 * Copyright (c) 2020. StulSoft
 */

package com.stulsoft.statistics

/**
 * @author Yuriy Stul
 */
class StatisticsInt extends Statistics[Int] {
  override def min(): Int = values.min

  override def max(): Int = values.max

  override def average(): Double = if (values.nonEmpty) 1.0 * (values.sum / values.size) else 0.0
}
