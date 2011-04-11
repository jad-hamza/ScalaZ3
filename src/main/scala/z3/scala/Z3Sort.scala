package z3.scala

import z3.Pointer

class Z3Sort private[z3](ptr: Long, context: Z3Context) extends Pointer(ptr) {
  override def equals(that: Any) : Boolean = {
    that != null && that.isInstanceOf[Z3Sort] && context.isEqSort(this, that.asInstanceOf[Z3Sort])
  }

  override def toString : String = context.sortToString(this)
}
