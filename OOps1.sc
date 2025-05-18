val DefaultCrustSize = 12
val DefaultCrustType = "THIN"

// the primary constructor
class Pizza (var crustSize: Int, var crustType: String) {

    // one-arg auxiliary constructor
    def this(crustSize: Int) = {
        this(crustSize, DefaultCrustType)
    }

    // one-arg auxiliary constructor
    def this(crustType: String) = {
        this(DefaultCrustSize, crustType)
    }

    // zero-arg auxiliary constructor
    def this() = {
        this(DefaultCrustSize, DefaultCrustType)
    }

    override def toString = s"A $crustSize inch pizza with a $crustType crust"

}

val p1 = new Pizza(DefaultCrustSize, DefaultCrustType)
val p2 = new Pizza(14,"Thick")
val p3 = new Pizza(DefaultCrustType)
val p4 = new Pizza
println(p1.toString)
println(p2.toString)
println(p3.toString)
println(p4.toString)
