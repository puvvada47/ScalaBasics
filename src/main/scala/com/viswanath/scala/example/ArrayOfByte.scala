package com.viswanath.scala.example

object ArrayOfByte {
  def main(args: Array[String]): Unit = {
    import java.nio.charset.StandardCharsets
    val example = "This is raw text!"
    // string to byte[]
    val bytes: Array[Byte] = example.getBytes

    System.out.println("Text : " + example)
    System.out.println("Text [Byte Format] : " + bytes)

    // no, don't do this, it returns the address of the object in memory
    //System.out.println("Text [Byte Format] toString() : " + bytes.toString)

    // convert byte[] to string
    val s = new String(bytes, StandardCharsets.UTF_8)
    System.out.println("Output : " + s)
  }

}
