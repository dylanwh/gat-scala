package gat.workspace

import scala.collection.JavaConverters._
import java.nio.file.FileSystems
import java.nio.file.Path


class Label private[workspace] (path: Path) extends Serializable {
  require(!path.isAbsolute(), "Label(path) requires relative path")
  
  val value : String = path.iterator.asScala.mkString("/")
  
  def equals(that: Label) = value == that.value
  
  def toPath(base: Path): Path =
    value.split('/').foldLeft(base)( (b, s) => b.resolve(s)) ensuring (_.isAbsolute())

  override def toString() = value
  override def hashCode() = value.hashCode()
}

private[workspace] object Label {
  def apply(path: Path) = new Label(path)
}


