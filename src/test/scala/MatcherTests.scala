package filesearcher;

import org.scalatest.FlatSpec;

class MatcherTests extends FlatSpec {
    
    
    "Matcher that is passed a file matching the filter" should 
    "return a list with that file name" in {
        val matcher = Matcher("fake", "fakePath")
        val result = matcher.execute();
        assert(result == List("fakePath"))
    }
}