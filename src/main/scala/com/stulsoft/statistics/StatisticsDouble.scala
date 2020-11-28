/*
 * Copyright (c) 2020. StulSoft
 */

package com.stulsoft.statistics

/**
 * @author Yuriy Stul
 */
class StatisticsDouble extends Statistics[Double] {
  override def min(): Double = samples.min

  override def max(): Double = samples.max

  override def average(): Double = if (samples.nonEmpty) (samples.sum / samples.size) else 0.0
}
