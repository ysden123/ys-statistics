/*
 * Copyright (c) 2020. StulSoft
 */

package com.stulsoft.statistics

/**
 * @author Yuriy Stul
 */
class StatisticsDouble extends Statistics[Double] {
  override def min(): Double = values.min

  override def max(): Double = values.max

  override def average(): Double = if (values.nonEmpty) (values.sum / values.size) else 0.0
}
