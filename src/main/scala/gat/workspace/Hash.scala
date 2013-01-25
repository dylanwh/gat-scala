package gat.workspace

import javax.xml.bind.DatatypeConverter
import com.google.common.hash.HashCode
import com.google.common.io.Files
import java.nio.file.Path
import com.google.common.hash.HashFunction

class Hash private (val bytes: Array[Byte]) {
  override def toString() = DatatypeConverter.printHexBinary(bytes)
  override def hashCode() = bytes.hashCode()
  
  def equals(that: Hash) = bytes.equals(that.bytes)
}

object Hash {
  def apply(bytes: Array[Byte]) = 
    new Hash(bytes)

  def apply(string: String) =
    new Hash(DatatypeConverter.parseHexBinary(string))
  
}
