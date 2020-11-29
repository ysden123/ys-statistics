/*
 * Copyright (c) 2020. StulSoft
 */

package com.stulsoft.statistics

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * @author Yuriy Stul
 */
trait Statistics[T <: AnyVal] {
  protected val samples: mutable.ArrayBuffer[T] = ArrayBuffer[T]()

  def +=(sample: T): Statistics[T] = addSample(sample)

  def addSample(sample: T): Statistics[T] = {
    samples += sample
    this
  }

  def count():Int = samples.length

  def min(): T

  def max(): T

  def average(): Double

  def summary(): String = {
    s"Statistics summary: number of samples = ${samples.length}, min = ${min()}, max = ${max()}, average = ${average()}"
  }
}
