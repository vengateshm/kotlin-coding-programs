package network_call

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URI

fun main() {
    val url = "https://catfact.ninja/fact"
    try {
        val toURL = URI.create(url).toURL()
        val connection = toURL.openConnection() as HttpURLConnection

        connection.requestMethod = "GET"

        val responseCode = connection.responseCode
        println("Response code $responseCode")

        if (responseCode == HttpURLConnection.HTTP_OK) {
            val reader = BufferedReader(InputStreamReader(connection.inputStream))
            var line: String?
            val response = StringBuilder()
            while (reader.readLine().also {
                    line = it
                } != null) {
                response.append(line)
            }
            reader.close()
            println("Response :")
            println(response)
        }
        connection.disconnect()
    } catch (e: Exception) {
        e.printStackTrace()
    }
}