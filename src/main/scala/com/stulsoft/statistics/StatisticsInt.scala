/*
 * Copyright (c) 2020. StulSoft
 */

package com.stulsoft.statistics

/**
 * @author Yuriy Stul
 */
class StatisticsInt extends Statistics[Int] {
  override def min(): Int = samples.min

  override def max(): Int = samples.max

  override def average(): Double = if (samples.nonEmpty) 1.0 * (samples.sum / samples.size) else 0.0
}
