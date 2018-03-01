package filesearcher

class DirectoryObject(val name: String) extends IOObject

object DirectoryObject {
    def apply (name: String) = new DirectoryObject(name)
}