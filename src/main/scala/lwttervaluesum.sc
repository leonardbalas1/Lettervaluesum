val str = "abcd"

val ltn = (for (i <- (0 to 25)) yield (('a'.toInt + i).toChar, i + 1)).toMap
val result =   str.map(c => ltn(c)).sum

