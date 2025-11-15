package rs.smobile.catsvsdogs

import android.content.Context
import java.io.File

fun Context.copyAssetToInternalStorage(assetName: String): String {
    val outFile = File(filesDir, assetName)
    if (outFile.exists()) return outFile.absolutePath

    assets.open(assetName).use { input ->
        outFile.outputStream().use { output ->
            input.copyTo(output)
        }
    }

    outFile.setReadable(true, false)
    return outFile.absolutePath
}
