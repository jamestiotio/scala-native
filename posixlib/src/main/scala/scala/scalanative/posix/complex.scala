package scala.scalanative
package posix

import scala.scalanative.unsafe._

@extern object complex extends complex

@extern trait complex extends libc.complex {
  // no extensions yet
}
