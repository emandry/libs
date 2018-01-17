/**
* listFiles is a global shared function.
* The functionality is to use groovy findFiles to find files in a given
* directory recursively
*
* @param dir              Mandatory, Search directory
* @param searchPattern    Optional, A regular expression & by default it searches for .json extension)
* @param recursive        Optional, boolean variable, default is true)
* @return fileCollection  Files with matching arguments
*/
def call(String dir, String searchPattern = '.json$', boolean recursive = true) {
  def globValue = "'" + "${dir}" + "/**/**'"
  return findFile(glob: evaluate("${globValue}")).findAll { it.name =~ ~searchPattern }.collect { it.getPath() }
}
