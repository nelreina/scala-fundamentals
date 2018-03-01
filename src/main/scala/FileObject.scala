package fileSearcher

class FileObject(val name: String) extends IOObject

object FileObject {
    def apply (name: String) = new FileObject(name)
}