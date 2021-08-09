object caesarcipher extends App{

    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    val e=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
    val d=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+a.size-key)%a.size)

    val cipher= (algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,alphabet))

    print("Enter shift value :-")
    val key = scala.io.StdIn.readInt()
    print("Enter your message :- ")
    val message = scala.io.StdIn.readLine()
    
    val ct=cipher(e,message,key,alphabet)
    val dt=cipher(d,ct,key,alphabet)

    println(s"Your encrypted message is ${ct}")
    println(s"Your decrypted message is ${dt}")


}
