package apps.studios.bt.studentlink.utilities

class DataRepository() {


    //==================== sample data section =======================
    companion object {

        @JvmStatic
        fun sampleInstitutions() =
            mutableListOf(
                "Rhodes University", "University of Pretoria", "University of Cape Town"
            )

        @JvmStatic
        fun sampleCourses(name: String): MutableList<String> {
            return when (name) {
                "Rhodes University" ->
                    mutableListOf(
                        "Accounting",
                        "Biochemistry",
                        "Chemistry",
                        "Entomology"
                    )

                "University of Pretoria" ->
                    mutableListOf(
                        "Physics",
                        "Mechanical Engineering",
                        "Computer Science",
                        "Information Systems"
                    )
                else -> mutableListOf(
                    "General Relativity",
                    "Quantum Mechanics",
                    "Machine Learning",
                    "Data Analysis",
                    "Pure Mathematics"
                )
            }
        }
    }
}