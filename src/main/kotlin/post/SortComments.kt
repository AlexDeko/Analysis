package post

class SortComments {


    private companion object fun setChecked(isCheckId: Long): String{

        return when(isCheckId){
            1L -> "Старые"
            2L -> "Новые"
            else -> "Самые интересные"
        }
    }
}