/*
 * Copyright (c) 2020. StulSoft
 */

package com.stulsoft.statistics

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

/**
 * @author Yuriy Stul
 */
trait Statistics[T <: AnyVal] {
  protected val samples: mutable.ListBuffer[T] = ListBuffer[T]()

  def addSample(sample: T): Unit = {
    samples += sample
  }

  def min():T

  def max():T

  def average():Double

  def summary():String = {
    s"Statistics summary: number of samples = ${samples.length}, min = ${min()}, max = ${max()}, average = ${average()}"
  }
}
