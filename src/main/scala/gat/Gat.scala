package gat

import java.nio.file.FileSystems
import gat.workspace._

/*
import org.mapdb.DB
import org.mapdb.DBMaker
import org.mapdb.Utils
*/

import java.io.File
import java.util.concurrent.ConcurrentNavigableMap


object Gat extends App {
  /*
  val dbFile = Utils.tempDbFile();
  val db : DB = DBMaker.newFileDB(dbFile)
                .closeOnJvmShutdown()
                .make();
  val map : ConcurrentNavigableMap[String,Set[Hash]] = db.getTreeMap("collectionName")
  val ws = Workspace(FileSystems.getDefault.getPath("/tmp"))
  map.put("foo", ws.newLabel("foo"))
  
  println(map.get("foo").getClass())
  */
  
}
