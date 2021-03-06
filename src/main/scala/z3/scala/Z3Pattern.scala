package z3.scala

sealed class Z3Pattern private[z3](val ptr: Long, val context: Z3Context) extends Z3ASTLike {
  override def toString : String = context.patternToString(this)

  locally {
    context.astQueue.track(this)
  }
}
