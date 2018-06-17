package ostalo.pocetnica

open class Matematika constructor(imePolja: String,
                                  brojTeorema: Int,
                                  brojProblematicnihTeorema: Int){
    init {
        require(brojTeorema > 0) {"Broj teorema mora biti veci od 0!"}
    }
}
