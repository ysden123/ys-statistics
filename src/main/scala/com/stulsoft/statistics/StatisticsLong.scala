/*
 * Copyright (c) 2020. StulSoft
 */

package com.stulsoft.statistics

/**
 * @author Yuriy Stul
 */
class StatisticsLong extends Statistics[Long] {
  override def min(): Long = samples.min

  override def max(): Long = samples.max

  override def average(): Double = if (samples.nonEmpty) 1.0 * (samples.sum / samples.size) else 0.0
}
