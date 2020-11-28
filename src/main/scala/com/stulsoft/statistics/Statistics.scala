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
  protected val values: mutable.ListBuffer[T] = ListBuffer[T]()

  def addValue(value: T): Unit = {
    values += value
  }

  def min():T

  def max():T

  def average():Double

}
