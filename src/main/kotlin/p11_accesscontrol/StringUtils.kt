package p11_accesscontrol

/*
public abstract class StringUtils {

    private StringUtils() {}

    public boolean isDirectoryPath(String path) {
        return path.endWith("/");
    }

}
 */

fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}
