package filesearcher

class FilterChecker(filter: String) {
    def matches(content: String) = content contains filter

    def findMatchedFiles(IOObjects : List[IOObject]) = 
        for(iOObject <- IOObjects
            if(iOObject.isInstanceOf[FileObject])
            if(matches(iOObject.name)))
        yield iOObject
    

}

object FilterChecker {
    def apply(filter: String) = new FilterChecker(filter)
}